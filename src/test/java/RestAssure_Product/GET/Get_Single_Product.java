package RestAssure_Product.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Get_Single_Product {
    RequestSpecification r;
    Response response;
    ValidatableResponse var;

    @Test
    public void getSingleProduct(){
        // get product with id
        String productid = "1";// create the id first if you dont know id with help post method


        r= RestAssured.given();
        r.baseUri("https://fakestoreapi.com");
        r.basePath("/products/" +productid);
        r.log().all();

        //Step=2

        response = r.when().log().all().get();

        // Step=3

        var = response.then();
        var.statusCode(200);
        var.log().all();

    }
}
