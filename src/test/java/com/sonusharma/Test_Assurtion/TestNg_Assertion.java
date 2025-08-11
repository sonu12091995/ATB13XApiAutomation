package com.sonusharma.Test_Assurtion;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestNg_Assertion {

    RequestSpecification r;
    Response response;
    ValidatableResponse var;
    String token;


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

        // Extraction step-1
        // Concept #1 - Normal( TestNG or Assertj) IS IMP
        Integer bookingId = response.then().extract().path("bookingid");
        String firstname = response.then().extract().path("booking.firstname");
        String lastname = response.then().extract().path("booking.lastname");
        Integer totalprice = response.then().extract().path("booking.totalprice");
        Integer depositpaid = response.then().extract().path("booking.depositpaid");
        String checkin = response.then().extract().path("booking.bookingdates.checkin");
        String checkout = response.then().extract().path("booking.bookingdates.checkout");
        String additionalneeds = response.then().extract().path("booking.additionalneeds");

      //Asert now step=2
        Assert.assertEquals(firstname,"Pramod");
        Assert.assertEquals(lastname,"Dutta");
        Assert.assertNotNull(bookingId);

        if(!firstname.contains("Pramod")){
            Assert.fail("Failed kar diya Test");
        }







    }
    }
