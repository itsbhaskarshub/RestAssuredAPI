package com.RestAssuredMain.API;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC010_postRequest {

	@Test
	public void postResponse()
	{
		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
		String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyTmFtZSI6InRlc3RpbmcxMjMiLCJwYXNzd29yZCI6IlBhc3N3b3JkQDEiLCJpYXQiOjE2Mjg1NjQyMjF9.lW8JJvJF7jKebbqPiHOBGtCAus8D9Nv1BK6IoIIMJQ4";

		String isbn = "9781449325865";
		RequestSpecification httpRequest = RestAssured.given().header("Authorization", "Bearer " + token)
				.header("Content-Type", "application/json");
		
		//Calling the Delete API with request body
	    Response res = httpRequest.body("{ \"isbn\": \"" + isbn + "\", \"userId\": \"" + token + "\"}").put("/BookStore/v1/Book/9781449325865");

	    //Fetching the response code from the request and validating the same
	    System.out.println("The response code - " +res.getStatusCode());
	    Assert.assertEquals(res.getStatusCode(),404);
}
}