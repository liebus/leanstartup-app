package com.leanstartup.app.service;

import com.leanstartup.app.domain.Invoice;

public class UseCaseTwoFeeCalculationImpl implements FeeCalculation {
	
	public UseCaseTwoFeeCalculationImpl (){};

	public double calculateFee(Invoice invoice) {
		
		double amount = invoice.getAmount();
		double fee =0.0;
		if (amount < 100000)
			fee = amount * .2;
		else if (amount >= 100000 && amount < 500000)
			fee = amount * .1;
		else if (amount >= 500000)
			fee = amount * .05;
			
		return fee;
	}

}
