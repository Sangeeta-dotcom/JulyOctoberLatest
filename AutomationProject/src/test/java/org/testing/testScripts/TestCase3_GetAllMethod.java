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

public class TestCase3_GetAllMethod 
{
	@Test
	public void testcase3() throws IOException
	{
		ExtentReports report=ReportCapture.takeReport();
		ExtentTest tc3= report.startTest("TestCase3_GetAllMethod");
		
		Properties pro=PropertiesHandle.readPropertiesFile("../AutomationProject/URI.properties");
		HTTPMethods http=new HTTPMethods(pro);
		Response res=http.getAllMethod("Real_URI2");
		Boolean statusCode=validateResponse.validateStatusCode(200, res,"TestCase3_GetAllMethod");
		if(statusCode)
		{
			tc3.log(LogStatus.PASS, "TestCase3_GetAllMethod is getting passed");
		}
		else
		{
			tc3.log(LogStatus.FAIL, "TestCase3_GetAllMethod is getting failed");
		}
		report.endTest(tc3);
		report.flush();
	
	}

	}
	

