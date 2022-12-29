package oopsApplication;

public class Bike extends Vehicle implements VehicleInterface {
    @Override
    public void start() {
        System.out.println("Bike is started");
    }

    @Override
    public void speed() {
        System.out.println(" bike moving in the speed of 20kmph");

    }
    @Override
    public String modal(){

        return "Honda14";
    }

}

