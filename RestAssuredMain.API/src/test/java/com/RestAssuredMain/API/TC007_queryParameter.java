package com.RestAssuredMain.API;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class TC007_queryParameter {

	
	@Test
	public void queryParameter()
	{
		RestAssured.baseURI="https://demoqa.com/BookStore/v1";
		RequestSpecification httpRequest = RestAssured.given();
		// Provide Query Parameter for Rest
		Response response = httpRequest.queryParam("isbn", "9781449325862").get("/Books");
		// Get Response Body
		ResponseBody body = response.body();
		String responseBody = body.asString();
		
		// Creating JSONPath object and Passing the above string
		JsonPath jpath = new JsonPath(responseBody);
		String title = jpath.getString("title");
		
		// Get Title from Response
		System.out.println("Title of book: " + title);
		
		
		
		
		
		
		
				
	}
}
