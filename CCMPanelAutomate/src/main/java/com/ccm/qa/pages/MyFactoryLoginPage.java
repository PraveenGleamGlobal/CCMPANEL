package com.ccm.qa.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ccm.qa.base.TestBase5;

public class MyFactoryLoginPage extends TestBase5 {

	@FindBy(xpath="//input[@id='email']")
	static WebElement username;
	
	@FindBy(xpath="//input[@id='password-field']")
	static WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	static WebElement loginbtn;
	
	public MyFactoryLoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void login(String un, String pwd) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Thread.sleep(1000);
		username.sendKeys(un);
		
		Thread.sleep(1000);
		password.sendKeys(pwd);
		
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", loginbtn);
		
	}
	
}
