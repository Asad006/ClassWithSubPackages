package org.example;

import java.util.Scanner;

import static org.example.utililies.Mathhelper.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        double result = 0;
        String s1 = getInput("Enter a numeric value: ");
        String s2 = getInput("Enter a numeric value: ");
        String op = getInput("Choose an operation (+ - * /):");

        try {
            switch (op) {
                case "+":
                    result = addVal(s1, s2);
                    break;
                case "-":
                    result = productVal(s1,s2);
                    break;
                case "*":
                    result = subtractionVal(s1,s2);
                    break;
                case "/":
                    result = divisionVal(s1,s2);
                    break;
                default:
                    System.out.println("Unrecognized operation");
            }

        } catch (Exception e) {
            System.out.println("invalid Numerical value: " + e.getMessage());
        }
        System.out.println(" Result:"+ result);
    }




}
