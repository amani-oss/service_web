package com.calculator;

import jakarta.xml.ws.Endpoint;

public class Publisher {
    public static void main(String[] args) {
        String url = "http://localhost:8080/calculator";
        System.out.println("SOAP Server is starting...");
        System.out.println("WSDL URL: " + url + "?wsdl");
        
        // This line actually starts the server
        Endpoint.publish(url, new Calculator());
    }
}