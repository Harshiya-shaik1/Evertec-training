package com.departmentEmployee;

public class Department {
 private String DepartmentId;
 private String DepartmentName;
 
 
public String getDepartmentId() {
	return DepartmentId;
}
public void setDepartmentId(String departmentId) {
	DepartmentId = departmentId;
}
public String getDepartmentName() {
	return DepartmentName;
}
public void setDepartmentName(String departmentName) {
	DepartmentName = departmentName;
}
@Override
public String toString() {
	return "Department [DepartmentId=" + DepartmentId + ", DepartmentName=" + DepartmentName + "]";
}
 

 
 

}