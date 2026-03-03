package com.tnsdemo;
public class OperatorsExample {
    public static void main(String[] args) {

       int a = 2403;
        int b = 2311;
       System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("(a > 5 && b < 10): " + (a > 5 && b < 10));
        System.out.println("(a > 5 || b > 10): " + (a > 5 || b > 10));
    }
}