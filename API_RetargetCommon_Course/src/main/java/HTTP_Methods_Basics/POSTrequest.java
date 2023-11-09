package HTTP_Methods_Basics;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class POSTrequest {

    public static void main(String[] args) {
        //Build Request
        RestAssured.baseURI = "https://restful-booker.herokuapp.com/";
        RestAssured.basePath = "booking";
        RequestSpecification requestSpecification=RestAssured.given();
        requestSpecification.log().all();
        requestSpecification.body("{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"Breakfast\"\n" +
                "}");
        requestSpecification.contentType(ContentType.JSON);
        //Hit Request and Get Response
        Response response = requestSpecification.post();
        ValidatableResponse validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);
        //Validate Request
    }
}
