import cars.Car;

import cars.Electric;
import dealership.Dealer;
import dealership.Till;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Car> carsList;
    private Dealer dealer;
    private Till till;

    public Dealership(ArrayList<Car> carsList, Dealer dealer, Till till) {
        this.carsList = new ArrayList<Car>();
        this.dealer = dealer;
        this.till = till;
    }

    public ArrayList<Car> getCarsList() {
        return carsList;
    }

    public int getNumOfCars(){
        return carsList.size();
    }

    public void addToList(Car car){
        carsList.add(car);
    }

    public void removeFromList(Car car){
        carsList.remove(car);
    }

    public void sellCar(Car car){

        dealer.sellCar(car);
        removeFromList(car);

    }

    public void rentCar(Car car){
        if(car.rentalStatus() == false) {
            dealer.rentCar(car);
            car.rentOut();
        }
    }

    public void buyNewCar(Car car) {
        if(till.getCash() > car.getPrice()){
            carsList.add(car);
        }
    }


//
//    public void repairDamage(Car car) {
//        if(car.isDamaged() == true){
//            double repairCost =
//    }
}
