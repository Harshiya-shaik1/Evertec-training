package com.work.inheritance;

public class Bike extends Vehicle{
    private String handle;

    public Bike() {
       super();
       this.handle="short";
    }





    public Bike(String handle,String engine, int wheels, int seats, int fualTank, String lights) {
        super(engine, wheels, seats, fualTank, lights);
        this.handle=handle;
    }
    public String getHandle() {
        return handle;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "handle='" + handle + '\'' +
                '}';
    }
}
