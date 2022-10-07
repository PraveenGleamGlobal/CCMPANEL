package com.ccm.qa.testcases;

import java.awt.AWTException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ccm.qa.base.TestBase5;
import com.ccm.qa.pages.MyFactoryLoginPage;
import com.ccm.qa.pages.MyfactoryProfileUpdatePage;

public class MyfactoryUpdateProfilePageTest extends TestBase5 {

	
	MyFactoryLoginPage loginpage;
	MyfactoryProfileUpdatePage profileupdatepage;
	
	public MyfactoryUpdateProfilePageTest() {
		super();
	}
	
	
	@BeforeClass
	public void setup() {
		
		intialization();
		loginpage= new MyFactoryLoginPage();
		profileupdatepage= new MyfactoryProfileUpdatePage();
		
		
	}
	
	@Test(priority = 1)
	public  void exceuteLoginPage() throws InterruptedException {
		
		loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority = 2)
	public void executeMyfactoryUpdateprofilePage() throws AWTException, InterruptedException {
		
		profileupdatepage.verifyMyfactoryprofileUpdatePage();
		
	}
	
	@Test(priority = 3)
	public void executeMufactoryUploadDocumentsPage() throws InterruptedException, AWTException {
		
		profileupdatepage.verifyMyfactoryuploaddocumentPage();
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}
}
