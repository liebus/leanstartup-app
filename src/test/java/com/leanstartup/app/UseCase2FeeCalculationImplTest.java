package com.leanstartup.app;

import java.util.Date;
import org.junit.Assert;
import org.junit.Test;

import com.leanstartup.app.domain.Invoice;
import com.leanstartup.app.service.FeeCalculation;
import com.leanstartup.app.service.UseCaseTwoFeeCalculationImpl;
public class UseCase2FeeCalculationImplTest {
	
	Invoice invoice = new Invoice (1L, 50000, new Date());
	Invoice invoice1 = new Invoice (2L, 200000, new Date());
	Invoice invoice2 = new Invoice (3L, 600000, new Date());
	FeeCalculation fc = new UseCaseTwoFeeCalculationImpl();
	@Test
	public void calculateFeeTest (){
		Assert.assertEquals(fc.calculateFee(invoice), 10000, 0);
		Assert.assertEquals(fc.calculateFee(invoice1), 20000, 0);
		Assert.assertEquals(fc.calculateFee(invoice2), 30000, 0);
	}
}
