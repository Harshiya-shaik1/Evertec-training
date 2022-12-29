package Defult.method1;

public class Test1 implements Interf{
    @Override
    public void m1(){
        System.out.println("my Own Implementation");
    }

    public static void main(String[] args) {
        Test1 t=new Test1();
        t.m1();
        Interf t1=new Test1();
        t1.m1();

    }
}
