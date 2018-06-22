package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	WebDriverWait wait;
	WebElement username= driver.findElement(By.name("username"));
	WebElement password = driver.findElement(By.name("password"));
	WebElement submitBtn=driver.findElement(By.xpath("//input[starts-with(@value,'Login')]"));
//	WebElement signUpBtn=driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]"));
//	WebElement signUpBtn=driver.findElement(By.xpath("//button[contains(@class='btn')]"));
//	WebElement crmlogo=driver.findElement(By.xpath("//img[contains(@alt,'free crm logo')]"));

	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[contains(@alt,'free crm logo')]")
	WebElement crmlogo;
         

	public LoginPage() 
	{
	
		PageFactory.initElements(driver,this);
	}
	
	
     
	
	
	public String validateTitle(){
	return driver.getTitle();
	}
	
	public boolean validateSignUp(){
		wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(signUpBtn));
		System.out.println(signUpBtn.getText());
	   return signUpBtn.isDisplayed();
		
	}

	/*public void validateCRMimage() throws InterruptedException{
		System.out.println("Inside validate CRM image");
		
		wait = new WebDriverWait(driver, 20);
	//	wait.until(ExpectedConditions.elementToBeClickable(crmlogo));
	//	System.out.println("Image Attribute"+crmlogo.getAttribute("src"));
		
		//(By.xpath("//img[contains(@alt,'free crm logo')]")));
	//	Thread.sleep(10000);
	//	return crmlogo.isDisplayed();
		
	}
	*/
	public boolean validateCRMimage(){
		return crmlogo.isDisplayed();
	}
	
	public HomePage login(String uname,String passwd)
	{
		username.sendKeys(uname);
		password.sendKeys(passwd);
		submitBtn.click();
		return new HomePage();
	}
	}
	
	

