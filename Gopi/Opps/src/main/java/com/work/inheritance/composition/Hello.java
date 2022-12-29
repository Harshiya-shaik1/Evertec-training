package com.work.inheritance.composition;

import java.sql.SQLOutput;

public class Hello {
    public static void main(String[] args) {
   /* Laptop  loppy=new Laptop();
        System.out.println(loppy.getProcessor().getBrand());*/
        Processor processor=new Processor( "intel"," 7200",4,4,5,"jgj","mbv","mhgsc","mnb");
       GraphicsCard graphicsCard=new GraphicsCard("Ndivia",4,"4db");

        Laptop gammingLap=new Laptop(41.5f,processor,"4",graphicsCard,"hjgjh","kjhgjh","block");

        System.out.println(gammingLap);
    }
}
