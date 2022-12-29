package defultMrthods.WithrespectToMultileInterface;

public class Test implements  Left,Right{


    //  @Override
   // 1.way
    //Resolve pbmlm by overting it
   /* public void m1() {
        System.out.println("my own implementation");
    }

    public static void main(String[] args) {
        Test t=new Test();
        t.m1();
    }*/
    //2.way
    @Override
    public void m1() {
        Left.super.m1();//same like Right also
    }

    public static void main(String[] args) {
        Test t=new Test();
        t.m1();
    }

}