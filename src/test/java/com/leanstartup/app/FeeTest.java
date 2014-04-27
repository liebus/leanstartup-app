package com.leanstartup.app;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;

import com.leanstartup.app.domain.Fee;

public class FeeTest {

	@Test
	public void testFee() {
		Date d = new Date();
		Fee fee = new Fee(10000, d);
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String today = "24/04/2014";
		try {

			Assert.assertEquals(fee.getAmount(), 10000, 0);
			Assert.assertSame(fee.getDate(), d);
			fee.setAmount(20000);
			Date date = formatter.parse(today);
			fee.setDate(date);
			Assert.assertEquals(fee.getAmount(), 20000, 0);
			Assert.assertSame(fee.getDate(), date);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}
}
