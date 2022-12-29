package org.example;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;





import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Date;

import static java.lang.Integer.parseInt;

public class DepartmentWise_EmployeeList {
    public static void main(String[] args) throws ArgumentException {
        Employee employee;
        Department department;
        List<Department> l1 = new ArrayList<Department>();
        List<Employee> l2 = new ArrayList<Employee>();
        Scanner sc = new Scanner(System.in);
        /*SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
         */
        //  DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Enter number of departments");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("please enter the departmentId");
            String departmentId = sc.next();

            if(!departmentId.startsWith("D")){
                throw new ArgumentException("please enter departmentId Starts D");
            }

            System.out.println("please enter the departmentName");
            String departmentName = sc.next();


            department = new Department(departmentId, departmentName);
            l1.add(department);
        }

        System.out.println("Enter number of employees");
        int m = sc.nextInt();
        for (int j = 0; j < m; j++) {

            try {
                System.out.println("please enter the employeeId");
                String employeeId = sc.next();

                if (Character.isLowerCase(employeeId.charAt(0)) || employeeId.charAt(0) != 69) {
                    throw new PleaseEnterLatterStartsWithE("EmployeeId sStarts with E");


                }
                System.out.println("enter employee name");
                String employeeName = sc.next();
                System.out.println("enter the date of birth in YYYY-MM-DD");
                String dateOfBirth = sc.next();
                System.out.println("enter departmentid");
                String departmentId1 = sc.next();

                Department department1 = null;
                for (Department d : l1) {
                    if (d.getDepartmentId().equals(departmentId1)) {
                        department1 = d;
                    }
                }
                try {
                    LocalDate date1 = LocalDate.parse(dateOfBirth);
                    employee = new Employee(employeeId, employeeName, date1, department1);
                    l2.add(employee);
                } catch (Exception e1) {

                    e1.printStackTrace();
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
            Collections.sort(l2,new AgeComparator());
        // grouping employees based on dpt
            List<DepartmentEmployeesView> departmentEmplysView = new ArrayList<>();
            DepartmentEmployeesView deptEmpsView;
            for (Department dept : l1) {
                deptEmpsView = new DepartmentEmployeesView();

                deptEmpsView.setDepartmentName(dept.getDepartmentName());
                List<Employee> emps = l2.stream()
                        .filter(X -> X.getDepartment().getDepartmentId().equals(dept.getDepartmentId()))
                        .collect(Collectors.toList());
                deptEmpsView.setEmployees(emps);
                departmentEmplysView.add(deptEmpsView);
            }
                //printting formet
            System.out.println("DepartmentId DepartmentName EmployeeName Age");
            for (DepartmentEmployeesView dEV : departmentEmplysView) {
                for (Employee e : dEV.getEmployees()) {

                    LocalDate date1 = LocalDate.now();


                    int difference = Period.between(e.getDateOfBirth(), date1).getYears();
                    System.out.print(e.getDepartment().getDepartmentId() + "          "
                            + e.getDepartment().getDepartmentName() + "       " + e.getName() + "  " + difference + " \n");
                }
            }
            sc.close();
        }



}

/*
DepartmentId DepartmentName EmployeeName Age
D001          Hr       gopi      23              if both ages are same it will sort based on employee name only;
D001          Hr       krishna   23
D002          Sales    Dama      72              same dpt older age person come frist(desending order)
D002          Sales    jaya       2     */



