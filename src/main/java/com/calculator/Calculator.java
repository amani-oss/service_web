package com.calculator;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

@WebService(serviceName = "calculator")
public class Calculator {

    @WebMethod
    public int add(@WebParam(name = "num1") int a, @WebParam(name = "num2") int b) {
        return a + b;
    }

    @WebMethod
    public int multiply(@WebParam(name = "num1") int a, @WebParam(name = "num2") int b) {
        return a * b;
    }

    @WebMethod
    public double power(@WebParam(name = "base") double base, @WebParam(name = "exponent") double exp) {
        return Math.pow(base, exp);
    }

    @WebMethod
    public int divide(@WebParam(name = "dividend") int a, @WebParam(name = "divisor") int b) throws Exception {
        if (b == 0) {
            // This will be converted into a "SOAP Fault" automatically
            throw new ArithmeticException("Cannot divide by zero!");
        }
        return a / b;
    }
}