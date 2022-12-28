package My_t4;

import java.util.ArrayList;
import java.util.List;

public class DepartmentEmployeeView {
	String departmentId;
	List<EmployeeView> employees;
	
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public List<EmployeeView> getEmployeesList() {
		return employees;
	}
	public void setEmployeesList(EmployeeView employees) {
		this.employees.add(employees);
	}	
	public DepartmentEmployeeView(String departmentId) {
		this.departmentId = departmentId;
		this.employees = new ArrayList<EmployeeView>();
	}
	public void setEmployeesList(List<EmployeeView>  employees) {
		this.employees = employees;
	}	
	
}
