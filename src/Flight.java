import java.io.Serializable;
import java.util.Date;

public class Flight implements Serializable {
    private int FlightNumber;
    private Airport deapartureAirport;
    private Airport arrivalAirport;
    private Date departureTime;
    private Date arrivalTime;
    private Seat []seats;
    private Passenger passengers[];

    public int getFlightNumber() {
        return FlightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        FlightNumber = flightNumber;
    }

    public Airport getDeapartureAirport() {
        return deapartureAirport;
    }

    public void setDeapartureAirport(Airport deapartureAirport) {
        this.deapartureAirport = deapartureAirport;
    }

    public Airport getArrivalAirport() {
        return arrivalAirport;
    }

    public void setArrivalAirport(Airport arrivalAirport) {
        this.arrivalAirport = arrivalAirport;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Date getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Date arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public Seat[] getSeats() {
        return seats;
    }

    public void setSeats(Seat[] seats) {
        this.seats = seats;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    public Flight() {
    }

    public Flight(int flightNumber, Airport arrivalAirport, Airport deapartureAirport, Date departureTime,
                  Date arrivalTime, Seat[] seats, Passenger[] passengers)
    {
        FlightNumber = flightNumber;
        this.arrivalAirport = arrivalAirport;
        this.deapartureAirport = deapartureAirport;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.seats = seats;
        this.passengers = passengers;
    }
}
