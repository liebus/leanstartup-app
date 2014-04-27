package com.leanstartup.app.service;

import com.leanstartup.app.domain.Fee;
import com.leanstartup.app.domain.Invoice;
import com.leanstartup.app.domain.Vendor;
import com.leanstartup.app.util.RateUtil;

public class UseCaseFourFeeCalculationImpl implements FeeCalculation {
	RateUtil ru;
	Vendor vendor;
	private static final double costBasisRate = 0.0125;

	public UseCaseFourFeeCalculationImpl(Vendor vendor, RateUtil ru) {
		this.vendor = vendor;
		this.ru = ru;
	}

	public double calculateFee(Invoice invoice) {
		double rate = ru.getRate(invoice);
		double amount = invoice.getAmount();
		double costBasis = 0;
		for (Fee fee : vendor.getfees()) {
			costBasis = costBasis + fee.getAmount();
		}
		if (costBasis >= 2 * amount)
			return amount * rate - costBasis * costBasisRate;
		else
			return amount * rate;
	}

}
