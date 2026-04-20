package org.dog.com.acceptance;

import io.restassured.response.Response;
import org.dog.com.config.BaseTest;
import org.dog.com.dataProvider.DogApiDataProvider;
import org.testng.annotations.Test;

import static org.apache.http.HttpStatus.*;
import static org.dog.com.assertions.Assertions.*;
import static org.dog.com.enums.MessageEnum.*;

public class AcceptanceTest extends BaseTest {

    @Test
    public void listAllBreedsTest() {
        Response response = dogApiService.listAllBreeds();

        assertListAllBreeds(response);
        assertStatusMessage(response, "success");
    }

    @Test(dataProvider = "breedImages", dataProviderClass = DogApiDataProvider.class)
    public void listBreedImagesTest(String breed) {
        Response response = dogApiService.listBreedImages(breed, SC_OK);

        assertMessageListIsNotEmpty(response);
        assertStatusMessage(response, "success");
    }

    @Test
    public void getBreedsImageRandomTest() {
        Response response = dogApiService.getBreedsImageRandom();
        Response response2 = dogApiService.getBreedsImageRandom();

        assertResponseIsNotEqual(response, response2);
        assertStatusMessage(response, "success");
    }

    @Test(dataProvider = "nonExistentBreedImages", dataProviderClass = DogApiDataProvider.class)
    public void listBreedImagesNotFoundTest(String breed) {
        Response response = dogApiService.listBreedImages(breed, SC_NOT_FOUND);

        assertMessageEquals(response, BREED_NOT_FOUND.getMsg());
        assertStatusMessage(response, "error");
        assertCodeEquals(response, SC_NOT_FOUND);
    }
}
