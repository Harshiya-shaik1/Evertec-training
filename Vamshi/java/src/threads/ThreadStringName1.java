package threads;

// Using the Thread Class: Thread(String Name)

public class ThreadStringName1 {
	public static void main(String args[])
    {
        Thread t= new Thread("running thread using the constructors defined");
        t.start();
        String str = t.getName();
        System.out.println(str);
    }

}
