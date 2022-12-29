package org.example;

public class SingleTonClass {
    static SingleTonClass instance=null;
    public int x=10;
    private SingleTonClass(){

    }
    public static SingleTonClass getInstance(){
        if(instance==null){
            instance=new SingleTonClass();

        }
        return instance;
    }
}
class mySingleTon{
    public static void main(String[] args) {
        SingleTonClass a=SingleTonClass.getInstance();
        SingleTonClass b=SingleTonClass.getInstance();
        a.x=a.x+10;
        System.out.println(a.x);
        System.out.println(b.x);
    }
}
