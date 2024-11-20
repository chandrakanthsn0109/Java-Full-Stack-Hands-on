package com.spring.bean;

public class Employee {

	private int eid;
	private String ename;
	private int esalary;
	
	private Address add;
	private Department dept;

	public Employee() {
		super();
	}

	public Employee(int eid, String ename, int esalary, Address add, Department dept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
		this.add = add;
		this.dept = dept;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEsalary() {
		return esalary;
	}

	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + ", add=" + add + ", dept=" + dept
				+ "]";
	}

}
