package collectionsExamaples;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue1 {
	
	    public static void main(String args[]){
	        PriorityQueue<String> q1 = new PriorityQueue<String>();
	        q1.add("java");
	        q1.add("html");
	        q1.add("css");
	        q1.add("soap");
	        q1.add("aws");
	        q1.add("selenium");
	        System.out.println(q1.peek());
	        System.out.println(q1.poll());
	        Iterator itr=q1.iterator();
	        while(itr.hasNext()){
	            System.out.println(itr.next());
	        }
	    }
	}



