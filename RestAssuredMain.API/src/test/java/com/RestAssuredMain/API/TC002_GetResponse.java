package com.RestAssuredMain.API;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC002_GetResponse {
	
	@Test
	public void getResponse()
	{
		// Rest Url for response
		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
		
		// Request Object
		RequestSpecification httpRequest = RestAssured.given();
		
		//Request Response
		Response response = httpRequest.get();
		
		//Request Body
		String responseBody = response.getStatusLine();
		
		System.out.println("Status received => " + responseBody ); 
		System.out.println("Response=>" + response.prettyPrint());
				
		
		
	}

}
