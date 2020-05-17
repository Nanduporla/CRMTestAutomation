package com.netbank.TestCases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.netbank.PageObject.AddCustomer;
import com.netbank.PageObject.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass {
	
	
	@Test
	public void addNewCustomer() throws InterruptedException, IOException {
		
     LoginPage lp= new LoginPage(driver);
     lp.setUserName(username);
	 logger.info("User name entered");
	 lp.setPassword(password);
	 logger.info("Password entered");
	 lp.clickSubmit();
	 Thread.sleep(3000);
	 
	 AddCustomer addcust = new AddCustomer(driver);
			 
       addcust.setAddNewCustmer();
	   addcust.setCustName("cname");
	   addcust.setGender("female");
	   addcust.setdob("10","15","1979");
	   Thread.sleep(3000);
	   addcust.setaddr("203 Parkview Street");
	   addcust.setcity("Toronto");
	   addcust.setstate("Ontraio");
	   addcust.setpin("345678");
	   addcust.settelno("2345678");
	   String email=randome()+"@gmail.com";
	   addcust.setemail(email);
	   addcust.setpwd("asdfgh234");
	   addcust.csubmit();
    		 
	   Thread.sleep(5000);
	   
	   boolean res= driver.getPageSource().contains("Customer Registered Successfully!!!");
	   System.out.println(res);
	   
	   if(res==true) {
		   
		   Assert.assertTrue(true);
		   logger.info("TestCase Pass");
		   
	   }else
		   
	   {
		   captureScreen(driver, "addNewCustomer");
		   Assert.assertTrue(false);
		   logger.info("TestCase fail");
	   }
	   
	}

	
	
}
