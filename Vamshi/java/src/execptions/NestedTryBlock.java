package execptions;

public class NestedTryBlock {
	public static void main(String args[]){   
		
			  try{
				  
			      
			      try {
			    	  
			      int arr[]= {1,3,5,7};
			      
			      System.out.println(arr[10]);
			      }catch(ArithmeticException e)
			  	{
			  		System.out.println(e);
			  	}
			      
			      
			   }
          catch(ArrayIndexOutOfBoundsException  e)
		      
		      
		      { 
		    	  System.out.println("ArrayIndexOutOfBounds Exception occurs");
		      }
			 
		     System.out.println("REMAINING CODE EXECUTES");
		    
			} 
	}
	

