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

public class TestCase8_GetAllMethod 
{
	@Test
	public void tc8() throws IOException
	{
		ExtentReports report=ReportCapture.takeReport();
		ExtentTest tc8=report.startTest("TestCase8_GetAllMethod");
				
		Properties pro=PropertiesHandle.readPropertiesFile("../AutomationProject/URI.properties");
		HTTPMethods http=new HTTPMethods(pro);
		Response res=http.GetAllMethod("Real_URI3");
		Boolean statusCode=validateResponse.validateStatusCode(200, res, "TestCase8_GetAllMethod");
		if(statusCode)
		{
			tc8.log(LogStatus.PASS, "TestCase8_GetAllMethod is getting passed");
		}
		else
		{
			tc8.log(LogStatus.FAIL, "TestCase8_GetAllMethod is getting failed");
		}
		report.endTest(tc8);
		report.flush();
	}

}
