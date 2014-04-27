package com.leanstartup.app.domain;

import java.util.Date;

public class Fee {
	private double amount;
	private Date date;

	public Fee(double amount, Date date) {
		this.amount = amount;
		this.date = date;

	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
