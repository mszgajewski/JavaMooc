package FlightControl.logic;

import FlightControl.domain.Airplane;
import FlightControl.domain.Flight;
import FlightControl.domain.Place;

import java.util.Collection;
import java.util.HashMap;

public class FlightControl {

    private HashMap<String, Airplane> airplanes;
    private HashMap<String, Flight> flights;
    private HashMap<String, Place> places;

    public FlightControl(){
        this.airplanes = new HashMap<>();
        this.flights = new HashMap<>();
        this.places = new HashMap<>();
    }

    public void addAirplane(String id,int capacity) {
        Airplane airplane = new Airplane(id,capacity);
        this.airplanes.put(id,airplane);
    }

    public void addFlight(Airplane airplane,String departureID, String arrivalID){
        this.places.putIfAbsent(departureID,new Place(departureID));
        this.places.putIfAbsent(arrivalID,new Place(arrivalID));

        Flight flight = new Flight(airplane,this.places.get(departureID), this.places.get(arrivalID));
        this.flights.put(flight.toString(),flight);
    }

    public Collection<Airplane> getAirplanes() {
        return airplanes.values();
    }

    public Collection<Flight> getFlights() {
        return flights.values();
    }

    public Airplane getAirplane(String ID) {
        return this.airplanes.get(ID);
    }
}