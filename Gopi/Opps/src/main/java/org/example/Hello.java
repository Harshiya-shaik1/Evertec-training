package org.example;

public class Hello
{
    public static void main(String[] args)
    {
        Car car=new Car("closed","on" +
                "","seated",10);
      /* car.setSpeed(10);
        System.out.println(car.getSpeed());
        car.setDoors("closed");
        System.out.println(car.getDoors());
        car.setDriver("seated");
        car.setEngine("on");
        System.out.println(car.Run())
        ;*/
        System.out.println( car.Run());
    }

}

