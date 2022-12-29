package org.example;

public class Rectangle {
    public static void main(String[] args) {
        System.out.println("Area of rectangle with length = 5.4" + "and width 3.2  area="+areaRectangle(20.1, 20));


        //double area = areaRectangle(20.1, 20);
        //System.out.println(area);
    }
    public static double areaRectangle(double lemngth,double width){
        return lemngth*width;
    }
}
