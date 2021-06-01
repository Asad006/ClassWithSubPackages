package org.example.utililies;

import java.util.Scanner;

public class Mathhelper {

    public  static double divisionVal(String s1, String s2) {
        double d1, d2;
        d1 = Double.parseDouble(s1);
        d2 = Double.parseDouble(s2);
        return d1 / d2;
        // no
    }

    public static double subtractionVal(String s1, String s2) {
        double d1, d2;
        d1 = Double.parseDouble(s1);
        d2 = Double.parseDouble(s2);
        return d1 - d2;
    }

    public static double productVal(String s1, String s2) {
        double d1, d2;
        d1 = Double.parseDouble(s1);
        d2 = Double.parseDouble(s2);
        return d1 * d2;
    }

    public static double addVal(String s1, String s2) {
        double d1, d2;
        d1 = Double.parseDouble(s1);
        d2 = Double.parseDouble(s2);
        return d1 + d2;
    }

    public static String getInput(String s) {
        String input;
        System.out.println(s);
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        return input;
    }
}
