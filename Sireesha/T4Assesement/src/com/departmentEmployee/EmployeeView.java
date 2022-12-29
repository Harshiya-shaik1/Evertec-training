package com.departmentEmployee;

import java.util.Date;



public class EmployeeView implements Comparable<EmployeeView>{
	

	public String employeeId;
	public String employeeName;
	public Date dateOfBirth;
	public Department department;
	public EmployeeView(String employeeId, String employeeName, Date dateOfBirth, Department departmentName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dateOfBirth = dateOfBirth;
		this.department = departmentName;
	}
	public EmployeeView() {
		super();

	}
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public int compareTo(EmployeeView o) {
		// TODO Auto-generated method stub
		
		return  this.department.getDepartmentId().compareTo(o.getDepartment().getDepartmentId())+this.dateOfBirth.compareTo(o.getDateOfBirth());
	}
	

}