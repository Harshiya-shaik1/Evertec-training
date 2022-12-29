package execptions;

import java.io.File;
import java.util.Scanner;

public class JavaExecptionMultipleCatch {
	public static void main(String args[]) {
		Scanner sc= new Scanner(System.in);    
		System.out.print("Enter first number- ");  
		int a= sc.nextInt();  
		System.out.print("Enter second number- ");  
		int b= sc.nextInt();
		
		//try {
			int q=a/b;
			System.out.println(q); 
			
			int c[]=new int[5];    
            
            System.out.println(c[10]); 
            File f=new File("");
           // f.createNewFile();
          //  s.toUpperCase();
			
		/*}catch(ArithmeticException e)
		{
			System.out.println(e); 
	    }
		catch(ArrayIndexOutOfBoundsException e)  
        {  
         System.out.println("ArrayIndexOutOfBounds Exception occurs");  
        } */
		
		System.out.println("remaining code is executing");
		
}
}