import java.io.*;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException {
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




        Flight flight1 = new Flight(1, airport2, airport1, new Date(2024 - 1900, Calendar.NOVEMBER, 4, 6, 0),
                new Date(2024 - 1900, Calendar.NOVEMBER, 4, 8, 0), seats, passengers);

        Flight flight2 = new Flight(2, airport2, airport3, new Date(2024 - 1900, Calendar.NOVEMBER, 5, 6, 0),
                new Date(2024 - 1900, Calendar.NOVEMBER, 5, 8, 0), seats, passengers);

        Flight flight3 = new Flight(3, airport3, airport1, new Date(2024 - 1900, Calendar.NOVEMBER, 6, 6, 0),
                new Date(2024 - 1900, Calendar.NOVEMBER, 6, 8, 0), seats, passengers);


        File file = null;
        try {
            file = new File("Flights.txt");
        }catch (Exception e){
            System.out.println("Can't Find Flights file");
        }
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(flight1);
        oos.writeObject(flight2);
        oos.writeObject(flight3);

        oos.flush();
        oos.close();

    }
}