package com.stream_lambdaexpression;


	
	import java.util.Arrays;
	import java.util.List;
	import java.util.stream.Collectors;

	//non terminal/processing methods
	//distinct
	//limit()

	/**
	 * terminal
	 * count()
	 * forEach()
	 * @author arshiya
	 *
	 */
	public class StreamMethods {
		public static void main(String[] args) {
			List<String> vehcilesList=Arrays.asList("bus","car","bike","bicycle","car","car");
			//distinct
			List<String> distinctVehicles =	vehcilesList.stream().distinct().collect(Collectors.toList());
			
			System.out.println(distinctVehicles);
			//forEach
				vehcilesList.stream().distinct().forEach(System.out::println);
				
				//count 
				long count=vehcilesList.stream().distinct().count();
				System.out.println(count);
				
				//limit
				List<String> vehicles=vehcilesList.stream().limit(3).collect(Collectors.toList());
				System.out.println(vehicles);
			
		}
	}
