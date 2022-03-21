import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;



    @Test
    public void planeHasType(){
        plane = new Plane(PlaneType.BOEING747);
        assertEquals(PlaneType.BOEING747, plane.getType());
    }


}
