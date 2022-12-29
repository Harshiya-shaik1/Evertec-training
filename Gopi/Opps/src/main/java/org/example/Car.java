package org.example;

public class Car {
    private String doors;
    private String engine;
    private String driver;
    private int speed;

    public Car() {
        doors="open";
        engine="off";
        driver="not seated";
        speed=0;
    }

    public Car(String doors,String engine,String driver,int speed) {
        this.doors = doors;
        this.speed=speed;
        this.engine=engine;
        this.driver=driver;
    }


    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public String Run(){
        if
            (doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed>0){
            return "running";
        }else {
            return "not running";
        }
        }
}
