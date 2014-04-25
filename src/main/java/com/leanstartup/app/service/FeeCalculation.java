package com.leanstartup.app.service;

import com.leanstartup.app.domain.Invoice;

public interface FeeCalculation {
	public double calculateFee (Invoice invoice);
}
