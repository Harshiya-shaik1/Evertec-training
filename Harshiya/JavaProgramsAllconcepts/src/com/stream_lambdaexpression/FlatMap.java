package com.stream_lambdaexpression;


	
	import java.util.Arrays;
	import java.util.List;
	import java.util.stream.Collectors;

	public class FlatMap {
		public static void main(String[] args)
		{
			//Map
			List<Integer> list1=Arrays.asList(1,2,3,4,5,7);
		List<Integer>	 list2=list1.stream().map(n->n+10).collect(Collectors.toList());
			System.out.println(list2);
			
			//flatMap
			List<Integer> l1=Arrays.asList(1,2);
			List<Integer> l2=Arrays.asList(3,4);
			List<Integer> l3=Arrays.asList(5,7);
			
			List<List<Integer>> finallist=Arrays.asList(l1,l2,l3);
			
			
			List<Integer> finalresults=finallist.stream().flatMap(x->x.stream().map(n->n+10)).collect(Collectors.toList());
			System.out.println(finalresults);
			
			
			
			
			
		}

	}



