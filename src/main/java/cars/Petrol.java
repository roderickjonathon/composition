package cars;

import vehicle.Engine;
import vehicle.Wheels;

public class Petrol extends Car{


    public Petrol(Engine engine, Wheels wheels, int doors, int price, int rentalPrice, String colour, boolean rented, boolean damaged) {
        super(engine, wheels, doors, price, rentalPrice, colour, rented, damaged);
    }
}
