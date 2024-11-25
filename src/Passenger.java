import java.io.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Passenger implements Serializable {

    private String name;
    private String phone;
    private int passenger_ID;

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public int getPassenger_ID() {
        return passenger_ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setPassenger_ID(int passenger_ID) {
        this.passenger_ID = passenger_ID;
    }

    public Passenger(String name, String phone, int passenger_ID) {
        this.name = name;
        this.phone = phone;
        this.passenger_ID = passenger_ID;
    }
    public Passenger() {
    }

    public Flight []flightSearch(String dearture_Airport, String arrival_Airport, Date departure_Date, Date arrival_Date) throws IOException, ClassNotFoundException {

        File file = new File("Flights.txt");
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
        } catch (IOException e) {
            System.out.println("Cant't Find Flights.txt");
        }
        assert ois != null;
        Flight [] flights = (Flight[]) ois.readObject();
        int n = 0;

        // loop to calculate number of flights filtered
        for(int i = 0; i < flights.length; i++){
            if(((dearture_Airport.equals(flights[i].getDeapartureAirport().getAirport_Name())) ||
                    (dearture_Airport.equals("All"))) &&
                    ((arrival_Airport.equals(flights[i].getArrivalAirport().getAirport_Name())) ||
                            (arrival_Airport.equals("All"))) &&
                    ((Objects.equals(departure_Date, flights[i].getDepartureTime())) ||
                       (Objects.equals(departure_Date, new Date(0,Calendar.JANUARY, 0, 0, 0)))) &&
               ((Objects.equals(arrival_Date, flights[i].getArrivalTime())) ||
                       (Objects.equals(arrival_Date, new Date(0,Calendar.JANUARY, 0, 0, 0)))))
            {
                n++;
            }

        }
        System.out.println(n);
        Flight [] flightsToken = new Flight[n];
        int counter = 0;
        // loop to make new array and assigned to it the flights filtered
        for(int i = 0; i < flights.length; i++){
            if(((dearture_Airport.equals(flights[i].getDeapartureAirport().getAirport_Name())) ||
                    (dearture_Airport.equals("All"))) &&
                    ((arrival_Airport.equals(flights[i].getArrivalAirport().getAirport_Name())) ||
                            (arrival_Airport.equals("All"))) &&
                    ((Objects.equals(departure_Date, flights[i].getDepartureTime())) ||
                            (Objects.equals(departure_Date, new Date(0,Calendar.JANUARY, 0, 0, 0)))) &&
                    ((Objects.equals(arrival_Date, flights[i].getArrivalTime())) ||
                            (Objects.equals(arrival_Date, new Date(0,Calendar.JANUARY, 0, 0, 0)))))
            {
                flightsToken[counter] = flights[i];
                counter++;
            }
        }
        return flightsToken;
    }

    public void flight_Selection(Flight flight){

    }

    public void seat_Selection(Seat seat){

    }

    public void user_Information(){

    }

    public void manage_Booking(){

    }

}
