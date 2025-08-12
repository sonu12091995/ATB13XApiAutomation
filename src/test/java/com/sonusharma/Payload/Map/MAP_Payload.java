package com.sonusharma.Payload.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.assertj.core.api.Assertions;
import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.LinkedHashMap;
import java.util.Map;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


public class MAP_Payload {

  /* "{\n" +
           "    \"firstname\" : \"meenu\",\n" +
           "    \"lastname\" : \"Brown\",\n" +
           "    \"totalprice\" : 111,\n" +
           "    \"depositpaid\" : true,\n" +
           "    \"bookingdates\" : {\n" +
           "        \"checkin\" : \"2018-01-01\",\n" +
           "        \"checkout\" : \"2019-01-01\"\n" +
           "    },\n" +
           "    \"additionalneeds\" : \"Breakfast\"\n" +
           "}";*/

RequestSpecification r;
Response response;
ValidatableResponse var;

    @Test
    public void testMap() {

        // Parent map
        Map<String, Object> parentMap = new LinkedHashMap<>();
        parentMap.put("firstname", "meenu");
        parentMap.put("lastname", "sharma");
        parentMap.put("totalprice", 111);  // integer
        parentMap.put("depositpaid", true); // boolean
        parentMap.put("additionalneeds", "Breakfast");

        // Child map
        Map<String, Object> childMap = new LinkedHashMap<>();
        childMap.put("checkin", "2018-01-01");
        childMap.put("checkout", "2025-01-01");

        // Add child map to parent
        parentMap.put("bookingdates",childMap);

        System.out.println(parentMap);

        // Step 1
        r = RestAssured.given()
                .baseUri("https://restful-booker.herokuapp.com")
                .basePath("/booking")
                .contentType(ContentType.JSON)
                .body(parentMap);

        // Step 2
        response = r.when().log().all().post();

        // Step 3
        var = response.then().log().all();
        var.statusCode(200);

        // Assertion Hercmister  based on the response
        //format var.body("Json path finder", Matchers.equalTo("meenu"));
       var.body("booking.firstname", Matchers.equalTo("meenu"));
        var.body("booking.lastname", Matchers.equalTo("sharma"));
        var.body("booking.bookingdates.checkout", Matchers.notNullValue());

        // TestNg Assertion and Assertj

        // Step- 1  Extract the valur syntex Integer bookingid = response.then().extract().path("JSON path URL");

        Integer bookingid = response.then().extract().path("bookingid");
        String firstname = response.then().extract().path("booking.firstname");
        String lastname = response.then().extract().path("booking.firstname");
        boolean depositpaid = response.then().extract().path("booking.depositpaid");

        //Step=2  Write assertion TestNG
        Assert.assertNotNull(bookingid);
        Assert.assertEquals(firstname,"meenu");
        Assert.assertEquals(lastname,"sharma");

        Assert.assertTrue(depositpaid);

       // Assertion AssertJ
        assertThat(bookingid).isNotZero().isNotNull().isPositive();
        assertThat(firstname).isNotBlank().isNotEmpty().isEqualTo("meenu");
        assertThat(depositpaid).isTrue().isNotNull();







    }

}
