package execptions;

import java.io.IOException;

public class Testthrows1 {

	
		 public  static void m()throws IOException{
		    throw new IOException("device error");//checked exception
		  }
		 
		  
		   
		  public static void main(String args[]){
		   Testthrows1 obj=new Testthrows1();
		try{
		    m();
		   }catch(Exception e)
		{
			  System.out.println("exception handled");
		}
		
			System.out.println("normal flow...");
		  }
		   
		   
		  }

		


