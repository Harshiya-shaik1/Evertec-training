package com.work.inheritance.composition;

import java.awt.*;

public class Laptop {
    private float screen;
    private Processor processor;
    private String ram;
    private String hardDrive;
    private GraphicsCard graphicsCard;
    private String optimalDrive;
    private String keyboard;

    public Laptop() {
        this.screen = 15.6f;
        this.processor=new Processor();
        this.ram="DDR4";
        this.hardDrive="2TB";
        this.graphicsCard=new GraphicsCard();
        this.optimalDrive="MLT Layer";
        this.keyboard="backlit";
    }

    public Laptop(float screen,Processor processor,String ram,GraphicsCard graphicsCard,String hardDrive,String optimalDrive,String keyboard) {
        this.screen = screen;
        this.processor=processor;
        this.ram=ram;
        this.hardDrive=hardDrive;
        this.graphicsCard=graphicsCard;
        this.optimalDrive=optimalDrive;
        this.keyboard=keyboard;
    }

    public String toString() {
        return "Laptop{" +
                "screen=" + screen +
                ", processor=" + processor +
                ", ram='" + ram + '\'' +
                ", hardDrive='" + hardDrive + '\'' +
                ", graphicsCard=" + graphicsCard +
                ", optimalDrive='" + optimalDrive + '\'' +
                ", keyboard='" + keyboard + '\'' +
                '}';
    }

    public Processor getProcessor() {
        return processor;
    }
}
