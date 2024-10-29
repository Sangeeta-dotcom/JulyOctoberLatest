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

public class TestCase7_PutMethod 
{
	@Test
  public void tc7() throws IOException
  {
	  ExtentReports report=ReportCapture.takeReport();
	  ExtentTest tc7=report.startTest("TestCase7_PutMethod");
		
	  Properties pro=PropertiesHandle.readPropertiesFile("../AutomationProject/URI.properties");
	  String jsonRequestBodyData=JsonHandling.readJson("../AutomationProject/src/test/java/org/testing/resources/StudentRequestBody.json");
	  HTTPMethods http=new HTTPMethods(pro);
	  Response res=http.putMethod(jsonRequestBodyData, "Real_URI3", "4");
	  Boolean statusCode=validateResponse.validateStatusCode(200, res, "TestCase7_PutMethod");
	  if(statusCode)
	  {
		  tc7.log(LogStatus.PASS, "TestCase7_PutMethod is getting passed");
	  }
	  else
	  {
		  tc7.log(LogStatus.FAIL, "TestCase7_PutMethod is getting failed");
	  }
	  report.endTest(tc7);
	  report.flush();
	  
  }
	
}
