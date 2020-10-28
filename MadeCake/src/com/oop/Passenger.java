package com.oop;

public class Passenger {

    private String passengerName;

    public static int numberOfPassengers = 1;

    private Passenger(String passengerName) {
        this.passengerName = passengerName;
        numberOfPassengers ++;
    }

    public static Passenger makeMember(String newMemberName){

        Passenger tempPassenger;

        if(numberOfPassengers > 10){

            tempPassenger = null;
            System.out.println("Get off the bus, COVID-19 social distancing");
        }
        else{
            tempPassenger = new Passenger("newMemberName");
        }
        return tempPassenger;
    }

}
