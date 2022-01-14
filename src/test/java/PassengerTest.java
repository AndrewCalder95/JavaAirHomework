import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Andrew", 2);
    }

    @Test
    public void getName() {
        assertEquals("Andrew", passenger.getName());
    }

   @Test
    public void setName() {
        passenger.setName("James");
       assertEquals("James", passenger.getName());
    }

    @Test
    public void getBags() {
        assertEquals(2, passenger.getBags());
    }

    @Test
    public void setBags() {
        passenger.setBags(4);
        assertEquals(4, passenger.getBags());
    }
}