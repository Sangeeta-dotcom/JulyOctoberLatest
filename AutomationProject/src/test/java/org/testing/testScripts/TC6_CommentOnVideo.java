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

public class TC6_CommentOnVideo extends Base
{
	@Test
	public void tc6() throws InterruptedException, IOException
	{
		ExtentReports report=ReportCapture.takeReport();
		ExtentTest tc6= report.startTest("TC6_CommentVideo");
		
		Login_Page login=new Login_Page(driver,pr);
		login.signin("sangeetanesur", "Sangeeta@123");
		Video_Page video=new Video_Page(driver,pr,jse);
		video.commentVideo();
		ScreenshotCapture.takeScreenshot(driver, "D:\\Screenshots\\tc6_commentVideo.png");
		//LogsCapture.takeLog("commentVideo is success in TC6", "TestCase6");
		tc6.log(LogStatus.PASS, "commentVideo is success in TC6");
		
		report.endTest(tc6);
		report.flush();
	
		login.signout();
	}

}
