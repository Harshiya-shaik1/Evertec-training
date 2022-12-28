package My_t4;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
		public static void main(String args[]) {
			
			Scanner sc= new Scanner(System.in);
			HashMap<String,String> departmentMap=new HashMap<String,String>();
			List<DepartmentEmployeeView> depatmentEmpViewList = new ArrayList<DepartmentEmployeeView>();
			while(true) {
				System.out.println("enter options from below");
				System.out.println("1) Create Department");
				System.out.println("2) Create Employee");
				System.out.println("3) Department wise Report");
				int n=sc.nextInt();
				switch(n) {
				case 1:
					try {
						System.out.println("Enter Department Details");
						System.out.println("Department Id -->");
						String deptId=sc.next();
						System.out.println("Departmnet Name -->");
						String deptName=sc.next();
						if(deptId=="" || deptName=="")
							
							throw new ArgumentException("Enter all the fields");
						if(!deptId.startsWith("D"))
							throw new ArgumentException("Department Id must starts with D");
						departmentMap.put(deptId, deptName);
						DepartmentEmployeeView dObj = new DepartmentEmployeeView(deptId);
						depatmentEmpViewList.add(dObj);
						System.out.println("Department Created Successfully ");
						System.out.println("------------------------------");
					}
					catch(ArgumentException e) {
						System.err.println("Department could not be added  "+e.getMessage());
						
					}
				break;
				case 2:
					try {
						System.out.println("Enter Employee Details");
						System.out.println("EmployeeId -->");
						String empId=sc.next();
						System.out.println("EmployeeName -->");
						String empName=sc.next();
						System.out.println("Date of Birth (dd/mm/yyyy) -->");
		             	String empDOB=sc.next();
						System.out.println("DepartmentId -->");
						String deptId=sc.next();
						if(empId=="" || empName=="" || empDOB=="" || deptId=="")
							throw new ArgumentException("all Fields are mandatory");

						DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
						LocalDate empDOBlocaldate = LocalDate.parse(empDOB, formatter);
						
						EmployeeView empView = new EmployeeView(empId, empName ,empDOBlocaldate,deptId);
						Boolean flag = true;
					    for(DepartmentEmployeeView dept: depatmentEmpViewList) {
							if(dept.getDepartmentId().equals(deptId)) {
								dept.setEmployeesList(empView);
								flag=false;
								break;
							}
						}
					    if(flag) {
					    	System.out.println("Department not found\n Employee adding failed");
					    }
					    else
					    	System.out.println("Employee added");
						System.out.println("------------------------------");
					}
					catch(ArgumentException e) {
						System.out.println("please enter all the fields");
					}
					catch(DateTimeParseException e) {
						System.out.println("date couldnot be parsed. valid formate is dd/mm/yyyy");
					}

			    break;
				case 3:
					 System.out.println("Department Id"+"   "+"Department Name"+"   "+ "Employee Name"+"   "+" Age");
					 for(DepartmentEmployeeView dept: depatmentEmpViewList) {
						 //sorting based on age.
						 List<EmployeeView> empList = dept.getEmployeesList();
						 int size = empList.size();
						 for(int i=0;i<size-1;i++){
							 for(int j=i+1;j<size;j++){
								 int age1 = Period.between( empList.get(i).getDateOfBirth(), LocalDate.now()).getYears();
								 int age2 = Period.between( empList.get(j).getDateOfBirth(), LocalDate.now()).getYears();
								 EmployeeView temp;
								 if(age1<age2){
									 temp = empList.get(i);
									 empList.set(i,empList.get(j));
									 empList.set(j, temp);
								 }
							 }
						 }
						 for(EmployeeView emp: empList) {
							 int age = Period.between( emp.getDateOfBirth(), LocalDate.now()).getYears();
							 String deptId = dept.getDepartmentId();
							 System.out.println(deptId+"\t\t"+departmentMap.get(deptId)+"\t\t"+emp.getName()+"\t\t"+age);
						 }
					 }
					System.out.println("------------------------------");
				break;
				
			    default:
					System.out.println("Please enter the valid input");
					System.out.println("---------------------------");
				continue;
				
				}
				 System.out.println("Want to continue? Y|N [Default Y]");
				 char ch=sc.next().charAt(0);
				 if(ch=='y' || ch == 'Y') {
					 continue;
				 }
				 else if(ch=='n' || ch == 'N') {
					 break;
				 }
				 else {
					 System.out.println("only Y or N is accepted");
					 System.out.println("Default Y is selected");
				 }
				System.out.println("------------------------------");
			}
			System.out.println("Thank You");
		}

}
