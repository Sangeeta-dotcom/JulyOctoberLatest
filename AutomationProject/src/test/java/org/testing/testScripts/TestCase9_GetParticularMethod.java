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

public class TestCase9_GetParticularMethod 
{
	@Test
	public void tc9() throws IOException
	{
		ExtentReports report=ReportCapture.takeReport();
		ExtentTest tc9=report.startTest("TestCase9_GetParticularMethod");
		
		Properties pro=PropertiesHandle.readPropertiesFile("../AutomationProject/URI.properties");
		HTTPMethods http=new HTTPMethods(pro);
		Response res=http.GetParticularMethod("Real_URI3", "DC25");
		Boolean statusCode=validateResponse.validateStatusCode(200, res, "TestCase9_GetParticularMethod");
		if(statusCode)
		{
			tc9.log(LogStatus.PASS, "TestCase9_GetParticularMethod is getting passed");
		}
		else
		{
			tc9.log(LogStatus.FAIL, "TestCase9_GetParticularMethod is getting passed");
		}
		report.endTest(tc9);
		report.flush();
	}

}
