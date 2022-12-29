package execptions;

import java.util.Scanner;

public class JavaExceptionExample {
	public static void main(String args[]){
	
	  
	      try {
	    	  
	      //int arr[]= {1,3,5,7};
	      
	      //System.out.println(arr[10]);
	      throw new ArrayIndexOutOfBoundsException("aray execptiion");
	      
	   }catch(ArrayIndexOutOfBoundsException e)
      
      { 
    	  System.out.println("ArrayIndexOutOfBounds Exception occurs");
      }
	   finally { 
		   	
	    	  System.out.println("finally block is always executed");  
	    	  int r=12/2;
	  		 System.out.println(r);
	    	  
	    	  }    
         System.out.println("REMAINING CODE EXECUTES");
    
	} 
	        
	
}
