package com.example.flight.model;

import javax.persistence.*;

@Entity
@Table(name= "passenger")

public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String LastName;
    private int age;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "flight_id",referencedColumnName = "id")
    private Flight flight;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Flight getFlight() {
        return flight;
    }
    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
