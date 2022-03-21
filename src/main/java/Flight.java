import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private int availableSeats;

    public Flight(Pilot pilot, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime, int availableSeats) {
        this.pilots = new ArrayList<>();
        this.cabinCrewMembers = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.availableSeats = availableSeats;
    }

    public int getPilot(Pilot pilot) {
        return 3;
    }

    public void addPilot(Pilot pilot) {
        this.pilots.add(pilot);
    }

    public int countPilots(Pilot pilot) {
        return this.pilots.size();
    }

    public void addCabinCrewMember(CabinCrewMember cabinCrewMember) {
        this.cabinCrewMembers.add(cabinCrewMember);
    }

    public int cabinCrewMemberSize() {
        return this.cabinCrewMembers.size();
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getFlightDestination() {
        return destination;
    }

    public int availableSeats() {
        return this.availableSeats;
    }

    public void addPassenger(Passenger passenger) {
        if(availableSeats >= 1) {
            this.passengers.add(passenger);
        }

    }

    public int countPassenger() {
        return this.passengers.size();
    }
}