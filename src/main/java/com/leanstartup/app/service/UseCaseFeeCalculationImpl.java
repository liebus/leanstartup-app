package com.leanstartup.app.service;

import com.leanstartup.app.domain.Invoice;

public class UseCaseFeeCalculationImpl implements FeeCalculation {
	
	public UseCaseFeeCalculationImpl (){};

	public double calculateFee(Invoice invoice) {
		
		double amount = invoice.getAmount();
		double fee =0.0;
		if (amount < 100000)
			fee = amount * .2;
		else
			fee = amount * .1;
			
		return fee;
	}

}
