package accessingCollections;

import java.util.ArrayList;

public class EnhancedForLoop {
	public static void main(String args[]) {
		ArrayList<String> b = new ArrayList<>();
		b.add("A");
		b.add("C");
		b.add("B");
		b.add("D");
		b.add("E");
		
		System.out.println(b);
		
		for(String value:b)
		 {
		 System.out.println(value);
		 }
		
	}
}
