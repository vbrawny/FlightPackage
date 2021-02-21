package com.dummy.Flightpackage;

// A class describes and comprises the state of an object.
// it has
// variables(to hold the individual state),
// methods(to operate and manipulate the state within variables) and
// constructors(to run the initial setup as simple as initialization)
public class Flight {

    int passengers;
    int seats;

    Flight() {
        passengers=0;
        seats=150;
    }

    void add1Passenger() {
        if(passengers<seats) {
            passengers +=1;
        }
        System.out.println("number of passengers booked: "+ passengers);
        System.out.println("total seats left : "+ (seats-passengers));
    }
}
