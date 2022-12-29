package oopsApplication;

     public class Controller {
     public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.setName("Hero");
        vehicle.setNumber("AP00211");
        System.out.println("the vehicle name is :"+vehicle.getName());
        System.out.println("the vehicle number is :"+vehicle.getNumber());
        Bike bike=new Bike();
        bike.start();
        bike.speed();
        System.out.println( bike.modal());
        Person person=new PersonImplementation();


        System.out.println(person.personDetails("vamshi"));
        System.out.println(person.personDetails("vamshi",22));
        person.ride();
    }
}