package com.departmentEmployee;

import java.util.Date;



public class Employee {
	private String EmployeeId;
	private String Name;
	private Date DateOfBirth;
    private Department department;
    
    
    
	public Employee() {
		super();
	}
	public Employee(String employeeId, String name, Date dateOfBirth, Department departmentId) {
		super();
		EmployeeId = employeeId;
		Name = name;
		DateOfBirth = dateOfBirth;
		department = departmentId;
	}
	public String getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(String employeeId) {
		EmployeeId = employeeId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(Date string) {
		DateOfBirth = string;
	}
	public Department getDepartmentId() {
		return department;
	}
	public void setDepartmentId(Department string) {
		department = string;
	}
	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", Name=" + Name + ", DateOfBirth=" + DateOfBirth + "]";
	}
	
	
	
	
    
    
	
    
    
    

}