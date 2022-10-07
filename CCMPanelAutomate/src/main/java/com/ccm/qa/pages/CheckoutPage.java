package com.ccm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ccm.qa.base.TestBase;

public class CheckoutPage extends TestBase {

	
	@FindBy(xpath="//span[text()='Add Promocode ']/following::input")
	static WebElement promocodetextbox;
	
	@FindBy(xpath="//button[text()='Apply']")
	static WebElement applybutton;
	
	@FindBy(xpath="//a[@class='custom-btn-234']")
	static WebElement backtorig;
	
	@FindBy(xpath="//button[text()='Place Order']")
	static WebElement placeorder;
	
	@FindBy(xpath="//div[@class='text-center']//input[1]")
	static WebElement transactionid;
	
	@FindBy(xpath="//a[contains(@class,'custom-btn1 custom-btn--small')]")
	static WebElement proceedtobuy2;
	
	@FindBy(xpath="//a[@data-amount='$500']")
	static WebElement deleteoption1;
	
	@FindBy(xpath="//a[@data-amount='$750']")
	static WebElement deleteoption2;
	
	@FindBy(xpath="//a[@data-amount='$1000']")
	static WebElement deleteoption3;
	
	@FindBy(xpath="//a[@data-amount='$1500']")
	static WebElement deleteoption4;
	
	@FindBy(xpath="//a[contains(@class,'custom-btn custom-btn--medium')]")
	static WebElement basicmining;
	
	@FindBy(xpath="(//a[contains(@class,'custom-btn custom-btn--medium')])[2]")
	static WebElement regularmining;
	
	@FindBy(xpath="(//a[contains(@class,'custom-btn custom-btn--medium')])[3]")
	static WebElement standardmining;
	
	@FindBy(xpath="//div[contains(@class,'__item-1 __item--color-4')]//a[1]")
	static WebElement advancemining;
	

	
	public CheckoutPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public static void verifyCheckoutPage() throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", deleteoption1);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", deleteoption2);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", deleteoption3);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", deleteoption4);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", backtorig);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", basicmining);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", regularmining);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", standardmining);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", advancemining);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", proceedtobuy2);
		
		Thread.sleep(1000);
		promocodetextbox.sendKeys("CCMBEW7272");
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", applybutton);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].scrollIntoView();", placeorder);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", placeorder);


	}
}
