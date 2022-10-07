package com.ccm.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ccm.qa.base.TestBase2;
import com.ccm.qa.pages.FinanceLoginPage;
import com.ccm.qa.pages.FinancePaymentModule;

public class FinancePaymentModuleTest extends TestBase2 {

	FinancePaymentModule Fpaymentmodule;
//	
//	FinanceLoginPageTest Floginpage;
//    FinanceLoginPage loginPages;
//	
//	
//	public FinancePaymentModuleTest() {
//		super();
//	}
//
//	@BeforeClass
//	public void setup() {
//		intialization();
//		loginPages = new FinanceLoginPage();
//}
//
//	
//	@Test(priority = 0)
//	public void loginTest() throws InterruptedException {
//		loginPages.login(prop.getProperty("username"), prop.getProperty("password"));
//		
//		
//	}
	

	
	@Test(priority = 1)
	public void executeFinancePaymentModule() throws InterruptedException {
		
		Fpaymentmodule= new FinancePaymentModule();
		Fpaymentmodule.verifyFinancePaymentModule();
		
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
	}
	
	
	
}
