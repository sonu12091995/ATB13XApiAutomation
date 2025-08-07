package RestAssure_Product.POST;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Post_Product {


    RequestSpecification r;
    Response response;
    ValidatableResponse var;
@Test
    public void AddProduct(){
      String  payload= "Copy\n" +
              "{\n" +
              "\"id\": 73,\n" +
              "\"title\": \"Tshirt\",\n" +
              "\"price\": 2000,\n" +
              "\"description\": \"This the Levis T-shirt\",\n" +
              "\"category\": \"Man and woman\",\n" +
              "\"image\": \"https://fakestoreapi.com/img/71z3kpMAYsL._AC_UY879_t.png\"\n" +
              "}";

      r= RestAssured.given();
      r.baseUri("https://fakestoreapi.com");
      r.basePath("/products/");
      r.body(payload);

      // Step==2
        response = r.when().log().all().post();

        //step =3
        var = response.then();
        var.statusCode(201);
        var.log().all();

    }



}
