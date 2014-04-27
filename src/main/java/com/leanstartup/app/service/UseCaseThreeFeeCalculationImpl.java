package com.leanstartup.app.service;

import java.util.ArrayList;

import com.leanstartup.app.domain.Invoice;
import com.leanstartup.app.domain.Rate;
import com.leanstartup.app.util.RateUtil;

public class UseCaseThreeFeeCalculationImpl implements FeeCalculation {
	RateUtil  ru;
	public UseCaseThreeFeeCalculationImpl (RateUtil ru){
		this.ru = ru;
	};

	public double calculateFee(Invoice invoice) {
		
		double amount = invoice.getAmount();
		double rate = ru.getRate (invoice);
		return amount*rate;
	}

}
