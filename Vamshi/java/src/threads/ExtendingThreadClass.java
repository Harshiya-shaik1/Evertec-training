package threads;

public class ExtendingThreadClass  extends Thread{
	public void run() {
			System.out.println("Thread is running succesfully by exending thread class ");
	}
	
}
class Main{
	public static void main(String args[]) {
		ExtendingThreadClass t1=new ExtendingThreadClass();
		t1.start();
		
	}
}
