package cars;

import behaviours.IDrive;
import vehicle.Engine;
import vehicle.Wheels;

public abstract class Car implements IDrive {

    private Engine engine;
    private Wheels wheels;
    private int doors;
    private int price;
    private int rentalPrice;
    private String colour;
    private boolean rented;
    private boolean damaged;

    public Car(Engine engine, Wheels wheels, int doors, int price, int rentalPrice, String colour, boolean rented, boolean damaged) {
        this.engine = engine;
        this.wheels = wheels;
        this.doors = doors;
        this.price = price;
        this.rentalPrice = rentalPrice;
        this.colour = colour;
        this.rented = rented;
        this.damaged = damaged;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return this.doors;
    }

    public String drive(){
        return "Driving";
    }

    public int getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public String brake(){
        return "Stopping";
    }

    public String reverse(){
        return "Reversing";
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(int rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean rentalStatus(){
        return this.rented;

    }

    public void rentOut(){
        this.rented = true;
    }

    public void rentIn(){
        this.rented = false;
    }

    public boolean isDamaged(){
        return damaged;
    }

    public void setDamaged(boolean value){
        damaged = value;

    }

    public double damageCost(){
        return getPrice() * 0.25;
    }


    public void carDamaged(){
        damaged = true;
        price -= damageCost();
    }


}
