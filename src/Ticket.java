public abstract class Ticket {
    private int ticketName;
    private double fare;
    private boolean ticketStatus;
    private Booking bookingTicket;

    public Ticket(int ticketName,double fare,boolean ticketStatus){
        this.ticketName=ticketName;
        this.ticketStatus=ticketStatus;
        this.fare=fare;
    }
}