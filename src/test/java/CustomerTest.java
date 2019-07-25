import cars.Petrol;
import dealership.Customer;
import org.junit.Before;
import org.junit.Test;
import vehicle.Engine;
import vehicle.Wheels;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Petrol petrolCar;
    Engine engine1;
    Wheels wheels;

    @Before
    public void setup(){
        customer = new Customer(1000, "Jimmy");
        engine1 = new Engine("Petrol");
        petrolCar = new Petrol(engine1, wheels, 4, 200, 60, "green", true, false);

    }

    @Test
    public void canAddCar() {
        customer.addCar(petrolCar);
        assertEquals(1, customer.getNumOfCarsOwned());
    }

    @Test
    public void canReduceCash(){
        customer.removeCash(500);
        assertEquals(500, customer.getCash());
    }


}
