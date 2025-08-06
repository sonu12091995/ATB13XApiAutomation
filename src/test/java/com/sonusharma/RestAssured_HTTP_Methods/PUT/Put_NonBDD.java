package com.sonusharma.RestAssured_HTTP_Methods.PUT;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Put_NonBDD {
    // token , booking id, payload
    //url  https://restful-booker.herokuapp.com
    //path /booking/121

RequestSpecification r ;
Response response ;
ValidatableResponse var;

    @Test
 public void Putreq() {
     String booking = "3102";
     String token = "0e725ccd980969e";
     String payload = "{\n" +
             "    \"firstname\" : \"meenu\",\n" +
             "    \"lastname\" : \"Brown\",\n" +
             "    \"totalprice\" : 111,\n" +
             "    \"depositpaid\" : true,\n" +
             "    \"bookingdates\" : {\n" +
             "        \"checkin\" : \"2018-01-01\",\n" +
             "        \"checkout\" : \"2019-01-01\"\n" +
             "    },\n" +
             "    \"additionalneeds\" : \"Breakfast\"\n" +
             "}";

          r= RestAssured.given();
          r.baseUri("https://restful-booker.herokuapp.com");
          r.basePath("/bookingid/"+booking);
          r.cookie("token"+token);// token because under header token is add on hte cookie
          r.contentType(ContentType.JSON);
          r.body(payload).log().all();

          // step=2
        response = r.when().log().all().put();

        //step=3

        var  =response.then().log().all();
        var.statusCode(200);

 }

}
