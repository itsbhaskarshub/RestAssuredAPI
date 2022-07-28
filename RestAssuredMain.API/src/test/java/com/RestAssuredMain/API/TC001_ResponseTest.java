package com.RestAssuredMain.API;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_ResponseTest {

	@Test
	public void GetBooksDetails()
	{
		//Specify Base URI for RestAssured
		RestAssured.baseURI ="https://demoqa.com/BookStore/v1/Books";
		
		//Request object
		RequestSpecification httpRequest = RestAssured.given();
		
		//Response object
		Response response = httpRequest.request(Method.GET, "");
		
		int statusCode = response.statusCode();
		
		Assert.assertEquals(statusCode, 200);
		System.out.println(response.getStatusLine());

	}
	
	
}
