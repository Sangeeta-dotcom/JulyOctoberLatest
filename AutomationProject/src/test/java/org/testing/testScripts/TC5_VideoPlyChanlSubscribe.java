package org.testing.testScripts;

import java.io.IOException;

import org.testing.Base.Base;
import org.testing.Pages.Login_Page;
import org.testing.Pages.Video_Page;
import org.testing.reportCapture.ReportCapture;
import org.testing.utilities.LogsCapture;
import org.testing.utilities.ScreenshotCapture;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC5_VideoPlyChanlSubscribe extends Base
{
	@Test
	public void tc5() throws InterruptedException, IOException
	{
		ExtentReports report=ReportCapture.takeReport();
		ExtentTest tc5= report.startTest("TC5_ChannelSubscribe");
		
		Login_Page login=new Login_Page(driver,pr);
		login.signin("sangeetanesur", "Sangeeta@123");
		Video_Page video=new Video_Page(driver,pr,jse);
		video.channelSubscribe();
		ScreenshotCapture.takeScreenshot(driver, "D:\\Screenshots\\tc5_channelSubscribe_.png");
		//LogsCapture.takeLog("channelSubscribe is success in TC5", "TestCase5");
		tc5.log(LogStatus.PASS, "channelSubscribe is success in TC5");
		
		report.endTest(tc5);
		report.flush();
	
		login.signout();
		
		
	}

}
