package HTTP_Methods_Basics;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class GetRequest {
    public static void main(String[] args) {
        //Build request
        RestAssured.baseURI = "https://restful-booker.herokuapp.com/";
        RestAssured.basePath = "booking/{id}";
        RequestSpecification requestSpecification = RestAssured.given().log().all();
        requestSpecification.pathParam("id",10);
        //Hit Request and Get Response
        Response response = requestSpecification.get();
        ValidatableResponse validatableResponse = response.then().log().all();
        validatableResponse.assertThat().statusCode(200);
        //Validate respons= e
    }
}
