package com.ccm.qa.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ccm.qa.base.TestBase;
import com.ccm.qa.pages.ProfileUpdatingPage;
import com.ccm.qa.pages.SignupPage;

public class ProfileUpdatingPageTest extends TestBase {

	SignupPage signuppage;
	
	
	public ProfileUpdatingPageTest() {
		
		super();
	}
	
	@BeforeClass
	public void setup() {
		
		intialization();
		signuppage= new SignupPage();
	}
	
	@Test
	public void executeProfileUpdatingPage() throws InterruptedException {
		
		ProfileUpdatingPage profileupdatepage= new ProfileUpdatingPage();
		profileupdatepage.verifyProfileUpdationPage();
				
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(8000);
		driver.quit();
	}
	
	
}
