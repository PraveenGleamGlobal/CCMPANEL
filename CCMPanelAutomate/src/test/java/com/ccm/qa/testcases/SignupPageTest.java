package com.ccm.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ccm.qa.base.TestBase;
import com.ccm.qa.pages.SignupPage;

public class SignupPageTest extends TestBase {

	SignupPage signuppage;
	
	
	public SignupPageTest() {
		
		super();
	}
	
	@BeforeClass
	public void setup() {
		
		intialization();
		signuppage= new SignupPage();
	}
	
	@Test
	public void executeloginpage() throws InterruptedException {
		
		signuppage.verifyLoginPage();
	}
}
	
//	@AfterClass
//	public void tearDown() throws InterruptedException {
//		
//		Thread.sleep(1000);
//		driver.quit();
//	}
//}
