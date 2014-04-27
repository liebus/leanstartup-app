package com.leanstartup.app.domain;

import java.util.Date;

public class Invoice {

	private long id;
	private double amount;
	private Date invoiceDate;

	public Invoice(long id, double amount, Date invoiceDate) {
		this.id = id;
		this.amount = amount;
		this.invoiceDate = invoiceDate;

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
}
