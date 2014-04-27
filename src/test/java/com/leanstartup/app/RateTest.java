package com.leanstartup.app;

import org.junit.Assert;
import org.junit.Test;

import com.leanstartup.app.domain.Rate;

public class RateTest {

	@Test
	public void testRate() {
		Rate rate = new Rate(.1, 0.0, 100000.0);
		try {

			Assert.assertEquals(rate.getRate(), .1, 0);
			Assert.assertEquals(rate.getLowerBound(), .0, 0);
			Assert.assertEquals(rate.getUpperBound(), 100000, 0);
			rate.setRate(.2);
			rate.setLowerBound(100000);
			rate.setUpperBound(500000);
			Assert.assertEquals(rate.getRate(), .2, 0);
			Assert.assertEquals(rate.getLowerBound(), 100000.0, 0);
			Assert.assertEquals(rate.getUpperBound(), 500000, 0);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}
}
