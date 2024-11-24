import java.io.Serializable;
import java.util.Date;

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

    public Flight flightSearch(Airport dearture_Airport, Airport arrival_Airport, Date departure_Date, Date arrival_Date){
        return new Flight();
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
