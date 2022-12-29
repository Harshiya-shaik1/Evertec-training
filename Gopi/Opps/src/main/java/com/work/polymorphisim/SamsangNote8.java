package com.work.polymorphisim;

public class SamsangNote8 extends Phone{
public String modal;
    public SamsangNote8(String modal) {

        super(modal);
    }
    public String features(){
        return"Android flagship";
    }

    @Override
    public String getModal() {
        return modal;
    }
}
