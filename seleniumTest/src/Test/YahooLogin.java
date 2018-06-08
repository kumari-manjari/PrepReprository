package Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class YahooLogin {

	public static void main(String[] args) {
		
		
		String url="https://login.yahoo.com/account/create?done=https%3A%2F%2Fnz.mail.yahoo.com%2F&specId=yidReg";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("usernamereg-firstName")).sendKeys("agsfhgfdhsg");
		driver.findElement(By.id("usernamereg-lastName")).sendKeys("jhjjkgb");
		driver.findElement(By.id("usernamereg-yid")).sendKeys("gfsq(*&gsjh");
    	driver.findElement(By.id("usernamereg-password")).sendKeys("jhasgdja&");
    	driver.findElement(By.id("usernamereg-phone")).sendKeys("4109009638");
    	Select birthmonth=new Select(driver.findElement(By.id("usernamereg-month")));
    	birthmonth.selectByIndex(10);
    	driver.findElement(By.id("usernamereg-day")).sendKeys("23");
    	driver.findElement(By.id("usernamereg-year")).sendKeys("1990");
    	driver.findElement(By.id("reg-submit-button")).click();   
    	
    	String error2=driver.findElement(By.id("reg-error-lastName")).getText();
    	String error1=driver.findElement(By.id("reg-error-firstName")).getText();
    	String error3=driver.findElement(By.id("reg-error-yid")).getText();
    	
    	System.out.println("Error1 msg is:++++"+error1);
		System.out.println("Error2 msg is:++++"+error2);
	    System.out.println("Error1 msg is:++++"+error3);
   	

	}

}
