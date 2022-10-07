package com.ccm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ccm.qa.base.TestBase;

public class ProfileUpdatingPage extends TestBase {

	
	@FindBy(xpath="//a[@title='Home']")
	static WebElement homelink;
	
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
	
	@FindBy(xpath="//input[@placeholder='Enter First Name']")
	static WebElement firstname;
	
	@FindBy(xpath="//input[@placeholder='Enter Last Name']")
	static WebElement lastname;
	
	@FindBy(xpath="//input[@placeholder='Enter Phone Number']")
	static WebElement phonenumber;
	
	@FindBy(xpath="//input[@placeholder='Enter Country']")
	static WebElement countryselection;
	
	@FindBy(xpath="//input[@placeholder='Enter State/Province']")
	static WebElement stateselection;
	
	@FindBy(xpath="//input[@placeholder='Enter City']")
	static WebElement cityselection;
	
	@FindBy(xpath="//input[@placeholder='Enter Zip Code']")
	static WebElement zipcode;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	static WebElement passwordenter1;
	
	@FindBy(xpath="//input[@id='confirmPassword']")
	static WebElement passwordenter2;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Address']")
	static WebElement enteraddresstextbox;
	
	@FindBy(xpath="//input[@id='profile_update_btn']")
	static WebElement saveandproceed;
	
	public ProfileUpdatingPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public static void verifyProfileUpdationPage() throws InterruptedException {
		
		nametextbox.sendKeys("manoj");
		
		Thread.sleep(1000);
		emailidtextbox.sendKeys("manoj789@gmail.com");
		
		
		contactnumbertextbox.sendKeys("8978457578");
	
		Thread.sleep(1000);
		firstname.clear();
		
		Thread.sleep(1000);
		firstname.sendKeys("manoj");
			
		Thread.sleep(1000);
		lastname.sendKeys("manoj");
		
		Thread.sleep(1000);
		countryselection.sendKeys("India");
		
		Thread.sleep(1000);
		stateselection.clear();
		
		Thread.sleep(1000);
		stateselection.sendKeys("Tamilnadu");
		
		Thread.sleep(1000);
		cityselection.sendKeys("erode");
		
		Thread.sleep(1000);
		zipcode.sendKeys("894575");
		
		Thread.sleep(1000);
		passwordenter1.sendKeys("manoj@123");
		
		Thread.sleep(1000);
		passwordenter2.sendKeys("manoj@123");
		
		Thread.sleep(1000);
		enteraddresstextbox.sendKeys("this is for description");
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].scrollIntoView();", saveandproceed);
		
		Thread.sleep(1000);
		executor.executeScript("arguments[0].click();", saveandproceed);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
