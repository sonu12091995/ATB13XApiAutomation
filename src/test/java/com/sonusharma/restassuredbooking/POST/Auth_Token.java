package com.sonusharma.restassuredbooking.POST;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;


public class Auth_Token {
    //url https://restful-booker.herokuapp.com/auth
    //Content-Type  -  application/json
    //payload   {
    //    "username" : "admin",
    //    "password" : "password123"
    //          }
    //
     String payload = "  {\n" +
            "    //    \"username\" : \"admin\",\n" +
            "    //    \"password\" : \"password123\"\n" +
            "    //          }";

      RequestSpecification r;
      Response response;
      ValidatableResponse var;

      @Test
     public void TokenTest(){
         // Step = 1

         r = RestAssured.given();
         r.baseUri(" https://restful-booker.herokuapp.com");
         r.basePath("/auth");
         r.contentType(ContentType.JSON); // Content type
         r.body(payload);  // Add payload
         r.log().all(); // all logs print on console

/*

          r.header("Content-Length","10000");   //Ned header
          r.auth().basic("admin","password");  token if need
          r.auth().oauth2("ey346363534535"); token
          r.header("Autorization","Bearer ey0021340123001240124"); barrer token
*/


        // Step-2  Making HTTP req

          response = r.when().log().all().post();

          //Step =3  Validate the code

          var = response.then();
          var.statusCode(200);







     }


}
