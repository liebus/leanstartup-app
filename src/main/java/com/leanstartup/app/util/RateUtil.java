package com.leanstartup.app.util;

import java.util.ArrayList;

import com.leanstartup.app.domain.Invoice;
import com.leanstartup.app.domain.Rate;

public class RateUtil  {
	ArrayList<Rate> list;
	
	public RateUtil (ArrayList<Rate> list){
		this.list = list;
	}

	public double getRate(Invoice invoice) {
		
		for (Rate rate: this.list){
			if (invoice.getAmount()>=rate.getLowerBound() && invoice.getAmount()<rate.getUpperBound())
				return rate.getRate();
		}
			
		return 0;
	}

}
