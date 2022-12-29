package com.work.polymorphisim;

public class Phone {
    private String modal;

    public Phone(String modal) {
        this.modal = modal;
    }
    public String features(){
     return   "Freatured phone";
    }

    public String getModal() {
        return modal;
    }
}
