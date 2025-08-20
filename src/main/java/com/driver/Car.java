package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;
    }
    public Car(String name,boolean isManual){
        super(name);
        this.isManual = isManual;
    }
    public int getWheels() {
        return wheels;
    }
    public String getType() {
        return type;
    }
    public int getDoors() {
        return doors;
    }
    public int getCurrentGear() {
        return currentGear;
    }
    @Override
    public int getCurrentDirection() {
        // TODO Auto-generated method stub
        return super.getCurrentDirection();
    }
    public int getSeats() {
        return seats;
    }
    @Override
    public int getCurrentSpeed() {
        // TODO Auto-generated method stub
        return super.getCurrentSpeed();
    }
    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }
    public int getGears() {
        return gears;
    }
    public void changeGear(int newGear){
        this.currentGear = newGear;
        System.out.println("changeGear method called - The gear is changed to: " + newGear);
    }
    public boolean isManual() {
        return isManual;
    }
    public void changeSpeed(int newSpeed, int newDirection){

        setCurrentSpeed(newSpeed);
        setCurrentDirection(newDirection);

        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
    public int getDirection(){
        return super.getCurrentDirection();
    }
    // @Override
    // public void move(int speed, int direction) {
    //     // TODO Auto-generated method stub
    //     super.move(speed, direction);
    // }
}
