package com.timo.springdockerexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Main {

	private QuoteApiClient quoteApiClient;

    @Autowired
    public Main(Environment env) {
        this.quoteApiClient = new QuoteApiClient(env);
    }

    @GetMapping("/")
    public String getQuote() {
        String jsonResponse = this.quoteApiClient.getJsonResponse();
        Quote quote = Quote.fromJsonString(jsonResponse);
        return quote.getText() + " - " + quote.getAuthor();
    }



    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
