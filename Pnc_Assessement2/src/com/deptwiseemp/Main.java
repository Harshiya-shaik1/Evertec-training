package com.deptwiseemp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;




 
public class Main { 
  public static void main(String[] args) throws ArgumentException { 
    Scanner scanner = new Scanner(System.in); 
    Map<String,String>departments = new HashMap<>(); 
    //ArrayList<Employee> employees = new ArrayList<>(); 
    List<DepartmentEmployeesView> deptViewList = new ArrayList<>(); 
    //DepartmentWiseEmployeeList dempl = new DepartmentWiseEmployeeList();
    while (true){ 
      System.out.println("Choose an option:"); 
      System.out.println("1. Create a department"); 
      System.out.println("2. Create an employee"); 
      System.out.println("3. Report department-wise employee list"); 
      System.out.println("4. Exit"); 
 
      int option = scanner.nextInt(); 
 
      if (option == 1) { 
    	  try {
        // create a department 
        System.out.println("Enter department ID:"); 
        String departmentId = scanner.next(); 
 
        System.out.println("Enter department name:"); 
        String departmentName = scanner.next(); 
 
        if(!departmentId.startsWith("D")||!departmentName.matches("Accounts||Sales||Hr"))
        	throw new ArgumentException("Department Id or Name wrong");
        departments.put(departmentId, departmentName);
        DepartmentEmployeesView dev=new DepartmentEmployeesView(departmentId);
        deptViewList.add(dev);
    	  
        System.out.println("Department created successfully!");
    	  }
        catch(ArgumentException e) {
        	System.err.println(e.getMessage());
        }
      }
    	  
      else if (option == 2) { 
    	   try {
        // create an employee 
    	 
        System.out.println("Enter employee ID:"); 
        String employeeId = scanner.next();
        System.out.println("Enter employee name:"); 
        String name = scanner.next();   
        System.out.println("Enter employee date of birth (dd/MM/yyyy):"); 
        String dobString = scanner.next();
        System.out.println("Enter employee's department ID:"); 
        String departmentId = scanner.next();
       
        if(!employeeId.startsWith("E")||!name.matches("John||Ram||Scott")||dobString==""||departmentId=="")
    	
    	throw new ArgumentException("Employee Id or Name or Department Id wrong");
    	   
        try { 
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dobString); 
           } catch (Exception e) { 
             System.err.println("Invalid date format. Please enter the date in the format dd/MM/yyyy."); 
           }
    	 EmployeeView ev=new EmployeeView(employeeId,name,dobString,departmentId);
    	 
    	
    	 for (DepartmentEmployeesView dev : deptViewList) { 
             if (dev.getDepartmentId().equals(departmentId)) {
           	  dev.setEmployees(ev);
           	  break;
             } 
           }
    	   
    	 System.out.println("Employee created successfully!");
       }
    	  catch(ArgumentException e) {
    		  System.err.println(e.getMessage());   
    	  }
       }
     
      else  if(option==3) {
   
          // sort employee views by age 
          for (DepartmentEmployeesView view : deptViewList) { 
            Collections.sort(view.getEmployees(), (e1, e2) -> e1.getDateOfBirth().compareTo(e2.getDateOfBirth())); 
          } 
   
          // print department-wise employee list 
          System.out.println("Department Id" + " " + "Department Name" + " " + "Employee Name" + " " + "Age");

          LocalDate curDate = LocalDate.now();
          for (DepartmentEmployeesView view : deptViewList) { 
            System.out.println("Department ID: " + view.getDepartmentId() ); 
            for (EmployeeView employeeView : view.getEmployees()) { 
              System.out.println(employeeView.getDepartmentName() +" "+ employeeView.getEmployeeId() + " " + employeeView.getName() + " " + Period.between(LocalDate.parse(employeeView.getDateOfBirth()),curDate).getYears()); 
            } 
          } 
      }
      
      else if (option == 4) { 
          // exit 
          break; 
        } else { 
          System.out.println("Invalid option. Please choose a valid option."); 
        } 
      } 
   
      scanner.close(); 
    } 
  } 


	  
      /* LocalDate curDate = LocalDate.now();
        System.out.println("Department Id" + " " + "Department Name" + " " + "Employee Name" + " " + "Age");

        for(DepartmentEmployeesView dev : deptViewList){

            for(EmployeeView ev : dev.getEmployees()){
                System.out.print(dev.getDepartmentId() + " " + ev.getDepartmentName() + " " + ev.getName() + " " + Period.between(LocalDate.parse(ev.getDateOfBirth()),curDate).getYears());
                System.out.println();
   		}}*/
        
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	  
    	
        
   
 

 

 
 
 

	
  







		

	