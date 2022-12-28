package com.deptwiseemp;



class EmployeeView { 
	  private String employeeId; 
	  private String name; 
	  private String dateOfBirth; 
	  private String departmentName; 
	 
	  public EmployeeView(String employeeId, String name, String dateOfBirth, String departmentName) { 
	    this.employeeId = employeeId; 
	    this.name = name; 
	    this.dateOfBirth = dateOfBirth; 
	    this.departmentName = departmentName; 
	  } 
	 
	  public String getEmployeeId() { 
	    return employeeId; 
	  } 
	 
	  public void setEmployeeId(String employeeId) { 
	    this.employeeId = employeeId; 
	  } 
	 
	  public String getName() { 
	    return name; 
	  } 
	 
	  public void setName(String name) { 
	    this.name = name; 
	  } 
	 
	  public String getDateOfBirth() { 
	    return dateOfBirth; 
	  } 
	 
	  public void setDateOfBirth(String dateOfBirth) { 
	    this.dateOfBirth = dateOfBirth; 
	  } 
	 
	  public String getDepartmentName() { 
	    return departmentName; 
	  } 
	 
	  public void setDepartmentName(String departmentName) { 
	    this.departmentName = departmentName; 
	  } 
}
	 
	   
	  
