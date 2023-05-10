package com.timo.springdockerexample;

import java.io.Console;

public class QuoteTest {
    public static void main(String[] args) {
        String text = "As we are liberated from our own fear, our presence automatically liberates others.";
        String author = "Nelson Mandela";
        String jsonQuote = "{\"_id\":\"unSKTwMmbsJ5\",\"content\":\"" + text + "\",\"author\":\""+ author +"\",\"tags\":[\"Famous Quotes\"],\"authorSlug\":\"nelson-mandela\",\"length\":83,\"dateAdded\":\"2021-04-08\",\"dateModified\":\"2023-04-14\"}";
        Quote quote = Quote.fromJsonString(jsonQuote);
        System.out.println("quote: " + quote.getText() + " - " + quote.getAuthor());
        if (quote.getText().equals(text) && quote.getAuthor().equals(author)) {
            System.out.println("Quote Class passed test");
        } else {
            System.out.println("Quote Class failed test");
        }
    }
}
