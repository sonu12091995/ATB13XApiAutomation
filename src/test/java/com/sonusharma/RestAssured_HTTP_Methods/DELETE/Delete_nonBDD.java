package com.sonusharma.RestAssured_HTTP_Methods.DELETE;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Delete_nonBDD {
    // token , booking id, payload
    //url  https://restful-booker.herokuapp.com
    //path /booking/121

    RequestSpecification r ;
    Response response ;
    ValidatableResponse var;

    @Test
    public void DeleteMethod(){
        String bookingid = "3987";
        String token = "b713546733489e8";


        r= RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/bookingid/"+bookingid);
        r.cookie("token"+token);// token because under header token is add on hte cookie
        r.contentType(ContentType.JSON);


        // step=2
        response = r.when().log().all().delete();

        //step=3

        var  =response.then().log().all();
        var.statusCode(200);

    }
}
