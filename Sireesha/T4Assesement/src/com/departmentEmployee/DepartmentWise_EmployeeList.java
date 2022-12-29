package com.departmentEmployee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DepartmentWise_EmployeeList {

	public static void main(String[] args) {
		List<Department> deptList = new ArrayList<>();
		List<Employee> empList = new ArrayList<>();
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");

		Scanner sc = new Scanner(System.in);
		System.out.println("How many departments?");
		int n = sc.nextInt();
		System.out.println("Enter no of Employees");
		int m = sc.nextInt();
		System.out.println("Enter Department Details");
		Department dep;
		int i = 0;
		try {
			while (i < n) {
				dep = new Department();
				System.out.println("Enter " + (i + 1) + "DepartmentData : ");

				System.out.println("Enter DepartmentId: ");
				String id = sc.next();
				Department d=deptList.stream().filter(x->x.getDepartmentId().equals(id)).findAny().orElse(null);
				if(d!=null) {
					throw new Arugument_Exception("id should be unique");
				}
				if (!id.startsWith("D")) {
					throw new Arugument_Exception("First letter should be start with UpperCase D");
				}
				if(id.length()!=3) {
					throw new Arugument_Exception("Three characters only allowed");
				}

			    dep.setDepartmentId(id);

				System.out.println("Enter Department name: ");
				
				dep.setDepartmentName(sc.next());
				deptList.add(dep);
				i++;
				

			}

			System.out.println("Enter Employee details");
			Employee emp;
			int j = 0;
			while (j < m) {
				emp = new Employee();
				System.out.println("Enter" + (i + 1) + "Employeedata: ");

				System.out.println("Enter EmployeeId: ");
				String Eid = sc.next();
				Employee emp1=empList.stream().filter(x->x.getEmployeeId().equals(Eid)).findAny().orElse(null);
				if(emp1!=null) {
					throw new Arugument_Exception("id should be unique");
				}
				if (!Eid.startsWith("E")) {
					throw new Arugument_Exception("First letter should be start with UpperCase E");
				}
				if(Eid.length()!=4) {
					throw new Arugument_Exception("Four characters only allowed");
				}
				emp.setEmployeeId(Eid);

				System.out.println("Enter Employee name :");
				emp.setName(sc.next());

				System.out.println("Enter employee departmentId: ");
				String id = sc.next();
				for (Department d : deptList) {
					if (d.getDepartmentId().equals(id)) {
						emp.setDepartmentId(d);

					}

				}
				System.out.println("Enter Employee DeteOfBirth:DD/MM/YYYY ");
				Date dob;
				try {
					dob = date.parse(sc.next());
					emp.setDateOfBirth(dob);
				} catch (ParseException e2) {

					e2.printStackTrace();
				}

				empList.add(emp);

				j++;

			}
		} catch (Arugument_Exception e) {
			System.out.println(e);
		}
		//Adding all the employee details in to the EmployeeviewList object
		List<EmployeeView> empviews = new ArrayList<>();
		EmployeeView empView;
		for (Employee emp1 : empList) {
			empView = new EmployeeView();
			empView.employeeId = emp1.getEmployeeId();
			empView.employeeName = emp1.getName();
			empView.dateOfBirth = emp1.getDateOfBirth();
			empView.department = emp1.getDepartmentId();
			empviews.add(empView);

		}
		Collections.sort(empviews);
		DepartmentEmployeeView deptEmp;
		List<DepartmentEmployeeView> deptviews = new ArrayList<>();

		for (Department dept1 : deptList) {

			List<EmployeeView> employees = empviews.stream()
					.filter(id -> id.department.getDepartmentId().equals(dept1.getDepartmentId()))
					.collect(Collectors.toList());
			deptEmp = new DepartmentEmployeeView();
			deptEmp.departmentId = dept1.getDepartmentId();
			deptEmp.employees = employees;
			deptviews.add(deptEmp);

		}
		System.out.println("Department id   Department Name   Employee id   Employee Name   age");
		for (EmployeeView ev : empviews) {
			long difference = new Date().getTime() - ev.dateOfBirth.getTime();

			difference = (difference / (1000l * 60 * 60 * 24 * 365));
			System.out.println(ev.department.getDepartmentId() + "  " + ev.department.getDepartmentName() + "  "
					+ ev.getEmployeeId() + "  " + ev.getEmployeeName() + "  " + difference);

		}

	}
}
