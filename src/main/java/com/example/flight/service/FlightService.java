package com.example.flight.service;

import com.example.flight.model.Flight;
import com.example.flight.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;

    public List<Flight> getAllFlights(){
        return flightRepository.findAll();
    }

    public Flight getFlight(int id){
        Optional<Flight> optional = flightRepository.findById(id);
        return optional.isPresent() ? optional.get() : null;
    }

    public Flight saveFlight(Flight flight){
        return flightRepository.save(flight);
    }
}
