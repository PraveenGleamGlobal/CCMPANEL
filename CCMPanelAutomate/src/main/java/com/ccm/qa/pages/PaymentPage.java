package com.ccm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ccm.qa.base.TestBase;

public class PaymentPage extends TestBase {

	
	@FindBy(xpath="(//div[@class='col-6']//img)[2]")
	static WebElement contactsupport;
	
	@FindBy(xpath="//img[@data-method='USDT']")
	static WebElement usdt;
	
	@FindBy(xpath="//input[@placeholder='Enter Transaction Number']")
	static WebElement transactionid1;
	
	@FindBy(xpath="(//button[text()='Back'])[2]")
	static WebElement backbutton;
	
	@FindBy(xpath="//button[text()='Back']")
	static WebElement backbutton2;
	
	@FindBy(xpath="//input[@name='transaction_id']")
	static WebElement transactionid2;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	static WebElement submitbutton;
	
	@FindBy(xpath="//button[@type='button']")
	static WebElement submitbutton2;


    public  PaymentPage () {
	
	PageFactory.initElements(driver, this);
	
}
 
    public static void verifyPaymentPage() throws InterruptedException {
    	
    	Thread.sleep(1000);
    	JavascriptExecutor executor= (JavascriptExecutor)driver;
    	executor.executeScript("arguments[0].click();", usdt);
    	
    	Thread.sleep(1000);
    	transactionid2.sendKeys("123456789");
   
    	
    	Thread.sleep(1000);
    	executor.executeScript("arguments[0].click();", backbutton2);
    	
    	Thread.sleep(1000);
    	executor.executeScript("arguments[0].click();", contactsupport);
    	
    	Thread.sleep(1000);
    	transactionid1.sendKeys("123456789");
    	
    	Thread.sleep(1000);
    	executor.executeScript("arguments[0].click();", submitbutton);
    	
    }

}
