package com.stream_lambdaexpression;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
	int empid;
	String name;
	int salary;

	Employee(int empid,String name,int salary)
	{
		this.empid=empid;
		this.name=name;
		this.salary=salary;
		
	}
}



public class Filter{
	public static void main(String[] args) {
		/*List<Employee> empList=new ArrayList<>();

		empList.add(new Employee(1,"John",20000));
		empList.add(new Employee(2,"Joe",30000));
		empList.add(new Employee(3,"Jam",40000));
		empList.add(new Employee(4,"Joseph",35000));
		empList.add(new Employee(5,"jameline",22000));*/
		
		List<Employee> employeeList=Arrays.asList
				(
		new Employee(1,"John",20000),
		new Employee(2,"Joe",30000),
		new Employee(3,"Jam",40000),
		new Employee(4,"Joseph",35000),
		new Employee(5,"jameline",22000)); 
		
		
		List<Integer> empSalList=employeeList.stream().filter(e->e.salary>20000)
		                     .map(e->e.salary).collect(Collectors.toList());
		
		System.out.println(empSalList);
		
		
				
		
		
		
	}
	

}

