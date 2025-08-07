package RestAssure_Product.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GET_All_Product {

    RequestSpecification r;
    Response response;
    ValidatableResponse var;
@Test
    public void ProductGET(){

        r= RestAssured.given();
        r.baseUri("https://fakestoreapi.com");
        r.basePath("/products/");
        // Step=2
        response = r.when().log().all().get();

        //Steop=3

        var = response.then();
        var.statusCode(200);
        var.log().all();
    }
}
