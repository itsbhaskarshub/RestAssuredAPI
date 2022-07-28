package com.RestAssuredMain.API;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC003_httpResponse {
	
	
	@Test
	public void httpHeaders()
	{
		RestAssured.baseURI="https://demoqa.com/BookStore/v1/Books";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "");
		
		Headers allHeaders = response.headers();
		
		for (Header header : allHeaders)
		{
			String header1 = "Keys:" + header.getName()+ "  ;  "+ "value:"+ header.getValue();
			System.out.println(header1);
		}
	}
	
}
