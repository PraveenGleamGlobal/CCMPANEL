package com.ccm.qa.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ccm.qa.base.TestBase2;


public class FinanceLoginPage extends TestBase2 {

	@FindBy(xpath="//input[@id='email']")
	public static WebElement username;
	
	@FindBy(xpath="//input[@id='password-field']")
	public static WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement loginbtn;
	
	public FinanceLoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public HomePage login(String un, String pwd) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Thread.sleep(1000);
		username.sendKeys(un);
		
		Thread.sleep(1000);
		password.sendKeys(pwd);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click()", loginbtn);
		
		System.out.println(un);
		System.out.println(pwd); 
		
		return new HomePage();
	}
	
}