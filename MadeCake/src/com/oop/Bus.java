package com.oop;

public class Bus {

    public static void main(String[] args) {


        Passenger passenger1 = Passenger.makeMember("A10");
        Passenger passenger2 = Passenger.makeMember("B9");
        Passenger passenger3 = Passenger.makeMember("C8");
        Passenger passenger4 = Passenger.makeMember("D7");
        Passenger passenger5 = Passenger.makeMember("E6");
        Passenger passenger6 = Passenger.makeMember("F5");
        Passenger passenger7 = Passenger.makeMember("G4");
        Passenger passenger8 = Passenger.makeMember("H3");
        Passenger passenger9 = Passenger.makeMember("I2");
        Passenger passenger10 = Passenger.makeMember("J1");
        //Passenger passenger11 = Passenger.makeMember("K0");

        System.out.println(Passenger.numberOfPassengers);
    }

}
