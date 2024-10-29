package org.testing.testSteps;

import java.util.Properties;
//input parameter-----Request body,URI keyName
//For fetching the uri value with the help of uriKeyName 
//from the properties file we need the properties class object

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class HTTPMethods 
{
	Properties pr;
	public HTTPMethods(Properties pr)
	{
		this.pr=pr;
	}
		
  public Response postMethod(String RequestBody,String uriKeyName)//change type from void to Response
	{

	  String uriValue=pr.getProperty(uriKeyName);
	 
	  Response res=
			  //here you need to give Restassured import then you will get all
	  given()
	  .contentType(ContentType.JSON)
	  .body(RequestBody)
	  .when()
	  .post(uriValue);
	  
	  
	  System.out.println("Status code is ");
	  System.out.println(res.statusCode());
	  
	  System.out.println("Request body is ");
	  System.out.println(res.asString());
	return res;
	  }
  public Response putMethod(String RequestBody,String uriKeyName,String endPoint)
  {
	  String uriValue=pr.getProperty(uriKeyName)+"/"+endPoint;
	  Response res=
	  given()
	  .contentType(ContentType.JSON)
	  .body(RequestBody)
	  .when()
	  .put(uriValue);
	  System.out.println("Status code is ");
	  System.out.println(res.statusCode());
	  System.out.println("Response data is ");
	  System.out.println(res.asString());
	  return res;
	  
  }
  public Response getAllMethod(String uriKeyName)
  {
	  String uriValue=pr.getProperty(uriKeyName);
	  Response res=
	  given()
	  .contentType(ContentType.JSON)
	  .when()
	  .get(uriValue);
	  
	  System.out.println("Status code is ");
	  System.out.println(res.statusCode());
	  System.out.println("Response data is ");
	  System.out.println(res.asString());
	  return res;
	  
  }
  public Response getParticularMethod(String uriKeyName,String endPoint)
  {
	  String uriValue=pr.getProperty(uriKeyName)+"/"+endPoint;
	  Response res=
	  given()
	  .contentType(ContentType.JSON)
	  .when()
	  .get(uriValue);
	  
	  System.out.println("Status code is ");
	  System.out.println(res.statusCode());
	  System.out.println("Response data is ");
	  System.out.println(res.asString());
	  return res;
			  
}
  public Response deleteMethod(String uriKeyName)
  {
	  String uriValue=pr.getProperty(uriKeyName);
	  Response res=
	  given()
	  .contentType(ContentType.JSON)
	  .when()
	  .delete(uriValue);
	  
	  System.out.println("Status code is ");
	  System.out.println(res.statusCode());
	  
	  System.out.println("Response data is ");
	  System.out.println(res.asString());
	  return res;
	  
  }
  public Response PostMethod(String RequestBody,String uriKeyName)
  {
	  String uriValue=pr.getProperty(uriKeyName);
			
	  Response res=
		given()
		.contentType(ContentType.JSON)
		.body(RequestBody)
		.when()
		.post(uriValue);
	  System.out.println("Status Code is ");
	  System.out.println(res.statusCode());
	  System.out.println("Response data is ");
	  System.out.println(res.asString());
	  return res;
		
  }
  public Response PutMethod(String Requestbody,String uriKeyName,String endPoint)
  {
	  String uriValue=pr.getProperty(uriKeyName)+ "/"+endPoint;
	  
	  Response res=
	  given()
	  .contentType(ContentType.JSON)
	  .body(Requestbody)
	  .when()
	  .put(uriValue);
	  
	  System.out.println("Status code is ");
	  System.out.println(res.statusCode());
	  System.out.println("Response data is");
	  System.out.println(res.asString());
	  return res;
	  
  }
  public Response GetAllMethod(String uriKeyName)
  {
	  String uriValue=pr.getProperty(uriKeyName);
	  Response res=
	  given()
	  .contentType(ContentType.JSON)
	  .when()
	  .get(uriValue);
	  
	  System.out.println("Status Code is ");
	  System.out.println(res.statusCode());
	  System.out.println("Response data is ");
	  System.out.println(res.asString());
	  return res;
  }
  
  public Response GetParticularMethod(String uriKeyName,String endPoint)
  {
	  String uriValue=pr.getProperty(uriKeyName)+"/" +endPoint;
		Response res=	 
			  
	    given()
	    .contentType(ContentType.JSON)
	    .when()
	    .get(uriValue);
	  
	  System.out.println("Status code is");
	  System.out.println(res.statusCode());
	  System.out.println("Response data is ");
	  System.out.println(res.asString());
	  return res;
	  		
	   }
  public Response DeleteMethod(String uriKeyName)
  {
	  String uriValue=pr.getProperty(uriKeyName);
	  Response res=
	  given()
	  .contentType(ContentType.JSON)
	  .when()
	  .delete(uriValue);
	  
	  System.out.println("Status Code is ");
	  System.out.println(res.statusCode());
	  System.out.println("Response data is ");
	  System.out.println(res.asString());
	  return res;
	  
	  
  }
}
  
  
  
  
  
  
  
  
  
  
  
  
  
  














