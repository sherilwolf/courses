package com.company;

/**
 * Created by Ann on 08.04.2015.
 */
public class MainHome61 {
    public static void main(String[] args) {
        if (func1(5).equals("150")) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Expected 150, Actual: " + func1(5));
            System.out.println("Please fix the functions.");
        }

        if (func1(0).equals("0")) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Expected 0, Actual: " + func1(0));
            System.out.println("Please fix the functions.");
        }

        if (func1(100).equals("41000")) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Expected 41000, Actual: " + func1(100));
            System.out.println("Please fix the functions.");
        }
    }

    // Fix the folowing functions so the main tests pass.
    public static String func3(int u, int p) {
        return "" + (u * (p - 1));
    }

    public static String func1(int y) {
        return func2(y * 2);
    }

    public static String func2(int n) {
        return func3(n, n+5);
    }
}
