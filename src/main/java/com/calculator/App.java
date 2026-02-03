package com.calculator;

// These now match the files in your 'client' folder
import com.calculator.client.CalculatorService; 
import com.calculator.client.Calculator;

public class App {
    public static void main(String[] args) {
        // 1. Connect using the correct Service name from your sidebar
        CalculatorService service = new CalculatorService();
        Calculator proxy = service.getCalculatorPort();

        // 2. Call your methods
        System.out.println("Calling SOAP Server...");
        int sum = proxy.add(10, 20);
        
        System.out.println("The Server says 10 + 20 = " + sum);
    }
}