package com.sonusharma.Test_Assurtion;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import org.hamcrest.Matchers;

public class Hamcrest_Assurtion {

    RequestSpecification r;
    Response response;
    ValidatableResponse var;

    String payload = "{\n" +
            "    \"firstname\" : \"viki\",\n" +
            "    \"lastname\" : \"Sharma\",\n" +
            "    \"totalprice\" : 111,\n" +
            "    \"depositpaid\" : true,\n" +
            "    \"bookingdates\" : {\n" +
            "        \"checkin\" : \"2018-01-01\",\n" +
            "        \"checkout\" : \"2019-01-01\"\n" +
            "    },\n" +
            "    \"additionalneeds\" : \"Breakfast\"\n" +
            "}";
    @Test
    public void  test_hemcreast_Assurtion(){

        // Step 1: Create a RequestSpecification
        // create booking id
        r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking");
        r.contentType(ContentType.JSON);
        r.body(payload).log().all();

        // Step 2: Make the request and get the response
        response = r.when().log().all().post();

        // Step 3: Validate the response`
        var = response.then().log().all();
        var.statusCode(200);

        // Extract the response body
        System.out.println(response.asString());//{"bookingid":2869,"booking":{"firstname":"viki","lastname":"Sharma","totalprice":111,"depositpaid":true,"bookingdates":{"checkin":"2018-01-01","checkout":"2019-01-01"},"additionalneeds":"Breakfast"}}


   //       Using JSON path finder and paste the response copy the
        //(bookingid,booking.firstname,booking.lastname,booking.totalprice et)
        var.body("bookingid",Matchers.notNullValue());
        var.body("booking.firstname",Matchers.equalTo("viki"));
        var.body("booking.lastname",Matchers.equalTo("Sharma"));
        var.body("booking.totalprice",Matchers.equalTo(111));
        var.body("booking.depositpaid",Matchers.equalTo(true));
        var.body("booking.bookingdates.checkin",Matchers.equalTo("2018-01-01"));
        var.body("booking.bookingdates.checkout",Matchers.equalTo("2019-01-01"));
        var.body("booking.additionalneeds",Matchers.equalTo("Breakfast"));





    }


}
