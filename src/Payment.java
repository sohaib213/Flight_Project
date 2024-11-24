public abstract class Payment {
    private int paymentID;
    private double paymentAmount;
    private String paymentMethod;
    private boolean paymentStatus;
//   private Booking bookingPayment;

    public Payment(int paymentID,double paymentAmount, String paymentMethod){
        this.paymentID=paymentID;
        this.paymentMethod=paymentMethod;
        this.paymentAmount=paymentAmount;
    }
    public abstract void Pricing_Payment();
}