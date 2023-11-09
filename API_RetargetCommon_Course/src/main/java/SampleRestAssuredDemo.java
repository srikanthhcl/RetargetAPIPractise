import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SampleRestAssuredDemo {
    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in";
        //        .baseURI = "https://reqres.in";
        RequestSpecification requestSpecification = RestAssured.given();
//        requestSpecification.log().all();
        requestSpecification.basePath("/api/users?page=2");
        Response response = requestSpecification.get("/api/users?page=2");
        System.out.println(response.getBody().asPrettyString());
        System.out.println("Rest Assured !!");






    }
}
