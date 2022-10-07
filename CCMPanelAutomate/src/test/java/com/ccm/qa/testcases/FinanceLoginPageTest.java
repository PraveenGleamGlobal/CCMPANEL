package com.ccm.qa.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ccm.qa.base.TestBase2;
import com.ccm.qa.pages.FinanceLoginPage;

public class FinanceLoginPageTest extends TestBase2 {

	
FinanceLoginPage loginPages;
	
	
	public FinanceLoginPageTest() {
		super();
	}

	@BeforeClass
	public void setup() {
		intialization();
		loginPages = new FinanceLoginPage();
}
	
	@Test(priority = 0)
	public void loginTest() throws InterruptedException {
		loginPages.login(prop.getProperty("username"), prop.getProperty("password"));
		
		
	}
}
