package com.ccm.qa.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ccm.qa.base.TestBase5;

public class MyfactoryProfileUpdatePage extends TestBase5 {

	
	@FindBy(xpath="//input[@id='name']")
	static WebElement displayname;
	
	@FindBy(xpath="//input[@id='hrx_wallet']")
	static WebElement hrxwallet;
	
	@FindBy(xpath="//input[@id='alt_email']")
	static WebElement emailaddress;
	
	@FindBy(xpath="//input[@id='alt_phone']")
	static WebElement phonenumber;
	
	@FindBy(xpath="//input[@class='custom-file-input profile_upload_image image_upload_trig']")
	static WebElement uploadphoto;
	
	@FindBy(xpath="//a[@href='#next']")
	static WebElement nextbutton;
	
	@FindBy(xpath="//input[@placeholder='Enter First Proof']")
	static WebElement firstproofname;
	
	@FindBy(xpath="//input[@placeholder='Enter Second Proof']")
	static WebElement secondproofname;
	
	@FindBy(xpath="//input[@name='proof1_img']")
	static WebElement firstproofupload;
	
	@FindBy(xpath="//input[@name='proof2_img']")
	static WebElement secondproofupload;
	
	@FindBy(xpath="//a[normalize-space()='Finish']")
	static WebElement finishbutton;
	
	public MyfactoryProfileUpdatePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void verifyMyfactoryprofileUpdatePage() throws AWTException, InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Thread.sleep(1000);
		displayname.sendKeys("naveena");
		
		Thread.sleep(1000);
		hrxwallet.sendKeys("gsdgdfkugdkuhdfugsekjhf");
		
		Thread.sleep(1000);
		emailaddress.sendKeys("you@gmail.com");
		
		Thread.sleep(1000);
		phonenumber.sendKeys("9878787968");
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", uploadphoto);
		

	   Thread.sleep(1000);
      StringSelection ss = new StringSelection("C:\\Users\\CCM Hardware\\Pictures\\Saved Pictures\\kid.JPG");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	    
	    

	    Robot robot = new Robot();	   
	    robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    
	    executor.executeScript("arguments[0].scrollIntoView();", nextbutton);
	    
	    Thread.sleep(1000);
	    executor.executeScript("arguments[0].click();", nextbutton);
		
		
	}
	
	public void verifyMyfactoryuploaddocumentPage() throws InterruptedException, AWTException {
		
		Thread.sleep(1000);
		firstproofname.sendKeys("aadhar name");
		
		Thread.sleep(1000);
		secondproofname.sendKeys("pan card");
		
		Thread.sleep(1000);
		JavascriptExecutor executor= (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", firstproofupload);
		
		 Thread.sleep(1000);
	      StringSelection ss = new StringSelection("C:\\Users\\CCM Hardware\\Pictures\\Saved Pictures\\kid.JPG");
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		    
		    

		    Robot robot = new Robot();	   
		    robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_V);
		    robot.keyRelease(KeyEvent.VK_CONTROL);
		    robot.keyRelease(KeyEvent.VK_V);
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);
		
		 Thread.sleep(1000);
		 executor.executeScript("arguments[0].click();", secondproofupload);
		 
		 Thread.sleep(1000);
	      StringSelection ss2 = new StringSelection("C:\\Users\\CCM Hardware\\Pictures\\Saved Pictures\\kid.JPG");
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss2, null);
		    
		    

		    Robot robot2 = new Robot();	   
		    robot.keyPress(KeyEvent.VK_CONTROL);
	        robot.keyPress(KeyEvent.VK_V);
		    robot.keyRelease(KeyEvent.VK_CONTROL);
		    robot.keyRelease(KeyEvent.VK_V);
		    robot.keyPress(KeyEvent.VK_ENTER);
		    robot.keyRelease(KeyEvent.VK_ENTER);
		
		    Thread.sleep(1000);
		    executor.executeScript("arguments[0].click();", finishbutton);
	}
}
