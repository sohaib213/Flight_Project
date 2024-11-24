public class Booking {
    private int booking_ID;
    private Passenger passenger;
    private Flight flight;
    private Seat seat;
    private String bookingStatus;

    public int getBooking_ID() {
        return booking_ID;
    }

    public void setBooking_ID(int booking_ID) {
        this.booking_ID = booking_ID;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Booking(int booking_ID, Passenger passenger, Flight flight, Seat seat, String bookingStatus) {
        this.booking_ID = booking_ID;
        this.passenger = passenger;
        this.flight = flight;
        this.seat = seat;
        this.bookingStatus = bookingStatus;
    }
    public Booking() {

    }
}
