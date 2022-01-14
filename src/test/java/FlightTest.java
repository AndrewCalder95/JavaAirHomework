import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class FlightTest {
    Flight flight;
    Plane plane;
    Pilot pilot;
    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;
    ArrayList<CabinCrewMember> CabinCrew = new ArrayList<>();
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    ArrayList<Passenger> Passengers = new ArrayList<>();

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747, 3,400);
        pilot = new Pilot("Jim", RankType.FIRST_OFFICER, "GB202021");
        cabinCrewMember1 = new CabinCrewMember("James", RankType.FLIGHT_ATTENDANT);
        cabinCrewMember2 = new CabinCrewMember("Sophie", RankType.FLIGHT_ATTENDANT);
        CabinCrew.add(cabinCrewMember1);
        CabinCrew.add(cabinCrewMember2);
        passenger1 = new Passenger("Helen", 1);
        passenger2 = new Passenger("Bryce", 1);
        passenger3 = new Passenger("Alex", 2);
        passenger4 = new Passenger("Eve", 2);
        Passengers.add(passenger1);
        Passengers.add(passenger2);
        Passengers.add(passenger3);
        flight = new Flight(pilot, plane, CabinCrew, Passengers, "FR756","GLA","EDI", "17:05");
    }

    @Test
    public void availableSeats() {
        assertEquals(197, flight.availableSeats());
    }

    @Test
    public void cantBookPassengersInWhenOverCapacity() {
        flight.bookPassenger(passenger4);
        assertEquals(0, flight.availableSeats());
    }

    @Test
    public void pilotFlies(){
        flight.flyPlane();{
            assertEquals("I'm flying the plane", flight.flyPlane());
        }
    }

    @Test
    public void cabinCrewTalks(){
        flight.relayMessages(cabinCrewMember1);{
            assertEquals("We're coming into land", flight.relayMessages(cabinCrewMember1));
        }
    }

    @Test
    public void canGetTotalBags(){
        assertEquals(4, flight.getNumberOfBags());
    }

}