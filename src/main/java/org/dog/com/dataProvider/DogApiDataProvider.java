package org.dog.com.dataProvider;

import org.testng.annotations.DataProvider;

public class DogApiDataProvider {

    @DataProvider()
    public Object[][] breedImages() {
        return new Object[][] {
                {"hound"},
                {"german"}
        };
    }

}
