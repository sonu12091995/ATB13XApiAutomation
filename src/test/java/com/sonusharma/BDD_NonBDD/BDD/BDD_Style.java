package com.sonusharma.BDD_NonBDD.BDD;

import io.restassured.RestAssured;

public class BDD_Style {
    public static void main(String[] args) {

        RestAssured.given()
                      .baseUri("https://restful-booker.herokuapp.com")
                       .basePath("/ping")

                .when()
                .log().all().get()


                .then()
                .log().all().statusCode(200);
    }
}
