package com.example.flight.controller;

import com.example.flight.model.Flight;
import com.example.flight.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestControllerff
@RequestMapping(value = "/flight")
public class FlightController {

    @Autowired
    FlightService flightService;

    @GetMapping(value = "")
    public List<Flight>  getAllFlights(){
        return flightService.getAllFlights();
    }
    @PostMapping(value ="")
    public Flight saveFlight(@RequestBody Flight flight){
        return flightService.saveFlight(flight);
    }

    /**
    @GetMapping(value = "/id")
    public Flight getFlightByIdQueryParam(@RequestParam(name = "id")Integer id){
        return flightService.getFlight(id);
    }
     */

    @GetMapping(value = "/{id}")
    public Flight getFLightById(@PathVariable("id")Integer id){
        return flightService.getFlight(id);
    }



}
