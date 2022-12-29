package org.example.LambdaExpressions;
/*
class myThread implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            System.out.println("Child thread");
        }
    }

}
public class Lambda5 {
    public static void main(String[] args) {
      Runnable r=new myThread();
      Thread t=new Thread(r);
      t.start();
        for(int i=0;i<=10;i++){
            System.out.println("main Thread");
        }
    }
}*/

//with lambda




public class Lambda5 {
    public static void main(String[] args) {
        Runnable r=()->{
        for(int i=0;i<=10;i++){
            System.out.println("Child thread");
        }};
        Thread t=new Thread(r);
        t.start();
        for(int i=0;i<=10;i++){
            System.out.println("main Thread");
        }
    }
}
