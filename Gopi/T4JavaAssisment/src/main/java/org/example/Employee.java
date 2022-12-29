package org.example;


import java.time.LocalDate;
import java.util.Date;

public class Employee {
        private String employeeId;
        private String name;
        private LocalDate dateOfBirth;
        private Department department;

        public Employee(String employeeId, String name, LocalDate dateOfBirth, Department department) {
            super();
            this.employeeId = employeeId;
            this.name = name;
            this.dateOfBirth = dateOfBirth;
            this.department = department;
        }

        public Employee() {
            super();
            // TODO Auto-generated constructor stub
        }


        /**
         * @return the employeeId
         */
        public String getEmployeeId() {
            return employeeId;
        }

        /**
         * @param employeeId the employeeId to set
         */
        public void setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
        }

        /**
         * @return the name
         */
        public String getName() {
            return name;
        }

        /**
         * @param name the name to set
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * @return the dateOfBirth
         */
        public LocalDate getDateOfBirth() {
            return dateOfBirth;
        }

        /**
         * @param dateOfBirth the dateOfBirth to set
         */
        public void setDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        /**
         * @return the department
         */
        public Department getDepartment() {
            return department;
        }

        /**
         * @param department the department to set
         */
        public void setDepartment(Department department) {
            this.department = department;
        }

        @Override
        public String toString() {
            return "Employee [employeeId=" + employeeId + ", name=" + name + ", dateOfBirth=" + dateOfBirth
                    + ", department=" + department + "]";
        }

       /* @Override
        public int compareTo(Employee o) {
            return (this.department.getDepartmentId().compareTo(o.department.getDepartmentId())) + (this.dateOfBirth.compareTo(o.dateOfBirth));
        }*/




    }


