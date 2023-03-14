package prog2.exercise5.flight.booking.system;

import java.time.LocalDate;

public class FlightBooking {


    private String flightCompany = "Flights-of-Fancy";
    private String flightID;
    private String passengerFullName[];
    private String passengerGender[];
    private int passengerAge[];
    private LocalDate departureDate;
    private LocalDate returnDate;
    private int childPassengers;
    private int adultPassengers;
    private int totalPassengers;
    private double totalTicketPrice ;
    private String ticketNumber[];
    private String c;
    private String d;
    private int date;
    public enum BookingClass {
        FIRST, BUSSINESS, ECONOMY
    }
    public enum TripType {
        ONE_WAY,RETURN
    }
    public enum TripSource {
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI,PARIS
    }
    public enum TripDestination {
        NANJING, BEIJING, SHANGHAI, OULU, HELSINKI,PARIS
    }
    public enum SourceAirport {
        NANJING_LUKOU_INTERNATIONAL_AIRPORT, BEIJING_CAPITAL_INTERNATIONAL_AIRPORT, SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT, OULU_AIRPORT, HELSINKI_AIRPORT,PARIS_CHARLES_DE_GAULLE_AIRPORT
    }
    public enum DestinationAirport {
        NANJING_LUKOU_INTERNATIONAL_AIRPORT, BEIJING_CAPITAL_INTERNATIONAL_AIRPORT, SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT, OULU_AIRPORT, HELSINKI_AIRPORT,PARIS_CHARLES_DE_GAULLE_AIRPORT
    }
    private BookingClass bookingClass;
    private TripType tripType;
    private TripSource tripSource;
    private TripDestination tripDestination;
    private SourceAirport sourceAirport;
    private DestinationAirport destinationAirport;
    private double bookingClassCharge;
    private double basePrice = 300;
    private double taxes;
    private double serviceFees;
    private double departingTicketPrice;
    private double returnTicketPrice;
    private int size;
    public FlightBooking(){}
    public FlightBooking(int size){
        this.size=size;
        passengerFullName=new String[size];
        passengerGender=new String[size];
        passengerAge=new int[size];
        ticketNumber=new String[size];
    }
    //public FlightBooking(String passengerFullName, LocalDate departureDate, LocalDate returnDate, int childPassengers, int adultPassengers) {
        //this.passengerFullName = passengerFullName;
        //this.departureDate = departureDate;
        //this.returnDate = returnDate;
       // this.childPassengers = childPassengers;
        //this.adultPassengers = adultPassengers;
        //this.totalPassengers = childPassengers + adultPassengers;

    //}


    public String getFlightCompany() {
        return flightCompany;
    }
    public void setFlightCompany(String flightCompany)
    {
        this.flightCompany=flightCompany;
    }
    public String getFlightID() {
        return flightID;
    }

    public String getPassengerFullName(int i) {
        return passengerFullName[i];
    }

    public void setPassengerFullName(int i,String passengerFullName) {
        this.passengerFullName[i] = passengerFullName;
    }
    public String getPassengerGender(int i){
        return passengerGender[i];
    }
    public void setPassengerGender(int i,String passengerGender){
        this.passengerGender[i] = passengerGender;
    }
    public int getPassengerAge(int i){
        return passengerAge[i];
    }
    public void setPassengerAge(int i,int passengerAge){
        this.passengerAge[i]=passengerAge;
    }
    public TripSource getTripSource() {
        return tripSource;
    }

    public SourceAirport getSourceAirport() {
        return sourceAirport;
    }

    public TripDestination getTripDestination() {
        return tripDestination;
    }

    public DestinationAirport getDestinationAirport() {
        return destinationAirport;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }


    public LocalDate getReturnDate() {
        return returnDate;
    }

    public int getChildPassengers() {
        return childPassengers;
    }

    public void setChildPassengers(int childPassengers) {
        this.childPassengers = childPassengers;

    }

    public int getAdultPassengers() {
        return adultPassengers;
    }

    public void setAdultPassengers(int adultPassengers) {
        this.adultPassengers = adultPassengers;

    }

    public int getTotalPassengers() {
        totalPassengers = childPassengers + adultPassengers;
        return totalPassengers;
    }



    public void setTotalPassengers(int childPassengers,int adultPassengers){
        this.totalPassengers = childPassengers + adultPassengers;
    }


    public void setFlightID(){
        this.flightID = "CJY541138" ;
    }

    public void setBookingClass(String a)
    {
        switch(a)
        {
            case "1" : bookingClass = BookingClass.FIRST;
                bookingClassCharge = 250;
                break;
            case "2" : bookingClass = BookingClass.BUSSINESS;
                bookingClassCharge = 150;
                break;
            case "3" : bookingClass = BookingClass.ECONOMY;
                bookingClassCharge = 50;
                break;
        }
    }

