package com.netcracker.lookupMethod;

public class Car {

    public Passenger createPassenger(){
        return null;
    }

    public String getPassengerIn(String name){
        Passenger passenger = createPassenger();
        passenger.setName(name);
        return passenger.getName()+" in the car now.";
    }
}
