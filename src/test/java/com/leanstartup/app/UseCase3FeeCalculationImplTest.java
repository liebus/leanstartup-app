package com.leanstartup.app;

import java.util.ArrayList;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;

import com.leanstartup.app.domain.Invoice;
import com.leanstartup.app.domain.Rate;
import com.leanstartup.app.service.FeeCalculation;
import com.leanstartup.app.service.UseCaseThreeFeeCalculationImpl;

import com.leanstartup.app.util.RateUtil;
public class UseCase3FeeCalculationImplTest {
	
	Invoice invoice = new Invoice (1L, 50000, new Date());
	Invoice invoice1 = new Invoice (2L, 200000, new Date());
	Invoice invoice2 = new Invoice (3L, 600000, new Date());
	Invoice invoice3 = new Invoice (4L, 1200000, new Date());
	ArrayList<Rate> al = new ArrayList<Rate>();
	boolean b = al.add(new Rate (0.2, 0, 100000));
	boolean b1 = al.add(new Rate (0.1, 100000, 500000));
	boolean b2 = al.add(new Rate (.05, 500000,1000000));
	boolean b3 = al.add(new Rate (.04, 1000000,1500000));
	RateUtil ru = new RateUtil(al);
	FeeCalculation fc = new UseCaseThreeFeeCalculationImpl(ru);
	
	@Test
	public void calculateFeeTest (){
		Assert.assertEquals(fc.calculateFee(invoice), 10000, 0);
		Assert.assertEquals(fc.calculateFee(invoice1), 20000, 0);
		Assert.assertEquals(fc.calculateFee(invoice2), 30000, 0);
		Assert.assertEquals(fc.calculateFee(invoice3), 48000, 0);
	}
	
}
