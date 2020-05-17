package com.netbank.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.netbank.PageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws IOException {
		
		driver.get(baseURL);
		logger.info("URL is opened");
		
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("User name entered");
		lp.setPassword(password);
		logger.info("Password entered");
		lp.clickSubmit();
				
		
		//String s = driver.getTitle();
		//		System.out.println(s);
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("Login test not passed");
		}
		
	}

}
