public class MethodOverloding {
    public static void main(String[] args) {
        System.out.println("Area of rectangle= "+area(14.02,10.2));
        System.out.println("area of square ="+area(5.00));
    }
    public static double area(double length,double width){
        return length*width;
    }
    public static double area(double side){
        return side*side;
    }
    public static int area(int side){
        return side*side;
    }

}
