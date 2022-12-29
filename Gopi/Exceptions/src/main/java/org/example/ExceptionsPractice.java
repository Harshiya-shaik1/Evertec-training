package org.example;

import java.io.PrintWriter;

public class ExceptionsPractice {
    public static void main(String[] args) {

/*
//case1
       doStuff();

    }
    public static void  doStuff(){
        doMoreStuff();

    }
    public static void doMoreStuff(){
        System.out.println(10/0);
    }
*/


// case 2
       /* doStuff();
        System.out.println(10/0);

    }
    public static void  doStuff(){
        doMoreStuff();
        System.out.println("hi");

    }
    public static void doMoreStuff(){
        System.out.println("Hello");//Hello hi Exception in thread "main" java.lang.ArithmeticException: / by zero
    }
*/
/*
        System.out.println("stmt1");
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();//stmt1         java.lang.ArithmeticException: / by zero

        }*/



          /*PrintWriter pw = new PrintWriter("abc.text");
          pw.println("Hello");//  here we need to use throws key word in main other wise we will get compile time error
*/
       /*
        Thread.sleep(1000);*/// here we need to use throws key word in main other wise we will get compile time error

        //throws key word only for checked exceptions.use of un checked exception no use throws keyword.


    }
}
