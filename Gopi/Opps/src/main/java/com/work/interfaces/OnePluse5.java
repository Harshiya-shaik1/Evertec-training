package com.work.interfaces;

public class OnePluse5 implements Phone{

    @Override
    public String processor() {
        return "SD835";
    }

    @Override
    public String OS() {
        return "Android";
    }

    @Override
    public int spaceInGb() {
        return 64;
    }
}
