package com.sonusharma.BDD_NonBDD.BDD;

import io.restassured.RestAssured;
// lots of copy paste not scalable

public class BDD_Multiple_Test_case {
    public static void main(String[] args) {
        // Positive Test - Valid Pincode
        String pincode = "110048";

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all()
                .statusCode(200);

// Negative Test - Invalid Pincode
        pincode = "a";

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all()
                .statusCode(404); // Typically invalid pincode returns 404

// Negative Test - No Pincode
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/")
                .when()
                .get()
                .then()
                .log().all()
                .statusCode(404); // API should return 404 for missing pincode
    }
}
