package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.reportCapture.ReportCapture;
import org.testing.responseValidation.validateResponse;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.restassured.response.Response;

public class TestCase5_DeleteMethod 
{
	@Test
	public void testcase5() throws IOException
	{
		ExtentReports report=ReportCapture.takeReport();
		ExtentTest tc5 = report.startTest("TestCase5_DeleteMethod");
			
		Properties pro=PropertiesHandle.readPropertiesFile("../AutomationProject/URI.properties");
		HTTPMethods http=new HTTPMethods(pro);
		Response res=http.deleteMethod("Real_URI2");
		Boolean statusCode=validateResponse.validateStatusCode(204, res,"TestCase5_DeleteMethod");
		if(statusCode)
		{
			tc5.log(LogStatus.PASS, "TestCase5_DeleteMethod is getting passed");
		}
		else
		{
			tc5.log(LogStatus.FAIL, "TestCase5_DeleteMethod is getting failed");
		}
		report.endTest(tc5);
		report.flush();
	}

}
