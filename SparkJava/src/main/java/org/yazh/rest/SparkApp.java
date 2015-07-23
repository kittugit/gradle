package org.yazh.rest;
import static spark.Spark.*;
import com.google.gson.Gson;

public class SparkApp {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
		
		Gson gson = new Gson();
		post("/hello", "application/json", (req, res) -> {
				Name name = gson.fromJson(req.body(), Name.class);
				name.toUpperCase();
				res.type("application/json");
				return name;
			}, gson::toJson); 
    }
}

