

package com.deptwiseemp;

import java.util.Date;

class Employee { 
  private String employeeId; 
  private String name; 
  private Date dateOfBirth; 
  private String departmentId; 
 
  public Employee(String employeeId, String name, Date dateOfBirth, String departmentId) { 
    this.employeeId = employeeId; 
    this.name = name; 
    this.dateOfBirth = dateOfBirth; 
    this.departmentId = departmentId; 
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
 
  public Date getDateOfBirth() { 
    return dateOfBirth; 
  } 
 
  public void setDateOfBirth(Date dateOfBirth) { 
    this.dateOfBirth = dateOfBirth; 
  } 
 
  public String getDepartmentId() { 
    return departmentId; 
  } 
 
  public void setDepartment(String departmentId) { 
    this.departmentId = departmentId; 
  } 
} 
