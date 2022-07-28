package com.RestAssuredMain.API;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC009_AuthResponse {
	
	@Test
	public void authResponse()
	{
		RestAssured.baseURI = "https://demoqa.com/swagger/#/Account/AccountV1AuthorizedPost";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get();
		
		//Creating Authorization and Post Username and Password
		int statusCode = response.statusCode();
		String responseBody = response.body().asString();
		
		System.out.println("Status Code ==> "+ statusCode);
		System.out.println("Status Message Body ==> "+ responseBody);


	}

}
