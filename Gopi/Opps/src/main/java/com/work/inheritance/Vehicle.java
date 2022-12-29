package com.work.inheritance;

public class Vehicle {
    private   String engine;
    private int wheels;
    private int seats;
    private int fualTank;
    private String lights;

    public Vehicle() {
        this.engine = "petrol";
        this.seats=4;
        this.fualTank=45;
        this.lights="led";
        this.wheels=4;

    }

    public Vehicle(String engine,int wheels,int seats,int fualTank,String lights) {
        this.engine = engine;
        this.seats=seats;
        this.fualTank=fualTank;
        this.lights=lights;
        this.wheels=wheels;
    }

    public int getWheels() {
        return wheels;
    }

    public String getEngine() {
        return engine;
    }

    public int getSeats() {
        return seats;
    }

    public int getFualTank() {
        return fualTank;
    }

    public String getLights() {
        return lights;
    }
}
