package org.dog.com.config;

import io.restassured.RestAssured;
import org.dog.com.service.DogApiService;
import org.dog.com.service.DogApiServiceFactory;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    protected static DogApiService dogApiService;

    @BeforeSuite
    public static void setUp() {
        dogApiService = DogApiServiceFactory.buildService();

        RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
    }
}
