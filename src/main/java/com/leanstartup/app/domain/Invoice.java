package com.leanstartup.app.domain;

import java.util.Date;

public class Invoice {
	
	private Long id;
    private double amount;
    private Date invoiceDate;
    public Invoice (Long id, double amount, Date invoiceDate) {
    	this.id=id;
    	this.amount=amount;
    	this.invoiceDate=invoiceDate;
    	
    }
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
