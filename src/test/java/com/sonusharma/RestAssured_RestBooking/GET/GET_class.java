package com.sonusharma.RestAssured_RestBooking.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GET_class {
   RequestSpecification r;// pre request - given part
    Response response;// making the request - when
    ValidatableResponse vr;// post request - then

    String pincode;
    @Test
public  void get_Method(){
       pincode = "124001";
    // part-1
    r = RestAssured.given();
    r.baseUri("https://api.zippopotam.us");
    r.basePath("/IN/" +pincode);
    r.log().all();

    // Pert 2

   response = r.when().log().all().get();

   //part =3

    vr = response.then().log().all();
    vr.statusCode(200);

}
@Test
    public  void get_MethodNegetive() {

        pincode = "@";

        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" + pincode);
        r.log().all();
        // Part=2

        response = r.when().log().all().get();
        System.out.println(response.toString());

        // pert=3
        vr = response.then().log().all();
        vr.statusCode(404);
    }
    }
