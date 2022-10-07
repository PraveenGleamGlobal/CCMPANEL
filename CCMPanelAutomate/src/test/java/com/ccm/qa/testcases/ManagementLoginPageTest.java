package com.ccm.qa.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ccm.qa.base.TestBase4;
import com.ccm.qa.pages.ManagementCustomerPage;
import com.ccm.qa.pages.ManagementLoginPage;

public class ManagementLoginPageTest extends TestBase4 {

	
	ManagementLoginPage loginpage;
	
	ManagementCustomerPage customermodule;
	
	public ManagementLoginPageTest() {
		
		super();
	}
	
	@BeforeClass
	public void setup() {
		
	      intialization();
	      
	      loginpage= new ManagementLoginPage();
	      
	}
	
	@Test(priority = 0)
	public void executeManagementLoginPage() throws InterruptedException {
		
		loginpage.verifymanagementloginpage(prop.getProperty("username"), prop.getProperty("password"));
	}
	

}
