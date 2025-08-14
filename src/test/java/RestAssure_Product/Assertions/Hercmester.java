package RestAssure_Product.Assertions;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.equalTo;

public class Hercmester {
    RequestSpecification r;
    Response response;
    ValidatableResponse var;
    @Test
    public void test_Hercmester1() {;
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

                // Step 4: Additional assertions
                var.body("id", equalTo(21));
                var.body("title", equalTo("Tshirt"));
                var.body("price", equalTo(2000));
                var.body("description", equalTo("This the Levis T-shirt"));
                var.body("image", equalTo("https://fakestoreapi.com/img/71z3kpMAYsL._AC_UY879_t.png"));
            }
        }


