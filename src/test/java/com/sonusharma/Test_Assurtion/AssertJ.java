package com.sonusharma.Test_Assurtion;
import static org.assertj.core.api.Assertions.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class AssertJ {
    RequestSpecification r;
    Response response;
    ValidatableResponse var;
    Integer bookingId;

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
    public void test_hemcreast_Assurtion() {

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
        // AssertJ( 3rd- Lib to Assertions) - 20%
        Integer bookingId = response.then().extract().path("bookingid");
        String firstname = response.then().extract().path("booking.firstname");
        String lastname = response.then().extract().path("booking.lastname");
        boolean depositpaid = response.then().extract().path("booking.depositpaid");

        assertThat(bookingId).isNotZero().isNotNull().isPositive();
        assertThat(firstname).isNotBlank().isNotEmpty().isNotNull().isEqualTo("viki");


    }
}
