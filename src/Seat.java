import java.io.Serializable;
public class Seat implements Serializable {
    private int seatNumber;
    private String seatClass;
    private boolean seatStatus;
    private Flight flight;

    public Seat(int seatNumber,String seatClass,boolean seatStatus){
        this.seatNumber=seatNumber;
        this.seatStatus=seatStatus;
        this.seatClass=seatClass;
    }
}