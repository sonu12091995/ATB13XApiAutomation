package RestAssure_Product.DELETE;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Delete_product {

    RequestSpecification r;
    Response response;
    ValidatableResponse var;

    @Test
    public void DeleteProduct() {

        String productid = "1";  // Use an existing ID like 1 for fakestoreapi

        // Step 1: Setup Request
        r = RestAssured.given();
        r.baseUri("https://fakestoreapi.com");  // ✅ Corrected URI
        r.basePath("/products/" + productid);

        // Step 2: Send DELETE
        response = r.when().log().all().delete();

        // Step 3: Validate
        var = response.then();
        var.statusCode(200);  // ✅ Fakestore API returns 200 for DELETE
        var.log().all();
    }
}
