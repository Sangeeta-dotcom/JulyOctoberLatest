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

public class TestCase910_DeleteMethod 
{
	@Test
	public void tc10() throws IOException
	{
		ExtentReports report=ReportCapture.takeReport();
		ExtentTest tc10=report.startTest("TestCase910_DeleteMethod");
		
		Properties pro=PropertiesHandle.readPropertiesFile("../AutomationProject/URI.properties");
		HTTPMethods http=new HTTPMethods(pro);
		Response res=http.DeleteMethod("Real_URI3");
		Boolean statusCode=validateResponse.validateStatusCode(404, res, "TestCase910_DeleteMethod");
		if(statusCode)
		{
			tc10.log(LogStatus.PASS, "TestCase910_DeleteMethod is getting passed");
		}
		else
		{
			tc10.log(LogStatus.FAIL, "TestCase910_DeleteMethod is getting failed");
		}
		report.endTest(tc10);
		report.flush();
	}

}
