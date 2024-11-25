import java.io.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException {

        Airport airport1 = new Airport(1, "Cairo", "Egypt");
        Airport airport2 = new Airport(2, "London", "England");
        Airport airport3 = new Airport(3, "Los Angles", "USA");
        Seat seats[] = new Seat[3];
        seats[0] = new Seat(1, "High", true);
        seats[1] = new Seat(2, "Medium", true);
        seats[2] = new Seat(3, "Low", true);
        Passenger passengers[] = new Passenger[3];
        passengers[0] = new Passenger("Sohaib", "01067700658", 1);
        passengers[1] = new Passenger("Shehab", "01151692506", 2);
        passengers[2] = new Passenger("Tony", "01225641027", 3);
        Flight flights_to_Write[] = new Flight[4];
        flights_to_Write[0] = new Flight(1, airport2, airport1, new Date(2024 - 1900, Calendar.NOVEMBER, 4, 6, 0),
                new Date(2024 - 1900, Calendar.NOVEMBER, 4, 8, 0), seats, passengers);
        flights_to_Write[1] = new Flight(2, airport2, airport3, new Date(2024 - 1900, Calendar.NOVEMBER, 5, 6, 0),
                new Date(2024 - 1900, Calendar.NOVEMBER, 5, 8, 0), seats, passengers);
        flights_to_Write[2] = new Flight(3, airport3, airport1, new Date(2024 - 1900, Calendar.NOVEMBER, 6, 6, 0),
                new Date(2024 - 1900, Calendar.NOVEMBER, 6, 8, 0), seats, passengers);
        flights_to_Write[3] = new Flight(4, airport2, airport1, new Date(2024 - 1900, Calendar.NOVEMBER, 5, 6, 0),
                new Date(2024 - 1900, Calendar.NOVEMBER, 5, 8, 0), seats, passengers);

        File file = new File("Flights.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(flights_to_Write);
        oos.flush();
        oos.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Flight [] flights = (Flight[]) ois.readObject();
        
        Passenger p1 = new Passenger("Abdo", "01001277917", 5);


        Flight []flightsFiltered = p1.flightSearch("Cairo", "London", new Date(0,
                        Calendar.JANUARY, 0, 0, 0),
                new Date(0, Calendar.JANUARY, 0, 0, 0) );

        for(Flight a: flightsFiltered) {
            System.out.println("D-A : " + (a.getDeapartureAirport()).getAirport_Name());
            System.out.println("A-A : " + (a.getArrivalAirport().getAirport_Name()));
            System.out.println("D-D : " + a.getDepartureTime());
            System.out.println("A-D : " + a.getArrivalTime() + '\n');
        }







    }
}