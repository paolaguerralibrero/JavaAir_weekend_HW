import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Sam");
    }

    @Test
    public void pilotHasName(){
        assertEquals("Sam", pilot.getName());
    }

    @Test
    public void pilotHasRank(){
        assertEquals("I am the Pilot", pilot.getCabinCrewMemberType());
    }

    @Test
    public void pilotHasLicenceNumber(){
        assertEquals("LN23235", pilot.getLicenceNumber());
    }

    @Test
    public void pilotCanFlyThePlane(){
        assertEquals("I can fly", pilot.canFly());
    }

}
