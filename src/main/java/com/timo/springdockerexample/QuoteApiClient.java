package com.timo.springdockerexample;


import org.springframework.web.client.RestTemplate;
import org.springframework.core.env.Environment;

public class QuoteApiClient {
    private RestTemplate restTemplate;
    private String apiUrl;

    public QuoteApiClient(Environment env) {
        this.restTemplate = new RestTemplate();
        this.apiUrl = "https://api.quotable.io/random";         // env.getProperty("quoteapi.endpointurl");
    }

    public String getJsonResponse() {
        return restTemplate.getForObject(apiUrl, String.class);
    }
}
