package org.dog.com.acceptance;

import io.restassured.response.Response;
import org.dog.com.config.BaseTest;
import org.dog.com.dataProvider.DogApiDataProvider;
import org.testng.annotations.Test;

import static org.dog.com.assertions.Assertions.*;

public class AcceptanceTest extends BaseTest {

    @Test
    public void listAllBreedsTest() {
        Response response = dogApiService.listAllBreeds();

        assertListAllBreeds(response);
        assertStatusMessage(response, "success");
    }

    @Test(dataProvider = "breedImages", dataProviderClass = DogApiDataProvider.class)
    public void listBreedImagesTest(String breed) {
        Response response = dogApiService.listBreedImages(breed);

        assertBreedImages(response);
        assertStatusMessage(response, "success");
    }
}
