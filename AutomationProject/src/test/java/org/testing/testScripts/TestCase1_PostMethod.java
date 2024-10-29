package org.testing.testScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.reportCapture.ReportCapture;
import org.testing.responseValidation.validateResponse;
import org.testing.testSteps.HTTPMethods;
import org.testing.utilities.JsonHandling;
import org.testing.utilities.PropertiesHandle;
import org.testing.utilities.ScreenshotCapture;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.restassured.response.Response;

public class TestCase1_PostMethod 
{
	@Test
	public void testcase1() throws IOException
	{
		
		ExtentReports report=ReportCapture.takeReport();
		ExtentTest tc1= report.startTest("TestCase1_PostMethod");
		
		Properties pro=PropertiesHandle.readPropertiesFile("../AutomationProject/URI.properties");
		String jsonRequestdata=JsonHandling.readJson("../AutomationProject/src/test/java/org/testing/resources/RequestBody.json");
		HTTPMethods http=new HTTPMethods(pro);
		Response res=http.postMethod(jsonRequestdata, "Real_URI");
		
		//Assert.assertEquals(res.statusCode(), 201);//if hard assertion fail then code will not execute further
		Boolean statusCode=validateResponse.validateStatusCode(201, res,"TestCase1_PostMethod");//jus need to call method from testcase for validation
		if(statusCode)
		{
			tc1.log(LogStatus.PASS, "TestCase1_PostMethod is getting passed");
		}
		else
		{
			tc1.log(LogStatus.FAIL, "TestCase1_PostMethod is getting failed");
		}
		report.endTest(tc1);
		report.flush();
	
	}

}
