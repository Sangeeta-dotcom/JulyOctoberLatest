package org.testing.testScripts;



	import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testing.Assertion.Assertion;
import org.testing.Base.Base;
//import org.testing.Base.Base;
import org.testing.Pages.Home_Page;
	import org.testing.Pages.Login_Page;
import org.testing.reportCapture.ReportCapture;
import org.testing.utilities.LogsCapture;
	import org.testing.utilities.ScreenshotCapture;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

	public class TC1_LoginYoutube extends Base
	{
		@Test
	public void tc1() throws IOException, InterruptedException
	{
			
		ExtentReports report=ReportCapture.takeReport();
		ExtentTest tc1= report.startTest("TC1_YoutubeTrending");
			
		Login_Page login=new Login_Page(driver,pr);
		login.signin("sangeetanesur@gmail","Sangeeta@123");
		
		//ScreenshotCapture.takeScreenshot(driver, "D:\\Screenshots\\tc1_login.png");
			
		Home_Page home=new Home_Page(driver,pr);
		home.trending_click();
		LogsCapture.takeLog("login successfully for tc1", "TestCase1");
		
		tc1.log(LogStatus.PASS, "Treninding click successfully for tc1");
		
		//ScreenshotCapture.takeScreenshot(driver, "D:\\Screenshots\\tc1_trending.png");
	//	
		//we can verify login and logout by comparing the URL(Assertion topic)
		//String currentURL=driver.getCurrentUrl();
		
		
		//Boolean result=Assertion.assert2(currentURL, "https://www.youtube.com", "TestCase1");//this is soft assertion
		
		//Assert.assertFalse(result);//condition must be true it is hard assertion
				login.signout();
				report.endTest(tc1);
				report.flush();
			
		
	}
	}



