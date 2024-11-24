public abstract class Admin {
    private Passenger [] passengers;
    private Airport [] airpots;

    public abstract void addFlights(Flight flight);
    public abstract void addAirports();
    public abstract void update_Flight_Schedule(Flight flight);
}