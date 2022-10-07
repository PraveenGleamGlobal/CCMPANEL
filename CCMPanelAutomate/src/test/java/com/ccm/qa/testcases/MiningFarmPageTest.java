package com.ccm.qa.testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ccm.qa.base.TestBase;
import com.ccm.qa.pages.SignupPage;
import com.ccm.qa.pages.MiningFarmPage;

public class MiningFarmPageTest extends TestBase {

	
    @Test(priority = 2)
    public void executeMiningFarmPage() throws InterruptedException {
    	MiningFarmPage miningfarmpage= new MiningFarmPage();
    	miningfarmpage.verifyMiningFarmPage();
    	
    	
    }
    }
	

