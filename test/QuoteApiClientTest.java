package com.timo.springdockerexample;

import org.springframework.core.env.Environment;
import org.springframework.mock.env.MockEnvironment;


public class QuoteApiClientTest {
    public static void main(String[] args) {
        Environment env = new MockEnvironment().withProperty("quoteapi.endpointurl", "https://api.quotable.io/random");
        QuoteApiClient quoteApiClient = new QuoteApiClient(env);

        String json = quoteApiClient.getJsonResponse();

        if (json != null && !json.isEmpty()) {
            System.out.println("Quote Api Client passed test");
        } else {
            System.out.println("Quote Api Client failed test");
        }
    }
}