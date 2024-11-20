package com.spring.bean;

public class Department {

	private int dno;
	private String dname;
	
	public Department() {
		super();
	}

	public Department(int dno, String dname) {
		super();
		this.dno = dno;
		this.dname = dname;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Department [dno=" + dno + ", dname=" + dname + "]";
	}
	
}
