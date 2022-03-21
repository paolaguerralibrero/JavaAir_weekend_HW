import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Tom", CabinCrewMemberType.CAPTAIN);
    }

    @Test
    public void cabinCrewMemberHasName(){
        assertEquals("Tom", cabinCrewMember.getName());
    }

    @Test
    public void cabinCrewMemberHasRank(){
        assertEquals(CabinCrewMemberType.CAPTAIN, cabinCrewMember.getCabinCrewMemberType());
    }

    @Test
    public void cabinCrewMemberCanRelayMessages(){
        assertEquals("Fasten your seatbelts", cabinCrewMember.canRelayMessages());
    }



}
