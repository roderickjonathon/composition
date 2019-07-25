import org.junit.Before;
import org.junit.Test;
import vehicle.Engine;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void setup(){
        engine = new Engine("Petrol");
    }

    @Test
    public void engineCanTurnOn(){
        assertEquals("Vroom", engine.turnOn());
    }

    @Test
    public void engineCanTurnOff() {
        assertEquals("Engine off", engine.turnOff());
    }

    @Test
    public void canGetType() {
        assertEquals("Petrol", engine.getType());
    }
}
