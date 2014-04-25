package com.leanstartup.app;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;
import com.leanstartup.app.domain.Invoice;

public class InvoiceTest 
{	
	
	
	@Test
	public void testInvoice() {
	Date d = new Date();
	Invoice invoice = new Invoice (1L, 50000, d);
	DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	String today="24/04/2014";
	 try 
	 {
		 
         Assert.assertEquals((long)invoice.getId(),(long)1l);
         Assert.assertEquals(invoice.getAmount(), 50000, 0);
         Assert.assertSame(invoice.getInvoiceDate(), d);
         invoice.setId(2l);
         invoice.setAmount(100000);
         Date date = formatter.parse(today);
         invoice.setInvoiceDate(date);
         Assert.assertEquals(invoice.getAmount(), 100000, 0);
         Assert.assertEquals((long)invoice.getId(),(long)2);
         Assert.assertSame(invoice.getInvoiceDate(), date);
     } catch (Exception e) 
     {
         Assert.fail(e.getMessage());
     }
}
}
