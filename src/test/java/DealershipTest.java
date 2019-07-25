import cars.Car;
import cars.Electric;
import cars.Hybrid;
import cars.Petrol;
import dealership.Customer;
import dealership.Dealer;
import dealership.Till;
import org.junit.Before;
import org.junit.Test;
import vehicle.Engine;
import vehicle.Wheels;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealer dealer;
    Dealership dealership;
    Till till;
    Customer customer;
    Engine engine;
    Wheels wheels;
    Petrol petrolCar;
    Hybrid hybridCar;
    Electric electricCar;
    ArrayList<Car> carsList;

    @Before
    public void setUp(){
        till = new Till(1000);
        customer = new Customer(4000, "Jimmy");
        dealer = new Dealer("Mr Salesman", till, customer);
        petrolCar = new Petrol(engine, wheels, 4, 500,50, "green", false, false);
        electricCar = new Electric(engine, wheels, 2, 700, 50, "blue", false, false);
        hybridCar = new Hybrid(engine, wheels, 4, 600, 60, "yellow", true, false);
        carsList = new ArrayList<Car>();
        dealership = new Dealership(carsList,dealer, till);
        dealership.addToList(electricCar);
        dealership.addToList(hybridCar);
        dealership.addToList(petrolCar);


    }

    @Test
    public void canAddToList(){
        dealership.addToList(hybridCar);
        assertEquals(4, dealership.getNumOfCars());
    }

    @Test
    public void canRemoveFromList() {
        dealership.addToList(electricCar);
        dealership.removeFromList(electricCar);
        assertEquals(3, dealership.getNumOfCars());
    }

    @Test
    public void canSellCar() {

        dealership.sellCar(electricCar);
        assertEquals(1, customer.getNumOfCarsOwned());
        assertEquals(3300, customer.getCash());
        assertEquals(1700, till.getCash());
        assertEquals(2, dealership.getNumOfCars());

    }

    @Test
    public void canRentOutCar() {
        dealership.rentCar(electricCar);
        assertEquals(1, customer.getNumOfRentedCars());
        assertEquals(true, electricCar.rentalStatus());
        assertEquals(3950, customer.getCash());

    }

    @Test
    public void canBuyInNewCars(){
        dealership.buyNewCar(electricCar);
        assertEquals(4, dealership.getNumOfCars());
    }

    @Test
    public void cantBuyIfNotEnoughMoney() {
        till.removeCash(1000);
        dealership.buyNewCar(electricCar);
        assertEquals(3, dealership.getNumOfCars());
    }

    @Test
    public void damagedCarSellsForLess(){

        electricCar.carDamaged();
        dealership.sellCar(electricCar);
        assertEquals(3475, customer.getCash());
    }

//    @Test
//    public void dealerShipCanRepair(){
//        electricCar.carDamaged();
//        dealership.repairDamage(electricCar);
//        dealership.sellCar(electricCar);
//        assertEquals(3300, customer.getCash());


//    }
}
