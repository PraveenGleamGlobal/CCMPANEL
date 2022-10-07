package com.ccm.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ccm.qa.base.TestBase4;
import com.ccm.qa.pages.ManagementCustomerPage;
import com.ccm.qa.pages.ManagementLoginPage;

public class ManagementCustomerPageTest extends TestBase4 {

	
	ManagementLoginPage loginpage;
	
    ManagementCustomerPage customermodule;
    
    public ManagementCustomerPageTest() {
		
		super();
	}
	
	@BeforeClass
	public void setup() {
		
	      intialization();
	      
	      loginpage= new ManagementLoginPage();
	      
	      customermodule= new ManagementCustomerPage();
	      
	}
	
	@Test
	public void executeManagementLoginPage() throws InterruptedException {
		
		loginpage.verifymanagementloginpage(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 1)
	public void executeManagementCustomerModule() throws InterruptedException {
		
		customermodule.verifyManagementCustomerModule();
		
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(3000);
		driver.quit();
	}
    }

