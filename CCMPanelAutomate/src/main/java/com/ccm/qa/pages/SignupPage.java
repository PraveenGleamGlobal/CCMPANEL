package com.ccm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ccm.qa.base.TestBase;

public class SignupPage extends TestBase {

	@FindBy(xpath="//input[@name='name']")
	static WebElement nametextbox;
	
	@FindBy(id="ChangeEmail")
	static WebElement emailidtextbox;
	
	@FindBy(xpath="//input[@name='phone']")
	static WebElement contactnumbertextbox;
	
	@FindBy(xpath="//input[@name='country']")
	static WebElement statetextbox;
	
	@FindBy(xpath="//input[@value='Start Mining']")
	static WebElement startmining;
	
	public SignupPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public static void verifyLoginPage() throws InterruptedException {
		
		
		nametextbox.sendKeys("mohan");
		
		Thread.sleep(1000);
		emailidtextbox.sendKeys("mohan789@gmail.com");
		
		
		contactnumbertextbox.sendKeys("9687947895");
	
		Thread.sleep(1000);
		statetextbox.sendKeys("Tamilnadu");
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", startmining);
	}
}
