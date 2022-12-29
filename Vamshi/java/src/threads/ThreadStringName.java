package threads;

public class ThreadStringName {
	public static void main(String argvs[])
    {
        Thread t= new Thread("running thread using the constructors defined");
        t.start();
        String str = t.getName();
        System.out.println(str);
    }

}
