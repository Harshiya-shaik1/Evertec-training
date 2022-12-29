
public class Throws_Example {

	int dividion(int a,int b)throws ArithmeticException{
		int d=a/b;
		return d;
	}
	public static void main(String [] args) {
		Throws_Example ab=new Throws_Example();
		try {
			System.out.println(ab.dividion(10, 0));
		}
		catch(ArithmeticException e){
		System.out.println("exception");
		}
		
	}

}
