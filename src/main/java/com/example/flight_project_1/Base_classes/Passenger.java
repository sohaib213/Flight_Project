package com.example.flight_project_1.Base_classes;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;

public class Passenger implements Serializable {

    private String name;
    private String phone;
    private String password;
    private final int passenger_ID;
    private static int counterPassId;
    private ArrayList<Ticket> tickets = new ArrayList<>();
    private double pocket = 30000;

    public static void setCounterPassId(int counterPassId) {
        Passenger.counterPassId = counterPassId;
    }

    public static int getCounterPassId() {
        return counterPassId;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    public double getPocket() {
        return pocket;
    }

    public void setPocket(double pocket) {
        this.pocket = pocket;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getPassenger_ID() {
        return String.valueOf(passenger_ID);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password){this.password = password;}

    public Passenger(String name, String phone,String password) {
        this.name = name;
        this.phone = phone;
        this.passenger_ID = ++counterPassId;
        this.password = password;
    }
    public Passenger() {
        passenger_ID = ++counterPassId;
    }

    public static ArrayList<Flight> flightSearch(String dearture_Airport, String arrival_Airport, int departure_Date_year, int departure_Date_month, int departure_Date_day, int arrival_Date_year, int arrival_Date_month, int arrival_Date_day) throws IOException, ClassNotFoundException {

        // check of finished flights
        Date date = new Date();
        for(int i = 0; i < Files.getFlights().size(); i++)
        {
            if(date.after(Files.getFlights().get(i).getArrivalTime())) {
                Files.getFlights().get(i).setFinished(true);
                ArrayList<Ticket> ticketsBack = new ArrayList<>();
                for (int j = 0; j < Files.getFlights().get(i).getPassengers().size(); j++)
                {
                    Passenger passenger = null;
                    for(int k = 0; k < Files.getPassengers().size(); k++)
                    {
                        if(Files.getPassengers().get(k).getPassenger_ID().equals(Files.getFlights().get(i).getPassengers().get(j).getPassenger_ID()))
                            passenger = Files.getPassengers().get(k);
                    }
                    for (int k = 0; k < passenger.getTickets().size(); k++)
                    {
                        Ticket ticket = passenger.getTickets().get(k);
                        if(ticket.getBookingTicket().getFlight().getFlightNumber() == Files.getFlights().get(i).getFlightNumber())
                        {
                            ticketsBack.add(ticket);
                        }
                    }
                    for (int k = 0; k < ticketsBack.size(); k++) {
                        passenger.getTickets().remove(ticketsBack.get(k));
                    }
                }
            }
        }

        ArrayList<Flight> flightsToken = new ArrayList<>();
        int counter = 0;
        // loop to make new array and assigned to it the flights filtered
            for (int i = 0; i < Files.getFlights().size(); i++) {
                if (((dearture_Airport.equals(Files.getFlights().get(i).getDeapartureAirport().getAirport_Name())) || (dearture_Airport.equals("~All~")))
                        &&
                        ((arrival_Airport.equals(Files.getFlights().get(i).getArrivalAirport().getAirport_Name())) || (arrival_Airport.equals("~All~")))
                        &&
                        (((departure_Date_year == Files.getFlights().get(i).getDepartureTime().getYear() + 1900) && (departure_Date_month ==  Files.getFlights().get(i).getDepartureTime().getMonth() + 1) && (departure_Date_day ==  Files.getFlights().get(i).getDepartureTime().getDate())) ||
                        ((departure_Date_year == 0) && (departure_Date_month == 0) && (departure_Date_day == 0))
                        )
                        &&
                        (((arrival_Date_year == Files.getFlights().get(i).getArrivalTime().getYear() + 1900) && (arrival_Date_month ==  Files.getFlights().get(i).getArrivalTime().getMonth() + 1) && (arrival_Date_day ==  Files.getFlights().get(i).getArrivalTime().getDate())) ||
                        ((arrival_Date_year == 0) && (arrival_Date_month == 0) && (arrival_Date_day == 0))
                        && !Files.getFlights().get(i).isFinished()
                        )

                ) {
                    flightsToken.add(Files.getFlights().get(i));
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
