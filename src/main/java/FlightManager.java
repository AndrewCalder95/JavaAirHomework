import java.util.ArrayList;

public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight){
        this.flight = flight;
    }

    public int baggageForFlight(Flight flight){
        return flight.getPlaneWeight() / 2;
    }

    public int passengerBaggage(Flight flight){
        return flight.getNumberOfBags() * 10;
    }

    public int remainingBaggage(Flight flight){
        return baggageForFlight(flight) - passengerBaggage(flight);
    }
}
