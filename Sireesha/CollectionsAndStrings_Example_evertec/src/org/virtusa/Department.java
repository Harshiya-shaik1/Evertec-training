package org.virtusa;

public class Department {
	int deptId;
	String deptName;
	String loc;
public Department() {
	// TODO Auto-generated constructor stub
}
public Department(int deptId, String deptName, String loc) {
	super();
	this.deptId = deptId;
	this.deptName = deptName;
	this.loc = loc;
}
public int getDeptId() {
	return deptId;
}
public void setDeptId(int deptId) {
	this.deptId = deptId;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}
@Override
public String toString() {
	return "deptId=" + deptId + ", deptName=" + deptName + ", loc=" + loc;
}

}
