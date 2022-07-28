package com.RestAssuredMain.API;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC004_httpHeaderReader {

	@Test
	public void httpReader()
	{
		RestAssured.baseURI="https://demoqa.com/BookStore/v1/Books";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get();
		
		Headers headers = response.getHeaders();
		String server = response.header("Server");
		String contentType = response.header("Content-Type");
		String contentEconding = response.header("Content-Encoding");	
		
		//Access to Header Value 
		System.out.println(server);	
		System.out.println(contentType);	
		System.out.println(contentEconding);	




		
		
	}
}
