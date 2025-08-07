package com.sonusharma.RestAssured_RestBooking.PATCH;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Patch_nonBDD {
    // token , booking id, payload
    //url  https://restful-booker.herokuapp.com
    //path /booking/121

    RequestSpecification r ;
    Response response ;
    ValidatableResponse var;

    @Test
    public void patchMethod(){
        String booking = "3102";
        String token = "0e725ccd980969e";
        String payload = "{\n" +
                "    \"firstname\" : \"viki\",\n" +
                "    \"lastname\" : \"Brown\"\n" +
                "}";

        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/bookingid/"+booking);
        r.cookie("token"+token);// token because under header token is add on hte cookie
        r.contentType(ContentType.JSON);
        r.body(payload).log().all();

        // step=2
        response = r.when().log().all().patch();

        //step=3

        var  =response.then().log().all();
        var.statusCode(200);

    }
}
