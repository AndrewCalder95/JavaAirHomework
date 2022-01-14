import java.util.ArrayList;

public class Flight {
    public Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers = new ArrayList<>();
    public ArrayList<Passenger> passengers = new ArrayList<>();

    public Flight(Pilot pilot, Plane plane, ArrayList<CabinCrewMember> cabinCrewMembers,
                  ArrayList<Passenger>passengers, String flightNumber, String destination,
                  String departureAirport, String departureTime){
        this.pilot = pilot;
        this.plane = plane;
        this.cabinCrewMembers = cabinCrewMembers;
        this.passengers = passengers;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public int availableSeats(){
        return plane.getCapacity() - passengers.size();
    }

    public void bookPassenger(Passenger passenger){
        if(this.availableSeats()>0){
        passengers.add(passenger);}
        else {
            System.out.println("Not enough space");
        }
    }

    public String flyPlane(){
        return pilot.flyPlane();
    }

    public String relayMessages(CabinCrewMember cabinCrewMember){
        return cabinCrewMember.relayMessages();
    }

    public int getPlaneWeight(){
        return plane.getWeight();
    }

    public int getNumberOfBags(){
        int totalBags = 0;
        for (Passenger passenger: passengers){
            totalBags += passenger.getBags();
        }
        return totalBags;
    }

}
