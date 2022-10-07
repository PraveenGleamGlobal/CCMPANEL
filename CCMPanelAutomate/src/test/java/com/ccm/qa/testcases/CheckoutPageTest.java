package com.ccm.qa.testcases;


import org.testng.annotations.Test;

import com.ccm.qa.base.TestBase;
import com.ccm.qa.pages.SignupPage;
import com.ccm.qa.pages.MiningFarmPage;
import com.ccm.qa.pages.CheckoutPage;


public class CheckoutPageTest extends TestBase {

     
		
		@Test(priority = 1)
		public void executeCheckoutPage() throws InterruptedException {
		    CheckoutPage	checkoutpage = new CheckoutPage();
			checkoutpage.verifyCheckoutPage();
			
		}
}
