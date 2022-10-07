package com.ccm.qa.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ccm.qa.base.TestBase2;

public class FinancePaymentModule extends TestBase2 {

	
	@FindBy(xpath="//input[@id='email']")
	public static WebElement emailid;
	
	@FindBy(xpath="//input[@id='password-field']")
	public static WebElement password;
	
	@FindBy(xpath="//span[text()='Payment']")
	public static WebElement paymentmodule;
	
	@FindBy(xpath="//ul[@id='menu']/li[4]/ul[1]/li[2]/a[1]")
	public static WebElement usdtsubmodule;
	
	@FindBy(xpath="//a[@href='https://mines.mininghardwaresale.com/admin/payment/tranx/dpay']")
	public static WebElement dpaysubmodule;
	
	@FindBy(xpath="//a[@href='https://mines.mininghardwaresale.com/admin/payment/tranx/usdt/edit/239']")
	static WebElement actionbutton;
	
	@FindBy(xpath="//a[@href='https://mines.mininghardwaresale.com/admin/payment/tranx/dpay/edit/328']")
	static WebElement actionbutton2;
	
	@FindBy(xpath="//a[@id='DataTables_Table_0_next']")
	static WebElement secondpage;
	
	@FindBy(xpath="//input[@placeholder='pay_abcd']")
	static WebElement apptransid;
	
	@FindBy(xpath="//button[text()='Confirm']")
	static WebElement confirmbutton;
	
	@FindBy(xpath="//button[text()='Send Mail']")
	static WebElement sendmailbutton;
	
	public FinancePaymentModule() {
		
		PageFactory.initElements(driver, this);
	}
	
	public static void verifyFinancePaymentModule() throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", paymentmodule);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", dpaysubmodule);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].scrollIntoView();", actionbutton2);
//		
//		Thread.sleep(1000);
//		executor.executeScript("arguments[0].click();", secondpage);
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", actionbutton2);
		
		Thread.sleep(1000);
	    apptransid.sendKeys("123456789");
	    
	    Thread.sleep(1000);
	    executor.executeScript("arguments[0].click();", confirmbutton);
	    
	    Thread.sleep(1000);
	    executor.executeScript("arguments[0].click();", sendmailbutton);
	   
		
	}
}
