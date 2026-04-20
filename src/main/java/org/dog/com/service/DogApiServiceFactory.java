package org.dog.com.service;

import org.dog.com.requestSpecification.DogApiRequestSpecification;

public class DogApiServiceFactory {

    public static DogApiService buildService() {
        return new DogApiService(DogApiRequestSpecification.getRequestSpec());
    }
}
