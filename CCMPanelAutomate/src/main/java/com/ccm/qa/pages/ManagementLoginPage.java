package com.ccm.qa.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ccm.qa.base.TestBase;
import com.ccm.qa.base.TestBase4;

public class ManagementLoginPage extends TestBase4 {

	@FindBy(xpath="//input[@id='email']")
	static WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	static WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	static WebElement loginbtn;
	
	public ManagementLoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void verifymanagementloginpage(String un, String pwd) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(1000);
		username.sendKeys(un);
		
		Thread.sleep(1000);
		password.sendKeys(pwd);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(1000);
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", loginbtn);
	
	}
	
}
