package com.deptwiseemp;

import java.util.List;



public class DepartmentEmployeesView {
    private String departmentId;
    private List<EmployeeView> employees;

    public DepartmentEmployeesView(String departmentId ) {
        departmentId = departmentId;
        employees = employees;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        departmentId = departmentId;
    }

    public List<EmployeeView> getEmployees() {
        return employees;
    }

    public void setEmployees(EmployeeView ev) {
        ev = ev;
    }
}
