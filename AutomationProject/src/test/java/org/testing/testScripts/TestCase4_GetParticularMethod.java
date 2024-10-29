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

public class TestCase4_GetParticularMethod 
{
	@Test
	public void testcase4() throws IOException
	{
		ExtentReports report=ReportCapture.takeReport();
		ExtentTest tc4= report.startTest("TestCase4_GetParticularMethod");
		
		Properties pro=PropertiesHandle.readPropertiesFile("../AutomationProject/URI.properties");
		HTTPMethods http=new HTTPMethods(pro);
		Response res=http.getParticularMethod("Real_URI2", "2");
		Boolean statusCode=validateResponse.validateStatusCode(200, res,"TestCase4_GetParticularMethod");
		if(statusCode)
		{
			tc4.log(LogStatus.PASS, "TestCase4_GetParticularMethod is getting passed");
		}
		else
		{
			tc4.log(LogStatus.FAIL, "TestCase4_GetParticularMethod is getting failed");
		}
		report.endTest(tc4);
		report.flush();
	
	}

	
	}


