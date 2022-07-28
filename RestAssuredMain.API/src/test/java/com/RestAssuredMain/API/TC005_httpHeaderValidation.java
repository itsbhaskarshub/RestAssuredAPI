package com.RestAssuredMain.API;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC005_httpHeaderValidation {

	@Test
	public void httpValidation()
	{
		RestAssured.baseURI = "https://demoqa.com/BookStore/v1/Books";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get();
		
		//Access Header Response
		String ActualContentType = response.header("Content-Type");
		String ActualServer = response.header("Server");
		String ExpectedContentType = "application/json; charset=utf-8";
		String ExpectedServer = "nginx/1.17.10 (Ubuntu)";
		
		// Assert for validation
		Assert.assertEquals(ActualContentType, ExpectedContentType);
		Assert.assertEquals(ActualServer, ExpectedServer);

	}
}
