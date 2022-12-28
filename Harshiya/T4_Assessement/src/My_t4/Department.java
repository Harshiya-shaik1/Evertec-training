package My_t4;

public class Department {
		String departmentId;
		String departmentName;
		
		public Department(String departmentId, String departmentName) {
			super();
			this.departmentId = departmentId;
			this.departmentName = departmentName;
		}
		public Department() {
			// TODO Auto-generated constructor stub
		}
		public String getDepartmentId() {
			return departmentId;
		}
		public void setDepartmentId(String departmentId) {
			this.departmentId = departmentId;
		}
		public String getDepartmentName() {
			return departmentName;
		}
		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}
		@Override
		public String toString() {
			return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
		}
		

}
