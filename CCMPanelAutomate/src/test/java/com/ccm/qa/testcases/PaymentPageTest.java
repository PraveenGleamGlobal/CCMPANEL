package com.ccm.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.ccm.qa.base.TestBase;
import com.ccm.qa.pages.PaymentPage;

public class PaymentPageTest extends TestBase {

	
	@Test
	public void executePaymentPage() throws InterruptedException {
		
		PaymentPage paymentpage= new PaymentPage();
		paymentpage.verifyPaymentPage();
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(7000);
		driver.quit();
	}
	
}
