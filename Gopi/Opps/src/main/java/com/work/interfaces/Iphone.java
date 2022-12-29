package com.work.interfaces;

public class Iphone implements Phone{
    @Override
    public String processor() {
        return "A11";
    }

    @Override
    public String OS() {
        return "IOS";
    }

    @Override
    public int spaceInGb() {
        return 64;
    }
}
