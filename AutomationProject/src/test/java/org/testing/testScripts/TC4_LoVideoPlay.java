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

public class TC4_LoVideoPlay extends Base
{
	@Test
	public void tc4() throws InterruptedException, IOException
	{
		ExtentReports report=ReportCapture.takeReport();
		ExtentTest tc4= report.startTest("TC4_VideoLike");
		
		Login_Page login=new Login_Page(driver,pr);
		login.signin("sangeetanesur", "Sangeeta@123");
		Video_Page video=new Video_Page(driver,pr,jse);
		video.likeVideo();
		ScreenshotCapture.takeScreenshot(driver, "D:\\Screenshots\\tc4_videoLike.png");
		//LogsCapture.takeLog("VideoLike success in TC4", "TestCase4");
		tc4.log(LogStatus.PASS, "VideoLike success in TC4");
		
		report.endTest(tc4);
		report.flush();
	
		login.signout();
		
	}

}
