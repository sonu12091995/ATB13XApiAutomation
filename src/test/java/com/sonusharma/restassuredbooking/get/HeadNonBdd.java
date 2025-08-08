package com.sonusharma.restassuredbooking.get;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
// heder get only g=header and status code body will not come
public class HeadNonBdd {
    RequestSpecification r;// pre request - given part
    Response response;// making the request - when
    ValidatableResponse vr;// post request - then

    String pincode;
    @Test
    public  void head_Method(){
        pincode = "124001";
        // part-1
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/" +pincode);
        r.log().all();

        // Pert 2

        response = r.when().log().all().head();

        //part =3

        vr = response.then().log().all();
        vr.statusCode(200);

    }
}
