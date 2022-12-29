package com.work.inheritance.composition;

public class Processor {
    private String brand;
    private int generation;
    private String series;
    private int cores;
    private int threads;

    private String cacheMemory;
    private String frequency;
    private String MinFrequency;
    private String MaxFrequency;

    public Processor() {
        this.brand = "intel";
        this.series="7200u";
        this.cacheMemory="3mb";
        this.cores=4;
        this.frequency="2.5GHz";
        this.MaxFrequency="2.5GHz";
        this.MinFrequency="1.3Ghz";
        this.generation=7;
        this.threads=4;
    }

    public Processor(String brand,String series,int cores,int generation,int threads,String cacheMemory,String frequency, String MinFrequency, String MaxFrequency) {
        this.brand = brand;
        this.series=series;
        this.cacheMemory=cacheMemory;
        this.cores=cores;
        this.frequency=frequency;
        this.MaxFrequency=MaxFrequency;
        this.MinFrequency=MinFrequency;
        this.generation=generation;
        this.threads=threads;
    }

    public String getBrand() {
        return brand;
    }

    public String getSeries() {
        return series;
    }

    public int getGeneration() {
        return generation;
    }

    public int getThreads() {
        return threads;
    }

    public int getCores() {
        return cores;
    }

    public String getCacheMemory() {
        return cacheMemory;
    }

    public String getFrequency() {
        return frequency;
    }
}

