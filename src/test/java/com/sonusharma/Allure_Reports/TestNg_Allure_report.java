package com.sonusharma.Allure_Reports;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class TestNg_Allure_report {
    String pincode;
    @Test
    public void testcase_1() {
        pincode = "110048";

        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all()
                .statusCode(200);
    }
    // Special character @#$%^&*(
    @Test
        public void testcase_2(){
            pincode = "@";
            RestAssured
                    .given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/" + pincode)
                    .when()
                    .get()
                    .then()
                    .log().all()
                    .statusCode(200);
        }
        // Without pincode
        @Test
    public void testcase_3(){
        pincode = "";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pincode)
                .when()
                .get()
                .then()
                .log().all()
                .statusCode(200);
    }

    }

