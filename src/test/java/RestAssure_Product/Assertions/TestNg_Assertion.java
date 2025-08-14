package RestAssure_Product.Assertions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestNg_Assertion {

    RequestSpecification r;
    Response response;
    ValidatableResponse var;

    @Test
    public void test_AssertJ() {
        ;
        String payload = "{\n" +
                "\"id\": 21,\n" +
                "\"title\": \"Tshirt\",\n" +
                "\"price\": 2000,\n" +
                "\"description\": \"This the Levis T-shirt\",\n" +
                "\"category\": \"Man and woman\",\n" +
                "\"image\": \"https://fakestoreapi.com/img/71z3kpMAYsL._AC_UY879_t.png\"\n" +
                "}";

        // Step 1: Pre-request
        r = RestAssured.given();
        r.baseUri("https://fakestoreapi.com");
        r.basePath("/products");
        r.contentType(ContentType.JSON);
        r.body(payload);

        // Step 2: Action
        response = r.when().log().all().post();

        // Step 3: Validation
        var = response.then();
        var.statusCode(201);
        var.log().all();

        //Extracting the response body for further assertions
        Integer id = response.then().extract().path("id");
        String title = response.then().extract().path("title");
        Integer price = response.then().extract().path("price");
        String description = response.then().extract().path("description");
        String category = response.then().extract().path("category");
        String image = response.then().extract().path("image");

        // TestNg assertions
        




}}
