package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Page 
{
	ChromeDriver driver;
	Properties pr;
	public Login_Page(ChromeDriver driver,Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
		
	}
	public void signin(String UserName,String password) throws InterruptedException
	{
		WebElement Signin=driver.findElement(By.xpath(pr.getProperty("loginbutton")));
		
	    Signin.click();
		WebElement Email=driver.findElement(By.xpath(pr.getProperty("usernametext")));
		Email.sendKeys("sangeetanesur@gmail.com");
				
		WebElement Next=driver.findElement(By.xpath(pr.getProperty("Next")));
		Next.click();
		
		Thread.sleep(5000);
		
		WebElement pwd=driver.findElement(By.xpath(pr.getProperty("passwordtext")));
		pwd.sendKeys("Sangeeta@123");
		
		Thread.sleep(3000);
		
		WebElement Next1=driver.findElement(By.xpath(pr.getProperty("Next1")));
		Next1.click();
		Thread.sleep(5000);
		
		
	

	}
	public void signout() throws InterruptedException
	{
		WebElement img=driver.findElement(By.xpath(pr.getProperty("img")));
	    img.click();
	    
	    Thread.sleep(3000);
	    WebElement Signout=driver.findElement(By.xpath(pr.getProperty("Signout")));
	    Signout.click();
	
	}


}
