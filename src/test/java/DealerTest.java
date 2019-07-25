import cars.Petrol;
import dealership.Customer;
import dealership.Dealer;
import dealership.Till;
import org.junit.Before;
import org.junit.Test;
import vehicle.Engine;
import vehicle.Wheels;

import static org.junit.Assert.assertEquals;

public class DealerTest {

    Dealer dealer;
    Customer customer;
    Engine engine;
    Wheels wheels;
    Petrol petrolCar;
    Till till;




    @Before
    public void setup(){
        till = new Till(4000);
        customer = new Customer(1000, "Jimmy");
        dealer = new Dealer("Mr Salesman", till, customer);

        petrolCar = new Petrol(engine, wheels, 4, 500, 60,"green", false, false );
    }

    @Test
    public void hasName(){
        assertEquals("Mr Salesman", dealer.getName() );
    }

    @Test
    public void canSellCar() {
        dealer.sellCar(petrolCar);
        assertEquals(500, customer.getCash());
        assertEquals(1, customer.getNumOfCarsOwned());

    }
}
