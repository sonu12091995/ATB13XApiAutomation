package RestAssure_Product.PUT;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Update_product {

    RequestSpecification r;
    Response response;
    ValidatableResponse var;


    @Test
    public void updateProduct(){

        String productid = "1";
        String payloads = "{\n" +
                "    \"id\": 1,\n" +
                "    \"title\": \"shirts man and woman\",\n" +
                "    \"price\": 200,\n" +
                "    \"description\": \"not shrink the T-shirt\",\n" +
                "    \"category\": \"men's clothing\",\n" +
                "    \"image\": \"https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_t.png\",\n" +
                "    \"rating\": {\n" +
                "        \"rate\": 20,\n" +
                "        \"count\": 150\n" +
                "    }\n" +
                "}";



        r= RestAssured.given();
        r.baseUri("https://fakestoreapi.com");
        r.basePath("/products/"+productid);
        r.body(payloads);

        // Step=2

        response = r.when().log().all().put();

        // Step==3

        var = response.then();
        var.statusCode(200);
        var.log().all();



    }
}
