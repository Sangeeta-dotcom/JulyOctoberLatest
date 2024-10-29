package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.Base;

public class Home_Page
{
	ChromeDriver driver;
	Properties pr;
  public Home_Page(ChromeDriver driver,Properties pr)
  {
	  this.driver=driver;
	  this.pr=pr;
  }
  public void trending_click() throws InterruptedException
	{
		WebElement Menu=driver.findElement(By.xpath(pr.getProperty("Menu")));
	    Menu.click();
	    Thread.sleep(3000);
	  
	    WebElement Trending=driver.findElement(By.xpath(pr.getProperty("Trending")));
	    Trending.click();
	    Thread.sleep(5000);
	  }
  public void subscriptions_Click() throws InterruptedException
 	{
 		
 		WebElement Subscriptions=driver.findElement(By.xpath(pr.getProperty("Subscriptions")));
 		Subscriptions.click();
 		
 		 Thread.sleep(3000);
 		
 	}
 	public void history_Click() throws InterruptedException
 	{
 		WebElement Menu=driver.findElement(By.xpath(pr.getProperty("Menu")));
 	    Menu.click();
 	    Thread.sleep(3000);
 		
 	    WebElement History =driver.findElement(By.xpath(pr.getProperty("History")));
 	    History.click();
 	    Thread.sleep(3000);
 		
 	    }

  
	public void watchLater() throws InterruptedException
	{
		WebElement Menu=driver.findElement(By.xpath(pr.getProperty("Menu")));
	    Menu.click();
	    Thread.sleep(3000);
	    WebElement watchLater =driver.findElement(By.xpath(pr.getProperty("watchLater")));
	    watchLater.click();
	    Thread.sleep(3000);
	    }

}
