package com.sonusharma;


import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class demo {
// token genrate
    // url https://restful-booker.herokuapp.com/auth
    // paylod,
    //content type
    //status code  =200

    RequestSpecification r;// pre-rq    given
    Response response;// Action  when
    ValidatableResponse var ;  //then


    String payload = "{\n" +
            "    \"username\" : \"admin\",\n" +
            "    \"password\" : \"password123\"\n" +
            "}";
@Test
public void pinreq(){

r = RestAssured.given();
r.baseUri("https://restful-booker.herokuapp.com");
r.basePath("/auth/");
r.contentType(ContentType.JSON);
r.body(payload);
r.log().all();

// step =2  action method

    response = r.when().log().all().post();

   // step =3  validation

    var = response.then();
    var.statusCode(200);
    var.log().all();





}





}
