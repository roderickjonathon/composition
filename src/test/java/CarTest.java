import cars.Car;
import cars.Electric;
import cars.Hybrid;
import cars.Petrol;
import org.junit.Before;
import org.junit.Test;
import vehicle.Engine;
import vehicle.Wheels;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Electric electricCar;
    Hybrid hybridCar;
    Petrol petrolCar;
    Engine engine1;
    Engine engine2;
    Engine engine3;
    Wheels wheels;



    @Before
    public void setup(){
        engine1 = new Engine("Petrol");
        engine2 = new Engine("Electric");
        engine3 = new Engine("Hybrid");
       petrolCar = new Petrol(engine1, wheels, 4, 200,50, "green", false, false);
       electricCar = new Electric(engine2, wheels, 2, 300, 50, "blue", false, false);
       hybridCar = new Hybrid(engine3, wheels, 4, 500, 60, "yellow", true, false);

    }

    @Test
    public void carHasEngine() {
        assertEquals(engine1, petrolCar.getEngine());
    }

    @Test
    public void carHasWheels() {
        assertEquals(wheels, petrolCar.getWheels());
    }


    @Test
    public void canGetEngineType() {
        assertEquals("Petrol", petrolCar.getEngine().getType());
    }

//    @Test
//    public void canCanTurnWheels(){
//        assertEquals("Vehicle turns left", petrolCar.getWheels().turn("left"));
//    }


    @Test
    public void carCanDrive() {
        assertEquals("Driving", petrolCar.drive());
        assertEquals("Stopping", hybridCar.brake());
        assertEquals("Reversing", electricCar.reverse());
    }

    @Test
    public void damageReducesPrice(){
        electricCar.carDamaged();
        assertEquals(225, electricCar.getPrice());
    }

}
