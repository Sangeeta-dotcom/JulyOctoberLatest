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

	public class TC2_LoginHistory extends Base
	{
		@Test
		public void tc2() throws InterruptedException, IOException
		{
			ExtentReports report=ReportCapture.takeReport();
			ExtentTest tc2= report.startTest("TC2_HistoryClick");
			
			Login_Page login=new Login_Page(driver,pr);
			login.signin("sangeetanesur", "Sangeeta@123");
			Home_Page home=new Home_Page(driver,pr);
			home.history_Click();
			ScreenshotCapture.takeScreenshot(driver, "D:\\Screenshots\\tc2_HistoryClick.png");
			//LogsCapture.takeLog("History click is success in Tc2", "TestCase2");//instead of this line the below line
			tc2.log(LogStatus.PASS, "History click is success in Tc2");
			
			report.endTest(tc2);
			report.flush();
			login.signout();
			
			
		}

	}



