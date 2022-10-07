package com.ccm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ccm.qa.base.TestBase;

public class MiningFarmPage extends TestBase {

	@FindBy(xpath="//a[@class='custom-btn-234']")
	static  WebElement backtorig;
	
	@FindBy(xpath="//select[@class='currencychange']")
	static WebElement selectcurrency;
	
	@FindBy(xpath="(//a[contains(@class,'custom-btn1 custom-btn--small')])[2]")
	static WebElement proceedtobuy;
	
	@FindBy(xpath="//main[@class='main-content']//div")
	static WebElement backtorig2;
	
	@FindBy(xpath="//a[contains(@class,'custom-btn custom-btn--medium')]")
	static WebElement basicmining;
	
	@FindBy(xpath="(//a[contains(@class,'custom-btn custom-btn--medium')])[2]")
	static WebElement regularmining;
	
	@FindBy(xpath="(//a[contains(@class,'custom-btn custom-btn--medium')])[3]")
	static WebElement standardmining;
	
	@FindBy(xpath="//div[contains(@class,'__item-1 __item--color-4')]//a[1]")
	static WebElement advancemining;
	
	@FindBy(xpath="//a[contains(@class,'custom-btn1 custom-btn--small')]")
	static WebElement proceedtobuy2;
	
	
	public MiningFarmPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public static void verifyMiningFarmPage() throws InterruptedException {
//		
//		Thread.sleep(1000);
//		JavascriptExecutor executor= (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", backtorig);
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", basicmining);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", regularmining);
		
//		Thread.sleep(1000);
//		executor.executeScript("arguments[0].scrollIntoView();", advancemining);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", standardmining);
		
//		Thread.sleep(1000);
//		executor.executeScript("arguments[0].scrollIntoView();", advancemining);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", advancemining);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", proceedtobuy2);
		
	}
}
