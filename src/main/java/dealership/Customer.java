package dealership;

import cars.Car;


import java.util.ArrayList;

public class Customer {

    private int cash;
    private String name;
    private ArrayList<Car> carsOwned;
    private ArrayList<Car> carsRented;

    public Customer(int cash, String name) {
        this.cash = cash;
        this.name = name;
        this.carsOwned = new ArrayList<Car>();
        this.carsRented = new ArrayList<Car>();
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfCarsOwned() {
        return carsOwned.size();
    }

    public int getNumOfRentedCars(){
        return carsRented.size();
    }


    public void addCar(Car car) {
        carsOwned.add(car);
        removeCash(car.getPrice());
    }

    public void removeCash(int amount) {
        cash -= amount;
    }

    public void addRentalCar(Car car) {
        carsRented.add(car);
        removeCash(car.getRentalPrice());

    }
}
