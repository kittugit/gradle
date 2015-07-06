package org.yazh.rest;
import static spark.Spark.*;

public class SparkApp {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World");
    }
}

