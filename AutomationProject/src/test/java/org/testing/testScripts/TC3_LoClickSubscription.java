package org.testing.testScripts;

import java.io.IOException;

import org.testing.Base.Base;
import org.testing.Pages.Home_Page;
import org.testing.Pages.Login_Page;
import org.testing.Pages.Video_Page;
import org.testing.reportCapture.ReportCapture;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC3_LoClickSubscription extends Base
{
	@Test
	public void tc3() throws InterruptedException, IOException
	{
		ExtentReports report=ReportCapture.takeReport();
		ExtentTest tc3= report.startTest("TC3_SubscriptionsClick");
		
		Login_Page login=new Login_Page(driver,pr);
		login.signin("sangeetanesur", "Sangeeta@123");
		Home_Page home=new Home_Page(driver,pr);
		home.subscriptions_Click();
		ScreenshotCapture.takeScreenshot(driver, "D:\\Screenshots\\tc3_subscriptionsClick.png");
		//LogsCapture.takeLog("subscriptionsClick success in TC3", "TestCase3");
		tc3.log(LogStatus.PASS, "subscriptionsClick success in TC3", "TC3_SubscriptionsClick");
		
		report.endTest(tc3);
		report.flush();
	
		login.signout();
		
		
	}

}
