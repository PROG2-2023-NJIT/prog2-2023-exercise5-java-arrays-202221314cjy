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

        FlightBooking fb = new FlightBooking();

        fb.setTotalTicketPrice();

        fb.setTotalPassengers(childPassengers,adultPassengers);

        fb.setBookingClass(a);

        fb.setTripType(b);

        fb.setTripSource(c);
        fb.setSourceAirport(c);

        fb.setTripDestination(c,d);

        fb.setTicketNumber(i);

        fb.setDepartureDate(departureDate1);

        fb.setReturnDate(returnDate1);

        fb.setDepartingTicketPrice(childPassengers, adultPassengers);

        fb.setReturnTicketPrice();

        fb.setTotalTicketPrice();

        fb.setFlightID();
        }
        System.out.println("You reserved a total of "+size+" tickets.");




    }
}
