package trainingT4Assesment;

import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
		public static void main(String args[]) {
			
			Scanner sc= new Scanner(System.in);
			HashMap<String,String> deptMap=new HashMap<String,String>();
			List<DepartmentEmployeeView> deptEmpViewList = new ArrayList<DepartmentEmployeeView>();
			while(true) {
				System.out.println("======================");
				System.out.println("1-> Create Department");
				System.out.println("2-> Create Employee");
				System.out.println("3-> Department wise Report");
				System.out.println("======================");
				System.out.println("enter options from above");
				int n=sc.nextInt();
				if(n==1) {
					try {
						System.out.println("Enter DepartmentId");
						String dptId=sc.next();
						System.out.println("Enter DepartmnetName");
						String dName=sc.next();
						if(!dptId.startsWith("D") || dName=="")
							throw new ArgumentException(" depatrment id or name is wrong ");
						deptMap.put(dptId, dName);
						DepartmentEmployeeView dObj = new DepartmentEmployeeView(dptId);
						deptEmpViewList.add(dObj);
						System.out.println("======Department Added==========");
					}
					catch(ArgumentException e) {
						System.err.println(e.getMessage());
					}
				}
				if (n==2) {
					try {
						System.out.println("Enter EmployeeId");
						String eid=sc.next();
						System.out.println("Enter EmployeeName");
						String eName=sc.next();
						System.out.println("Enter Date of Birth ");
		             	String edob=sc.next();
						System.out.println("Enter DepartmentId ");
						String dId=sc.next();
						if(eid=="" || eName=="" || edob=="" || dId=="")
							throw new ArgumentException("please enter all the fields");

						DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
						LocalDate dob = LocalDate.parse(edob, formatter);
						
						EmployeeView eObj = new EmployeeView(eid, eName ,dob,dId);
						
						    for(DepartmentEmployeeView dptObj: deptEmpViewList) {
							if(dptObj.getDepartmentId().equals(dId)) {
								dptObj.setEmployeesList(eObj);
								break;
							}
						}
						System.out.println("=====Employee details added========");
					}
					catch(ArgumentException e) {
						System.out.println("please enter all the fields");
					}

				} 
				 if(n==3) {
					 System.out.println("Department Id\tDepartment Name\t Employee Name\t Age");
					 for(DepartmentEmployeeView dptObj: deptEmpViewList) {
						 int size = dptObj.getEmployeesList().size();
						 for(int i=0;i<size;i++){
							 for(int j=i+1;j<size;j++){
								 int age1 = Period.between( dptObj.getEmployeesList().get(i).getDateOfBirth(), LocalDate.now()).getYears();
								 int age2 = Period.between( dptObj.getEmployeesList().get(j).getDateOfBirth(), LocalDate.now()).getYears();
								 if(age1<age2){
									 Collections.swap(dptObj.getEmployeesList(),i,j);
								 }
							 }
						 }
						 for(EmployeeView empView: dptObj.getEmployeesList()) {
							 int age = Period.between( empView.getDateOfBirth(), LocalDate.now()).getYears();
							 String deptId = dptObj.getDepartmentId();
							 System.out.println(deptId+"\t"+deptMap.get(deptId)+"\t"+empView.getName()+"\t"+age);
						 }
					 }
					 
					 /* System.out.println("Department Id\tDepartment Name\t Employee Name\t Age");
					 for(DepartmentEmployeeView dptObj: deptEmpViewList) {
						 for(EmployeeView empView: dptObj.getEmployeesList()) {
							 int age = Period.between( empView.getDateOfBirth(), LocalDate.now()).getYears();
							 String deptId = dptObj.getDepartmentId();
							 System.out.println(deptId+"\t"+deptMap.get(deptId)+"\t"+empView.getName()+"\t"+age);
						 }
					 }*/
				 } 
				 System.out.println("do you wis to proceed y or n");
				 char ch=sc.next().charAt(0);
				 if(ch=='y') {
					 continue;
				 }
					 else
					 {
					 break;
				 }
				
			}
			
		}

}
