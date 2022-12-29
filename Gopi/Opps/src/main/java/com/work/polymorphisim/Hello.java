package com.work.polymorphisim;

public class Hello {
    public static void main(String[] args) {
      /*  Phone phone=new Phone("nokia 2023");
        System.out.println(phone.getModal());

        System.out.println(phone.features());
        SamsangNote8 sam=new SamsangNote8("sam 414145");
        System.out.println(sam.getModal());
        System.out.println( sam.features())
        ;
        Phone nokia3310=new Nokia3310("nokia3310");
        System.out.println( nokia3310.getModal());
        System.out.println(nokia3310.features());
    }*/
        Phone nokia3310 = new Hello().phone(1);
    }
    public Phone phone(int dailyDriver) {
            switch(dailyDriver){
                case 1: return new  Nokia3310("3310");
                case 2: return  new SamsangNote8("note5");
            }

            return null;
        }
        }

