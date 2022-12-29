package com.work.inheritance.composition;

public class GraphicsCard {
    private String brand;
    private int series;
    private String memory;

    public GraphicsCard() {
        this.brand = "Nvidia";
        this.memory="2 gb";
        this.series=940;
    }

    public GraphicsCard(String brand,int series, String memory) {
        this.brand = brand;
        this.memory=memory;
        this.series=series;
    }

    public String toString() {
        return "GraphicsCard{" +
                "brand='" + brand + '\'' +
                ", series=" + series +
                ", memory='" + memory + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public int getSeries() {
        return series;
    }

    public String getMemory() {
        return memory;
    }
}
