package com.RestAssuredMain.API;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC008_putResponse {
	
	
	@Test
	public void postResponse()
	{
		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
		RequestSpecification httpRequest = RestAssured.given();

		// Creating Json Object and Add Json Key with Value
		JSONObject requestParameters = new JSONObject();
		requestParameters.put("userId", "JohnDose");
		requestParameters.put("isbn", "9781449325862");

		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(requestParameters.toJSONString());
		
		Response response = httpRequest.post("/BookStoreV1BooksPost"); 
		System.out.println("The status received: " + response.statusLine());
		
	}
}
