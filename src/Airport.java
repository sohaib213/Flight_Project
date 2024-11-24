import java.io.Serializable;

public class Airport implements Serializable {
    private int Airport_code;
    private String Airport_Name;
    private String location;

    public int getAirport_code() {
        return Airport_code;
    }

    public void setAirport_code(int airport_code) {
        Airport_code = airport_code;
    }

    public String getAirport_Name() {
        return Airport_Name;
    }

    public void setAirport_Name(String airport_Name) {
        Airport_Name = airport_Name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Airport(int airport_code, String airport_Name, String location) {
        Airport_code = airport_code;
        Airport_Name = airport_Name;
        this.location = location;
    }
    public Airport() {

    }
}
