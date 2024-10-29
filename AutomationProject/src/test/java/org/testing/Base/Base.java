package org.testing.Base;
//We did Logscapture and screenshot in this project
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base 
{
	public ChromeDriver driver;
	public Properties pr;
	public JavascriptExecutor jse;
	@BeforeMethod
	public void browserInvoke() throws IOException
	{
		File f=new File("../AutomationProject/Object.properties");
		FileReader fr=new FileReader(f);
		pr=new Properties();
		pr.load(fr);
		
		//ChromeOptions options=new ChromeOptions();
	//	options.addArguments("disable-infobars");
		driver=new ChromeDriver();
		 jse = (JavascriptExecutor)driver;
			
		
		
		driver.get("https://www.youtube.com");
		
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void closure()
	{
		driver.close();
	}

}
