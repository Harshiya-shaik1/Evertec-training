package threads;

// Using the Thread Class: Thread(Runnable r, String name)

public class ThreadRunnAndaString implements Runnable{
	public void run()
    {
        System.out.println(" thread is running ...");
    }
    public static void main(String args[])
    {

        Runnable r1 = new ThreadRunnAndaString();

        Thread th1 = new Thread(r1, "My new thread");

        th1.start();

        String str = th1.getName();
        System.out.println(str);
    }

}
