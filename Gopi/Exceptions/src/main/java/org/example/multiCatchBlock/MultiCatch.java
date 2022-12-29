package org.example.multiCatchBlock;

public class MultiCatch {
    public static void main(String[] args) {
        try{
        int[] a=new int[5];
        a[5]=30/0;//riskey code
    }
        catch (ArithmeticException e){//child frist
            System.out.println("ArithmeticException");
        }
        catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
        catch (Exception e1){
            System.out.println(e1.getMessage());//parent last
        }
        System.out.println("rest of the code normal termination");
    }
}
