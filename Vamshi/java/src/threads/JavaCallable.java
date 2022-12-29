package threads;
import java.util.concurrent.Callable;  
import java.util.Random;  

public class JavaCallable   implements Callable  {
	public Object call() throws Exception  
	{  
	// Creating an object of the  Random class   
	Random randObj = new Random();  
	  
	// generating a random number between 0 to 9  
	Integer randNo = randObj.nextInt(10);  
	  
	// the thread is delayed for some random time  
	Thread.sleep(randNo * 1000);  
	  
	return randNo;  
	}

	
		

}
