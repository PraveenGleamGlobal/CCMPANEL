package com.ccm.qa.testcases;



import java.awt.AWTException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.ccm.qa.base.TestBase5;
import com.ccm.qa.pages.MyFactoryLoginPage;
import com.ccm.qa.pages.MyfactoryProfileUpdatePage;

public class MyFactoryLoginPageTest extends TestBase5 {

	MyFactoryLoginPage loginpage;
	MyfactoryProfileUpdatePage profileupdatepage;
	
	public MyFactoryLoginPageTest() {
		super();
	}
	
	
	@BeforeClass
	public void setup() {
		
		intialization();
		loginpage= new MyFactoryLoginPage();
		
		
	}
	
	@Test(priority = 1)
	public  void exceuteLoginPage() throws InterruptedException {
		
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 2)
	public void executeMyfactoryUpdateprofilePage() throws AWTException, InterruptedException {
		
		profileupdatepage.verifyMyfactoryprofileUpdatePage();
		
	}
}

