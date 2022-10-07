package com.ccm.qa.pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ccm.qa.base.TestBase4;

public class ManagementCustomerPage extends TestBase4 {

	
	@FindBy(xpath="//a[@href='https://management.mininghardwaresale.com/admin/clients']")
	static WebElement customermodule;
	
	@FindBy(xpath="//th[@id='th-number']")
	static WebElement sortingorder;
	
	@FindBy(xpath="//a[normalize-space()='3']")
	static WebElement thirdpage;
	
	@FindBy(xpath="//a[@href='https://management.mininghardwaresale.com/admin/clients/client/76']")
	static WebElement viewlink;
	
	@FindBy(xpath="//a[normalize-space()='abi']")
	static WebElement viewlink2;
	
	
	@FindBy(xpath="//a[@data-group='invoices']")
	static WebElement invoicesubmodule;
	
	@FindBy(xpath="//a[@href='https://management.mininghardwaresale.com/admin/invoices/list_invoices/46']")
	static WebElement invoicelink;
	
	@FindBy(xpath="//a[@class='mleft10 pull-right btn btn-success']")
	static WebElement paymentbutton;
	
	@FindBy(xpath="//input[@id='transactionid']")
	static WebElement transactionid;
	
	@FindBy(xpath="//input[@id='do_not_send_email_template']")
	static WebElement checkboxdonotsend;
	
	@FindBy(xpath="//button[@type='submit']")
	static WebElement submitbtn;
	
	public ManagementCustomerPage() {
		
		PageFactory.initElements(driver, this);	
	
}
	
	public static void verifyManagementCustomerModule() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", customermodule);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", sortingorder);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].scrollIntoView();", thirdpage);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", thirdpage);
		
		Thread.sleep(1000);
		executor.executeScript("window.scrollBy(0,-1250)"," ");
		
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", viewlink);
		
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", invoicesubmodule);
		
		String oldwindow= driver.getWindowHandle();
		
		executor.executeScript("arguments[0].click();", invoicelink);
		
		Set<String> handles= driver.getWindowHandles();
		
	   for (String newwindow : handles) {
		
		   Thread.sleep(1000);
		   driver.switchTo().window(newwindow);
	}
	   
	   Thread.sleep(2000);
	   executor.executeScript("arguments[0].click();", paymentbutton);
	   
	   Thread.sleep(1000);
	   transactionid.sendKeys("123456789");
	   
	   Thread.sleep(1000);
	   executor.executeScript("arguments[0].click();", checkboxdonotsend);
	   
	   Thread.sleep(1000);
	   executor.executeScript("arguments[0].click();", submitbtn);
	   
	   
		
		
		
		
		
	}
	
}
