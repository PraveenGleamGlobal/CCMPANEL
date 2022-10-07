package com.ccm.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ccm.qa.base.TestBase2;
import com.ccm.qa.pages.FinanceLoginPage;
import com.ccm.qa.pages.FinanceInvoiceVerificationPage;

public class FinanceInvoiceVerificationPageTest extends TestBase2 {

FinanceLoginPage loginPages;
static FinanceInvoiceVerificationPage invoiceverifypage;
	
	
//	public FinanceInvoiceVerificationPageTest() {
//		super();
//	}
//
//	@BeforeClass
//	public void setup() {
//		intialization();
//		loginPages = new FinanceLoginPage();
//		invoiceverifypage= new FinanceInvoiceVerificationPage();
//}
//	
//	@Test(priority = 0)
//	public void loginTest() throws InterruptedException {
//		loginPages.login(prop.getProperty("username"), prop.getProperty("password"));
//		
//		
//	}
	
	@Test(priority = 1)
	public static void executeInvoiceVerificationPage() throws InterruptedException {
		
		invoiceverifypage.verifyInvoiceVerificationPage1();
		
		invoiceverifypage.verifyInvoiceVerificationPage2();
		
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}
	
}
