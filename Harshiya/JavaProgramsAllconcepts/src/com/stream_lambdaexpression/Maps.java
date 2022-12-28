package com.stream_lambdaexpression;

import java.util.Arrays;
import java.util.List;

public class Maps {
	
	 public static void main(String[] args) {
		 List<String> name=Arrays.asList("John","Joe","Joseph");
		// List<Integer> namesLength=new ArrayList<Integer>();
		  
		name.stream().map(names->names.length()).forEach(len->System.out.println(len));
		//forEach(System.out::println);

		
		 List<Integer> numbers=Arrays.asList(2,3,5,8);
		 
			// List<Integer> numMul= new ArrayList<>();
			 numbers.stream().map(num->(num*3)).forEach(System.out::println);
			 
}
}
