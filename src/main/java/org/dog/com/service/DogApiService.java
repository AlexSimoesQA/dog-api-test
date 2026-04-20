package org.dog.com.service;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static org.dog.com.utils.ConstantPath.*;
import static org.apache.http.HttpStatus.SC_OK;

public class DogApiService {

    private final RequestSpecification requestSpecification;

    public DogApiService(RequestSpecification requestSpecification) {
        this.requestSpecification = requestSpecification;
    }

    public Response listAllBreeds() {
        return
                given()
                        .spec(requestSpecification)
                        .when()
                        .get(BREEDS_LIST_ALL_PATH)
                        .then()
                        .statusCode(SC_OK)
                        .extract()
                        .response();
    }

    public Response listBreedImages(String breed) {
        return
                given()
                        .spec(requestSpecification)
                        .when()
                        .get(BREED_PATH + "/" + breed + IMAGES_PATH)
                        .then()
                        .statusCode(SC_OK)
                        .extract()
                        .response();
    }
}
