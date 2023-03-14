package prog2.exercise5.flight.booking.system;

import java.util.Scanner;
import java.time.LocalDate;

public class Main
{
    public static void main( String[] args )
    {


        Scanner input = new Scanner(System.in);

        int size = 3;
        for(int i=0;i<size;i++){

        System.out.println("Please enter your full name:");

        String passengerFullName = input.next();

        System.out.println("Please enter your departure date: ");

        String departureDate = input.next();

        System.out.println("Please enter your return date:");

        String returnDate = input.next();

        System.out.println("Please enter number of children:");

        int childPassengers = input.nextInt();

        System.out.println("Please enter number of adults:");

        int adultPassengers = input.nextInt();

        System.out.println("1. First\n2. Bussiness\n3. Economy\nPlease choose your booking class(input the number):");

        String a = input.next();

        System.out.println("1. One way\n2. Return\nPlease choose your trip type(input the number):");

        String b = input.next();

        System.out.println("1. Nanjing\n2. Beijing\n3. Shanghai\n4. Oulu\n5. Helsinki\n6. Paris\nPlease choose your trip source(input the number):");

        String c = input.next();

        System.out.println("1. Nanjing\n2. Beijing\n3. Shanghai\n4. Oulu\n5. Helsinki\n6. Paris\nPlease choose your trip destination(input the number):");

        String d = input.next();

        LocalDate departureDate1 = LocalDate.parse(departureDate);

        LocalDate returnDate1 = LocalDate.parse(returnDate);

        FlightBooking flightBooking1 = new FlightBooking(passengerFullName,departureDate1,returnDate1,childPassengers,adultPassengers);

        flightBooking1.setTotalTicketPrice();

        flightBooking1.setTotalPassengers(childPassengers,adultPassengers);

        flightBooking1.setBookingClass(a);

        flightBooking1.setTripType(b);

        flightBooking1.setTripSource(c);
        flightBooking1.setSourceAirport(c);

        flightBooking1.setTripDestination(c,d);

        flightBooking1.setTicketNumber(i);

        flightBooking1.setDepartureDate(departureDate1);

        flightBooking1.setReturnDate(returnDate1);

        flightBooking1.setDepartingTicketPrice(childPassengers, adultPassengers);

        flightBooking1.setReturnTicketPrice();

        flightBooking1.setTotalTicketPrice();

        flightBooking1.setFlightID();
        }
        System.out.println("You reserved a total of "+size+" tickets.");




    }
}
