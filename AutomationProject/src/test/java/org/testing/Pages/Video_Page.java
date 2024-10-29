package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Video_Page 
{
	ChromeDriver driver;
	Properties pr;
	JavascriptExecutor jse;
	public Video_Page(ChromeDriver driver,Properties pr,JavascriptExecutor jse)
	{
		this.driver=driver;
		this.pr=pr;
		this.jse=jse;
		
	}
	public void likeVideo() throws InterruptedException
	{
		driver.get("https://www.youtube.com/watch?v=7RWDKXQgU6Q");
		Thread.sleep(5000);

   WebElement likevideo=driver.findElement(By.xpath(pr.getProperty("likevideo")));
    likevideo.click();
		
		Thread.sleep(3000);		

	}
	public void channelSubscribe() throws InterruptedException
	{
		driver.get("https://www.youtube.com/watch?v=7RWDKXQgU6Q");
		Thread.sleep(5000);

		WebElement Subscribe=driver.findElement(By.xpath(pr.getProperty("Subscribe")));
		Subscribe.click();
		
		Thread.sleep(3000);	
		
	}
	public void commentVideo() throws InterruptedException
    {
      driver.get("https://www.youtube.com/watch?v=7RWDKXQgU6Q");
		
		Thread.sleep(5000);
		jse.executeScript("scroll(0, 250);");

	
		Thread.sleep(3000);
	   	    WebElement commentbox = driver.findElement(By.id("placeholder-area"));
	    commentbox.click();
	    		
	    		
	   WebElement activecommentbox = driver.findElement(By.id("contenteditable-root"));
	    activecommentbox.sendKeys("good song");

	    WebElement postbutton = driver.findElement(By.xpath(pr.getProperty("postbutton")));
			   
	   postbutton.click();

	   // Wait to ensure the comment is posted
	    Thread.sleep(3000);


    }


}
