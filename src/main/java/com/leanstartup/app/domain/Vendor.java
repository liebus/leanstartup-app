package com.leanstartup.app.domain;

import java.util.ArrayList;

public class Vendor {

	private long id;
	private String name;
	private ArrayList<Fee> fees;

	public Vendor(long id, String name, Fee fee) {
		this.id = id;
		this.name = name;
		this.fees = new ArrayList<Fee>();
		this.fees.add(fee);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Fee> getfees() {
		return fees;
	}

	public void setFees(Fee fee) {
		this.fees.add(fee);
	}
}
