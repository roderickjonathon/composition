import org.junit.Before;
import org.junit.Test;
import vehicle.Wheels;

import static org.junit.Assert.assertEquals;

public class WheelsTest {

    Wheels wheels;

    @Before
    public void setup(){
        wheels = new Wheels();
    }


    @Test
    public void wheelsCanTurn() {
        assertEquals("Vehicle turns left", wheels.turn("left"));
    }
}
