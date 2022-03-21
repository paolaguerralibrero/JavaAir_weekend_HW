import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Pilot pilot;
    private CabinCrewMember cabinCrewMember;
    private Passenger passenger;
    private Plane plane;
    private Pilot pilot2;
    private Pilot pilot3;

    @Before
    public void before(){
        flight = new Flight(pilot, plane, "FR756", "GLA", "BCN", "10", 2);
        this.cabinCrewMember = cabinCrewMember;
        this.passenger = passenger;
    }

    @Test
    public void flightHasPilots(){
        ArrayList<Pilot> pilots = new ArrayList<>();
        pilots.add(pilot);
        pilots.add(pilot2);
        pilots.add(pilot3);
        assertEquals(3, flight.getPilot(pilot));
    }

    @Test
    public void canAddPilot(){
        flight.addPilot(pilot);
        flight.addPilot(pilot);
        assertEquals(2, flight.countPilots(pilot));
    }

    @Test
    public void flightHasListOfCabinCrewMembers(){
        flight.addCabinCrewMember(cabinCrewMember);
        flight.addCabinCrewMember(cabinCrewMember);
        flight.addCabinCrewMember(cabinCrewMember);
        flight.addCabinCrewMember(cabinCrewMember);
        flight.addCabinCrewMember(cabinCrewMember);
        assertEquals(5, flight.cabinCrewMemberSize());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("FR756", flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("GLA", flight.getFlightDestination());
    }

    @Test
    public void hasAvailableSeats(){
        assertEquals(2, flight.availableSeats());
    }

    @Test
    public void canBookAPassenger(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.countPassenger());
    }

    @Test
    public void bookPassengerIfThereAreAvailableSeats(){
        flight.addPassenger(passenger);
        flight.addPassenger(passenger);
        assertEquals(2, flight.countPassenger());

    }
}
