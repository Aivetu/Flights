package com.example.flight.model;



import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String destination;
    private Date departureTime;

    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }
}
