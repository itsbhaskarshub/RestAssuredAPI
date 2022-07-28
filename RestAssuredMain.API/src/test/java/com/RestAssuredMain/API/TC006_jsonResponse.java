package com.RestAssuredMain.API;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class TC006_jsonResponse {
	
	@Test
	public void jsonResponse()
	{
		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get();
		
		// Get Json Body Response
		ResponseBody Body = response.getBody();
		
		System.out.println("Response Json Body ==> "+ Body.asString());
		String validBody = Body.asString();
		
		Assert.assertEquals(validBody.contains("Richard"), true);
		
		
		
		
	}
}
