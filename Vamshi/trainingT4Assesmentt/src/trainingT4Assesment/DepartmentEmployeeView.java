package trainingT4Assesment;

import java.util.ArrayList;
import java.util.List;

public class DepartmentEmployeeView {
	String departmentId;
	List<EmployeeView> employeesList;
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public List<EmployeeView> getEmployeesList() {
		return employeesList;
	}
	public void setEmployeesList(EmployeeView employeesList) {
		this.employeesList.add(employeesList);
	}	
	public DepartmentEmployeeView(String departmentId) {
		this.departmentId = departmentId;
		this.employeesList = new ArrayList<EmployeeView>();
	}
	
}
