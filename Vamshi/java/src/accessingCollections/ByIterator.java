package accessingCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ByIterator {

	public static void main(String args[]) {
		ArrayList<String> b = new ArrayList<>();
		b.add("A");
		b.add("C");
		b.add("B");
		b.add("D");
		b.add("E");
		
		Iterator itr=b.iterator();
        while(itr.hasNext()){
        	String val=(String) itr.next();
        	System.out.println(val);
        	
        	if(val=="A") {
        		itr.remove();
        	}
        }
        System.out.println("after remove method");
        for(String value:b) {
        	System.out.println(value);
        	
        }
	}	
	
}
