package org.testing.testScripts;

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

public class TestCase2_PutMethod 
{
	@Test
	public void testcase2() throws IOException
	{
		ExtentReports report=ReportCapture.takeReport();
		ExtentTest tc2= report.startTest("TestCase2_PutMethod");
		
		Properties pro=PropertiesHandle.readPropertiesFile("../AutomationProject/URI.properties");
		String jsonRequestdata=JsonHandling.readJson("../AutomationProject/src/test/java/org/testing/resources/updateRequestBody.json");
		HTTPMethods http=new HTTPMethods(pro);
		Response res=http.putMethod(jsonRequestdata, "Real_URI", "2");
		Boolean statusCode=validateResponse.validateStatusCode(200, res,"TestCase2_PutMethod");
		//jus need to call method from testcase for validation
		if(statusCode)
		{
			tc2.log(LogStatus.PASS, "TestCase2_PutMethod is getting passed");
		}
		else
		{
			tc2.log(LogStatus.FAIL, "TestCase2_PutMethod is getting failed");
		}
		report.endTest(tc2);
		report.flush();
	
	}

}
