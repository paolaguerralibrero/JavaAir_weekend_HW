
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {


 Passenger passenger = new Passenger("Clara", 1);

    @Test
    public void passengerHasName(){
        assertEquals("Clara", passenger.getName());
    }

    @Test
    public void passengerHasBags(){
        assertEquals(1, passenger.getBag());
    }

    @Test
    public void canUpdateBags(){
        assertEquals(2, passenger.setBag(2));
    }


}