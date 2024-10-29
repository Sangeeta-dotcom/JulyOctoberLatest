package org.testing.responseValidation;

import org.testing.Assertion.Assertion;

import io.restassured.response.Response;

public class validateResponse 
{
	public static Boolean validateStatusCode(int expectedStatusCode, Response res,String className)
	{
		int actualStatusCode=res.statusCode();
		Boolean result=Assertion.assert1(actualStatusCode, expectedStatusCode,className);
		return result;
	}

}
