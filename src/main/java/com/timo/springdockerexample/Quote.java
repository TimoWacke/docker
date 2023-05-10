package com.timo.springdockerexample;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Quote {

	private String text;
	private String author;

    public Quote(String text, String author) {
		this.text = text;
		this.author = author;
	}

	public String getText() {
		return text;
	}

	public String getAuthor() {
		return author;
	}

    public static Quote fromJsonString(String jsonstr) {
		System.out.println("json: " + jsonstr);
		Gson mygson = new Gson();
		JsonObject myjsonObject = mygson.fromJson(jsonstr, JsonObject.class);
		String txt = myjsonObject.get("content").getAsString();
		String author = myjsonObject.get("author").getAsString();
		return new Quote(txt, author);
	}
}
