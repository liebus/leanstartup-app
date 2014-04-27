package com.leanstartup.app;

import java.util.ArrayList;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;
import com.leanstartup.app.domain.Fee;
import com.leanstartup.app.domain.Vendor;

public class VendorTest {

	@Test
	public void testVendor() {
		Fee fee = new Fee(400000, new Date());
		Vendor vendor = new Vendor(1l, "MyComp", fee);
		try {

			Assert.assertEquals(vendor.getId(), 1l, 0);
			Assert.assertEquals(vendor.getName(), "MyComp");
			ArrayList<Fee> list = new ArrayList<Fee>();
			list.add(fee);
			Assert.assertEquals(vendor.getfees(), list);
			vendor.setId(2l);
			vendor.setName("YourComp");
			Fee fee1 = new Fee(600000, new Date());
			list.add(fee1);
			vendor.setFees(fee1);
			Assert.assertEquals(vendor.getId(), 2l, 0);
			Assert.assertEquals(vendor.getName(), "YourComp");
			Assert.assertEquals(vendor.getfees(), list);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}
}
