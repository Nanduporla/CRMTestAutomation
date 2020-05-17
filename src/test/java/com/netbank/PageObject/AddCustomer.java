package com.netbank.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomer {
	
     WebDriver ldriver;
	
	public AddCustomer(WebDriver rdriver){
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}

	
	@FindBy(how= How.XPATH, using="/html/body/div[3]/div/ul/li[2]/a" )
	@CacheLookup
	WebElement lnkAddNewCustomer;
	
	@FindBy(how=How.NAME, using="name")
	@CacheLookup
	WebElement txtCustName;
	
	@FindBy(how=How.NAME, using="rad1")
	@CacheLookup
	WebElement rdGender;
	
	@FindBy(how=How.ID, using="dob")
	@CacheLookup
	WebElement txtdob;
	
	@FindBy(how=How.NAME, using="addr")
	@CacheLookup
	WebElement txtaddr;
	
	@FindBy(how=How.NAME, using="city")
	@CacheLookup
	WebElement txtcity;
	
	@FindBy(how=How.NAME, using="state")
	@CacheLookup
	WebElement txtstate;
	
	@FindBy(how=How.NAME, using="pinno")
	@CacheLookup
	WebElement txtpinno;
	
	@FindBy(how=How.NAME, using="telephoneno")
	@CacheLookup
	WebElement txtteleno;
	
	@FindBy(how=How.NAME, using="emailid")
	@CacheLookup
	WebElement txtemailid;
	
	@FindBy(how= How.NAME, using="password")
	@CacheLookup
	WebElement txtpass;
	
	@FindBy(how=How.NAME, using="sub")
	@CacheLookup
	WebElement btnsubmit;
	
	
    public void setAddNewCustmer()	
	{
	lnkAddNewCustomer.click();
	}
    public void setCustName(String cname)	
	{
    	txtCustName.sendKeys(cname);
	}
    public void setGender(String cgender)	
	{
    	rdGender.click();
	}
    public void setdob(String mm, String dd, String yy)	
	{
    	txtdob.sendKeys(mm);
    	txtdob.sendKeys(dd);
    	txtdob.sendKeys(yy);
	}
    public void setaddr(String caddr)	
	{
    	txtaddr.sendKeys(caddr);
	}
    public void setcity(String ccity)	
	{
    	txtcity.sendKeys(ccity);
	}
    public void setstate(String cstate)	
	{
    	txtstate.sendKeys(cstate);
	}
    public void setpin(String cpinno)	
	{
    	txtpinno.sendKeys(cpinno);
	}
    public void settelno(String ctelno)	
	{
    	txtteleno.sendKeys(ctelno);
	}
    public void setemail(String cemail)	
	{
    	txtemailid.sendKeys(cemail);
	}
    public void setpwd(String cpwd)	
	{
    	txtpass.sendKeys(cpwd);
	}
    
    public void csubmit()	
	{
    	btnsubmit.click();;
	}
}
