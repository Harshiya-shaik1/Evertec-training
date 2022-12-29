package accessingCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class listIteratorr {
	public static void main(String args[]) {
		ArrayList<String> b = new ArrayList<>();
		b.add("A");
		b.add("C");
		b.add("B");
		b.add("D");
		b.add("E");
		
		ListIterator itr=b.listIterator();
        while(itr.hasNext()){
        	String val=(String) itr.next();
        	System.out.println(val);
        }
        	System.out.println("iterating backward direction");
        	while (itr.hasPrevious())
            {
                
                System.out.println(itr.previous());

            }

}
}
