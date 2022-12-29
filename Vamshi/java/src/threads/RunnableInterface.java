package threads;

public class RunnableInterface implements Runnable{

	@Override
	public void run() {
		System.out.println("thread is running using Runnable interface");
		
	}

}
class Mainn{
	public static void main(String args[]) {
		RunnableInterface t5=new RunnableInterface();
		Thread t2=new Thread(t5); // Using the constructor Thread(Runnable r)  
		t2.start();
		
	}
}
