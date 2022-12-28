package com.collections;
import java.util.*;
public class ArrayListToHashSet {
	
	  public static void main(String args[]) {
	    ArrayList<String> arrList=new ArrayList<>();
	    arrList.add("John");
	    arrList.add("Ram");
	    arrList.add("Scott");

	    //copying ArrayList elements to HashSet
	    HashSet<String> hSet=new HashSet(arrList);
	    
	    hSet.add("Arshu");

	    System.out.println("HashSet elements: ");
	    Iterator<String> it= hSet.iterator();
	    while(it.hasNext())
	    {
	      System.out.println(it.next());
	    }
	  }
	}


