package accessingCollections;

import java.util.ArrayList;

public class ByForLoop {
	public static void main(String args[]) {
		ArrayList<String> b = new ArrayList<>();
		b.add("A");
		b.add("C");
		b.add("B");
		b.add("D");
		b.add("E");
		
		System.out.println(b);
		for(int i=0;i<b.size(); i++) {
			String val=b.get(i);
			System.out.println(val);
		}
		 
	}

}
