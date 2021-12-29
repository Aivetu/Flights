package com.example.flight.controller;

import com.example.flight.apimodel.CreatePassengerRequest;
import com.example.flight.model.Passenger;
import com.example.flight.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/passenger")
public class PassengerController {

    @Autowired
    PassengerService passengerService;

    @GetMapping(value = "")
    public List<Passenger> getAllPassengers() {
        return passengerService.getAllPassengers();
    }

    @GetMapping(value = "/{id}")
    public Passenger getPassengerById(@PathVariable ("id") Integer id){

        return passengerService.getPassengerById(id);
    }

    @PostMapping(value = "")
    public Passenger savePassenger(@RequestBody CreatePassengerRequest request )throws Exception{
        return passengerService.savePassenger(request);
    }


}
