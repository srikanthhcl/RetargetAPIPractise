package HTTP_Methods_Basics;

import io.restassured.RestAssured;

public class RefactoringGetRequest {
    public static void main(String[] args) {
        RestAssured
                .given()
                    .log()
                    .all()
                    .baseUri("https://restful-booker.herokuapp.com/")
                    .basePath("booking/{id}")
                    .pathParam("id",1)
                .when()
                    .get()
                .then()
                    .log()
                    .all()
                    .statusCode(200);
    }
}
