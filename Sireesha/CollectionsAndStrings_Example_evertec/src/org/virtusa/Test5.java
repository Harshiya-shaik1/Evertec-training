package org.virtusa;

import java.util.HashMap;
import java.util.Map;

public class Test5 {
public static void main(String[] args) {
	Map<Employee, Department> m=new HashMap<>();
	Department dept=new Department(0001, "Development", "Bangalore");
	Department dept1=new Department(0004, "Testing", "chennai");
	Employee emp1=new Employee(01, "Ravi", 25000);
	Employee emp2=new Employee(02, "Teertha", 35000);
	Employee emp3=new Employee(05, "Manu", 28000);
	Employee emp4=new Employee(06, "Rocky", 22000);
	m.put(emp1, dept1);
	m.put(emp2, dept);
	m.put(emp3, dept1);
	m.put(emp4, dept);
	int count=1;
	for(Map.Entry<Employee, Department> entry:m.entrySet()) {
		Employee emp=entry.getKey();
		Department department=entry.getValue();
		System.out.println("Employee "+count+" details :"+"\n"+ emp+"\t"+" department detils "+department);
		System.out.println();
	count++;
	}
	

}
}
