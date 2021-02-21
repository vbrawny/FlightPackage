package com.dummy.Flightpackage;

// A class describes and comprises the state of an object.
// it has
// variables(to hold the individual state),
// methods(to operate and manipulate the state within variables) and
// constructors(to run the initial setup as simple as initialization)
public class Flight {

    //Fields store the object state.
    private int passengers;
    private int seats;
    private String flightName;
    private int freeBags;
    private int checkedBags;
    private double bagFee;

    private boolean[] isSeatsAvailable = new boolean[seats];

    //another way of initialization through initialization blocks

    {
        for(int i=0;i<seats;i++){
            isSeatsAvailable[i]=true;
        }
    }

    private Flight(int freebags,int checkedbags) {
        this(freebags>1?0.05d:0.25d);
        checkedBags = checkedbags;
    }

    //Constructor -
    //Executable code to run automatically during the object creation.
    //Sets classes initial state.
    public Flight(String flightname,int freebags,int checkedbags) {
        this(freebags,checkedbags);
        passengers=0;
        seats=150;
        flightName = flightname;
        freeBags = freebags;
    }

    private Flight(double bagfee){
        bagFee = bagfee;
    }

    //Encapsulation -
    // accessor - mutator method
    // ACCESSOR/GETTER - GET FIELD NAME
    // SETTER/MUTATOR - SET FIELD NAME
    // Accessors and Mutators - used to encapsulate the state inside classes
    public int getSeats() {
        return seats;
    }

//    public boolean getIsSeatAvailable() {
//        return isSeatsAvailable[0];
//    }

    public void setIsSeatAvailable(int seat) {
        this.isSeatsAvailable[seat]= true;
    }

    public void setSeats(int seats){
        //<IMP> this keyword usage 
        //we used this here as the compiler consider left handside seats as not class variable instead parameter variable
        //so implicitly instead of asssigning classvariable = constructor parameter
        //it will be constructor parameter = constructor paramter, which is wrong
        //thats why we need to be explicitly add "this" keyword,(one important pattern for the usage of this keyword)
        this.seats = seats;
    }

    //Methods
    //executable code to manipulate state and perform operations.
    public void add1Passenger() {
        if(passengers<seats) {
            passengers +=1;
            System.out.println(flightName + " - number of passengers booked: "+ passengers);
            System.out.println(flightName + " - total seats left : "+ (seats-passengers));
            System.out.println(flightName + " - freebags : "+ freeBags);
            System.out.println(flightName + " - checkedbags : "+ checkedBags);
            System.out.println(flightName + " - bagFee : "+ bagFee);
        }
        else {
            handleTooMany();
        }
    }

    //Methods
    //executable code to manipulate state and perform operations.
    public boolean hasRoom(Flight alteredflight) {
        int total = this.passengers + alteredflight.passengers;
        return total<=seats;
    }

    //Encapsulated Methods using access modifiers - private
    //executable code to manipulate state and perform operations.
    private void handleTooMany() {
        System.out.println(flightName + " - flight overbooked");
    }

    //Methods
    //executable code to manipulate state and perform operations.
    public Flight createNewWithBoth(Flight combinedflight) {
        this.passengers += combinedflight.passengers;
        return this;
    }
}
