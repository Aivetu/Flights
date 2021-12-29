package com.example.flight.service;

import com.example.flight.apimodel.CreatePassengerRequest;
import com.example.flight.model.Flight;
import com.example.flight.model.Passenger;
import com.example.flight.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PassengerService {
    @Autowired
    PassengerRepository passengerRepository;

    @Autowired
    FlightService flightService;

    public List<Passenger> getAllPassengers(){
        return passengerRepository.findAll();
    }
    public Passenger getPassengerById(int id){
        Optional<Passenger> optional = passengerRepository.findById(id);
        return optional.isPresent()  ? optional.get() : null;
    }
    public Passenger savePassenger(CreatePassengerRequest request)throws Exception{
        Flight flight = flightService.getFlight(request.getFlightId());
        if(flight==null){
            throw new Exception("Flight does not exist");
        }
        Passenger passenger = new Passenger();
        passenger.setAge(request.getAge());
        passenger.setFirstName(request.getFirstName());
        passenger.setLastName(request.getLastName());
        passenger.setFlight(flight);
        return passengerRepository.save(passenger);

    }
}
