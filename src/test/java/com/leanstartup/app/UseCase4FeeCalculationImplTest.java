package com.leanstartup.app;

import java.util.ArrayList;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;

import com.leanstartup.app.domain.Fee;
import com.leanstartup.app.domain.Invoice;
import com.leanstartup.app.domain.Rate;
import com.leanstartup.app.domain.Vendor;
import com.leanstartup.app.service.FeeCalculation;
import com.leanstartup.app.service.UseCaseFourFeeCalculationImpl;
import com.leanstartup.app.util.RateUtil;

public class UseCase4FeeCalculationImplTest {

	Invoice invoice = new Invoice(1L, 200000, new Date());

	ArrayList<Rate> rl = new ArrayList<Rate>();
	boolean r = rl.add(new Rate(0.2, 0, 100000));
	boolean r1 = rl.add(new Rate(0.1, 100000, 500000));
	boolean r2 = rl.add(new Rate(.05, 500000, 1000000));
	boolean r3 = rl.add(new Rate(.04, 1000000, 1500000));
	RateUtil ru = new RateUtil(rl);
	Fee fee = new Fee(400000, new Date());

	Vendor vendor = new Vendor(1l, "MyComp", fee);
	FeeCalculation fc = new UseCaseFourFeeCalculationImpl(vendor, ru);

	@Test
	public void calculateFeeTest() {
		Assert.assertEquals(fc.calculateFee(invoice), 15000, 0);

	}

}
