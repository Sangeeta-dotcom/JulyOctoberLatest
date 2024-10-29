package org.testing.testScripts;

import java.io.IOException;

import org.testing.Base.Base;
import org.testing.Pages.Home_Page;
import org.testing.Pages.Login_Page;
import org.testing.reportCapture.ReportCapture;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC7_ClickOnWatchLater extends Base
{
	@Test
	public void tc7() throws InterruptedException, IOException
	{
		ExtentReports report=ReportCapture.takeReport();
		ExtentTest tc7= report.startTest("TC7_WatchLater");
		
		Login_Page login=new Login_Page(driver,pr);
		login.signin("sangeetanesur", "Sangeeta@123");
		Home_Page home=new Home_Page(driver,pr);
		home.watchLater();
		ScreenshotCapture.takeScreenshot(driver, "D:\\Screenshots\\tc7_watchLater.png");
		//LogsCapture.takeLog("watchLater click is success in Tc7", "TestCase2");
		tc7.log(LogStatus.PASS, "watchLater click is success in Tc7");
		
		report.endTest(tc7);
		report.flush();
	
		login.signout();
		
		
	}


}
