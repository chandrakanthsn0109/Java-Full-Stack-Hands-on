package com.day1.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

	@Id
	@Column(name = "eid")
	private int eid;
	
	@Column(name = "ename")
	private String ename;
	
	@Column(name = "esalary")
	private int esalary;
	
	public Employee() {
		super();
	}

	public Employee(int eid, String ename, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
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

	@Override
	public String toString() {
		return "eid : " + eid + " ename : " + ename + " esalary : " + esalary;
	}
	
}
