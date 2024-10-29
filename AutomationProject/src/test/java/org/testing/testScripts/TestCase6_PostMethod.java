package org.testing.testScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.reportCapture.ReportCapture;
import org.testing.responseValidation.validateResponse;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonHandling;
import org.testing.utilities.PropertiesHandle;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.restassured.response.Response;

public class TestCase6_PostMethod 
{    @Test
	public void testCase6() throws IOException
	{
	    ExtentReports report=ReportCapture.takeReport();
	    ExtentTest tc6=report.startTest("TestCase6_PostMethod");
	    		
		Properties pro=PropertiesHandle.readPropertiesFile("../AutomationProject/URI.properties");
		String jsonRequestdata=JsonHandling.readJson("../AutomationProject/src/test/java/org/testing/resources/StudentRequestBody.json");
		HTTPMethods http=new HTTPMethods(pro);
		Response res=http.PostMethod(jsonRequestdata, "Real_URI3");
		Boolean statusCode=validateResponse.validateStatusCode(201, res, "TestCase6_PostMethod");
		if(statusCode)
		{
			tc6.log(LogStatus.PASS, "TestCase6_PostMethod is getting passed");
		}
		else
		{
			tc6.log(LogStatus.FAIL, "TestCase6_PostMethod is getting failed");
		}
		report.endTest(tc6);
		report.flush();
	}

}
