package org.dog.com.assertions;

import io.restassured.response.Response;

import java.util.List;

import static org.testng.Assert.*;

public class Assertions {

    public static void assertStatusMessage(Response response, String message) {
        String status = response.body().jsonPath().getString("status");

        assertEquals(status, message);
    }

    public static void assertListAllBreeds(Response response) {
        List<String> messageWhippet = response.body().jsonPath().getList("message.whippet");
        List<String> messageSpaniel = response.body().jsonPath().getList("message.spaniel");

        List<String> spaniel = List.of("blenheim", "brittany", "cocker", "irish", "japanese", "sussex", "welsh");

        assertEquals(messageSpaniel, spaniel);
        assertTrue(messageWhippet.isEmpty());
    }

    public static void assertMessageListIsNotEmpty(Response response) {
        List<String> message = response.body().jsonPath().getList("message");

        assertFalse(message.isEmpty());
    }

    public static void assertResponseIsNotEqual(Response response, Response response2) {
        String message = response.body().jsonPath().getString("message");
        String message2 = response2.body().jsonPath().getString("message");

        assertNotEquals(message, message2);
    }

    public static void assertMessageEquals(Response response, String expectedMessage) {
        String message = response.body().jsonPath().getString("message");

        assertEquals(message, expectedMessage);
    }

    public static void assertCodeEquals(Response response, int expectedCode) {
        int code = response.body().jsonPath().getInt("code");

        assertEquals(code, expectedCode);
    }

}
