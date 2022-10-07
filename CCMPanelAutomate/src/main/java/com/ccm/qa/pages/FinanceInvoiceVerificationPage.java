package com.ccm.qa.pages;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ccm.qa.base.TestBase2;


import io.github.bonigarcia.wdm.WebDriverManager;

public class FinanceInvoiceVerificationPage extends TestBase2 {

	
	@FindBy(xpath="//input[@id='email']")
	public static WebElement username;
	
	@FindBy(xpath="//input[@id='password-field']")
	public static WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	public static WebElement loginbtn;
	
	public FinanceInvoiceVerificationPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	public static void verifyInvoiceVerificationPage1() throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://mines.mininghardwaresale.com/");
		
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("billing@callcentreproject.com");
		
		driver.findElement(By.xpath("//input[@id='password-field']")).sendKeys("123456789");
		
		WebElement submitbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", submitbutton);
		
	}
	
	public static void verifyInvoiceVerificationPage2() throws InterruptedException {
		
		Thread.sleep(1000);
		WebElement paymentmodule=driver.findElement(By.xpath("//span[text()='Payment']"));
		
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", paymentmodule);
		
		Thread.sleep(1000);
		WebElement dpaysubmodule=driver.findElement(By.xpath("//a[@href='https://mines.mininghardwaresale.com/admin/payment/tranx/dpay']"));
		executor.executeScript("arguments[0].click();", dpaysubmodule);
		
		Thread.sleep(1000);
		WebElement paymentPending=driver.findElement(By.xpath("//a[@href='#payment-pending']"));
		executor.executeScript("arguments[0].click();", paymentPending);
		
		Thread.sleep(1000);
		WebElement actionbutton=driver.findElement(By.xpath("//a[@href='https://mines.mininghardwaresale.com/admin/payment/tranx/dpay/edit/322']"));
		executor.executeScript("arguments[0].click();", actionbutton);
		
		Thread.sleep(1000);
		WebElement invoiceid=driver.findElement(By.xpath("//input[@name='invoice']"));
		invoiceid.sendKeys("001320");
		
		Thread.sleep(1000);
		WebElement confirmbutton=driver.findElement(By.xpath("//button[@class='btn btn-secondary confirm_invoice']"));
		executor.executeScript("arguments[0].click();", confirmbutton);
		
	}
}












