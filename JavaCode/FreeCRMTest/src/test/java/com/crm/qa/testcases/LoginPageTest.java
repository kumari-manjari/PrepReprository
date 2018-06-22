package com.crm.qa.testcases;

import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	String title;
	boolean imagePresence;
	
	 public LoginPageTest() {
			super();
		}
	
	
  @Test(priority=3)
  public void loginPageTitleTest() {
	  title=loginPage.validateTitle();
	  Assert.assertEquals(title, "Free CRM software in the cloud powers sales and customer service");
  }
  
  /*@Test(priority=2)
  public void crmLogoTest(){
	  System.out.println("Inside crmLogoTest method");
	 try {
		loginPage.validateCRMimage();
	} catch (InterruptedException e) {
				e.printStackTrace();
	}
	//  System.out.println("Image Presence"+imagePresence);
	 // Assert.assertTrue(loginPage.);
  }*/
  
  @Test(priority=2)
  public void crmLogoTest()
  {
	  Assert.assertTrue(loginPage.validateCRMimage());
  }
	 
  @Test(priority=1)
  public void SignUpBtnTest(){
	  Assert.assertTrue(loginPage.validateSignUp());
  }  
  /*@Test(priority=3)
  public void loginTest(){
	  homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
  }*/
  
  
  @BeforeMethod
  public void setUp() {
	  initialization();
	  loginPage=new LoginPage();
	  
  }

 
@AfterMethod
  public void tearDown() {
	driver.quit();
  }

}