    public void setTripType(String b){
        switch(b){
            case "1" :tripType = TripType.ONE_WAY;
                break;
            case "2" :tripType = TripType.RETURN;
                break;
        }
    }
    public void setSourceAirport(String c){
        switch (c){
            case "1" : sourceAirport = SourceAirport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
                break;
            case "2" : sourceAirport = SourceAirport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
                break;
            case "3" : sourceAirport = SourceAirport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT;
                break;
            case "4" : sourceAirport = SourceAirport.OULU_AIRPORT;
                break;
            case "5":  sourceAirport=SourceAirport.HELSINKI_AIRPORT;
                break;
            case "6":  sourceAirport=SourceAirport.PARIS_CHARLES_DE_GAULLE_AIRPORT;
                break;
        }
    }
    public void setTripSource(String c){
        switch(c){
            case "1" :tripSource = TripSource.NANJING;
                break;
            case "2" :tripSource = TripSource.BEIJING;
                break;
            case "3" :tripSource = TripSource.SHANGHAI;
                break;
            case "4" :tripSource = TripSource.OULU;
                break;
            case "5": tripSource = TripSource.HELSINKI;
                break;
            case "6": tripSource=TripSource.PARIS;
                break;
        }
    }
    public void setTripDestination(String c ,String d){
        switch(d){
            case "1" :tripDestination = TripDestination.NANJING;
                break;
            case "2" :tripDestination = TripDestination.BEIJING;
                break;
            case "3" :tripSource = TripSource.SHANGHAI;
                break;
            case "4" :tripSource = TripSource.OULU;
                break;
            case "5": tripSource = TripSource.HELSINKI;
                break;
            case "6": tripSource=TripSource.PARIS;
                break;
        }
    }
    public void setDestinationAirport(String c,String d){
        switch(d){
            case "1" : destinationAirport = DestinationAirport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
                break;
            case "2" : destinationAirport = DestinationAirport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
                break;
            case "3" : sourceAirport = SourceAirport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT;
                break;
            case "4" : sourceAirport = SourceAirport.OULU_AIRPORT;
                break;
            case "5":  sourceAirport=SourceAirport.HELSINKI_AIRPORT;
                break;
            case "6":  sourceAirport=SourceAirport.PARIS_CHARLES_DE_GAULLE_AIRPORT;
                break;
        }
    }
    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate ;
    }
    public void setReturnDate(LocalDate returnDate){
        LocalDate expect = departureDate.plusDays(2);
        if(returnDate.isBefore(expect)){
            this.returnDate = expect;
            date = 0;
        }
        else {this.returnDate = returnDate;
            date = 1;
        }
    }

    public void setTicketNumber(int i){
        for(i=0;i<size;i++){
        this.ticketNumber[i]= "22ECJYSINT";
        }
    }
    public String getTicketNumber(int i){
        return this.ticketNumber[i];
    }
    public double  getDepartingTicketPrice()
    {
        return departingTicketPrice;
    }
    public void setDepartingTicketPrice(int childPassengers,int adultPassengers){

            taxes = 0.15 * 300;
            serviceFees = 0.1 * 300;
        departingTicketPrice = (basePrice + taxes + serviceFees)*(childPassengers + adultPassengers) + bookingClassCharge ;
    }
    public double  getReturnTicketPrice()
    {
        return returnTicketPrice;
    }
    public void setReturnTicketPrice(){
        returnTicketPrice = departingTicketPrice;
    }

    public void setTotalTicketPrice(){
        totalTicketPrice = returnTicketPrice + departingTicketPrice;
    }
    public double getTotalTicketPrice(){

        return totalTicketPrice;
    }
    public String toString()
    {

        return
                "Dear " + passengerFullName + ". Thank you for booking your flight with " +
                        flightCompany + ". Following are the details of your booking and the trip:" + "\n" +
                        "Ticket Number: " + ticketNumber + "\n" +
                        "From " + tripSource + " to " + tripDestination + "\n" +
                        "Date of departure: " + departureDate + "\n" +
                        "Date of return: " + returnDate + "\n" +
                        "Total passengers: " + totalPassengers + "\n" +
                        "Total ticket price in Euros: " + totalTicketPrice;

    }
    public void displayTripDetails(int size)
    {
        System.out.println("Thank you for booking your flight with " + flightCompany +"\n"+
                "You reserved a total of "+ size +" tickets.");
        for(int i=0;i<size;i++)
        {
            System.out.println(
                    "Here are the trip details for Passenger No." + i +"\n" +
                            "Passenger's Ticket Number: " + ticketNumber[i] + "\n" +
                            "Passenger Name:" + passengerFullName[i] + "\n" +
                            "Passenger Age:" + passengerAge[i] + "\n" +
                            "Passenger Gender:" + passengerGender[i] + "\n" +
                            "From " + tripSource + "("+ sourceAirport +")"+"\n" +
                            "To " + tripDestination + "("+ destinationAirport +")"+"\n" +
                            "The flight departs on: " + departureDate + "\n" +
                            "And the return flight is on: " + returnDate + "\n" );

        }
        System.out.println("The total ticket price is: "+totalTicketPrice);
        System.out.println("IMPORTANT NOTICE: As per our policy, the return date was changed because it was less than two days apart from your departure date.");
    }
}
