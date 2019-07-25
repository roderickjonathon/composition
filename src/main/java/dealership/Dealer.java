package dealership;

import cars.Car;



public class Dealer {

    private String name;
    private Till till;
    private Customer customer;


    public Dealer(String name, Till till, Customer customer) {
        this.name = name;
        this.till = till;
        this.customer = customer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sellCar(Car car) {
        this.till.addCash(car.getPrice());
        customer.addCar(car);

    }

    public void rentCar(Car car){
        this.till.addCash(car.getRentalPrice());
        customer.addRentalCar(car);
    }
}
