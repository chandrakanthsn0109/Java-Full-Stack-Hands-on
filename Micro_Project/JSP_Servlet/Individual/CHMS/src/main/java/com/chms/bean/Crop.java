package com.chms.bean;

public class Crop {
	
	private int cid;
	private String cname;
	private int cultPeriod;
	private int harCap;
	
	public Crop() {
		super();
	}

	public Crop(int cid, String cname, int cultPeriod, int harCap) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cultPeriod = cultPeriod;
		this.harCap = harCap;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCultPeriod() {
		return cultPeriod;
	}

	public void setCultPeriod(int cultPeriod) {
		this.cultPeriod = cultPeriod;
	}

	public int getHarCap() {
		return harCap;
	}

	public void setHarCap(int harCap) {
		this.harCap = harCap;
	}

}
