package com.company;

public class Main {

    public static void main(String[] args) {

        int a = 256 + 3180;
	    System.out.println("256 + 3180 = " + a);

        double e = 180.0/31.0;
        System.out.println("180/31 = " + e);

        int[] h1 = {10,0,0,21,-5,38};
        int e1 = h1[0];
        int e2 = h1[1];
        int e3 = h1[2];
        int e4 = h1[3];
        int e5 = h1[4];
        int e6 = h1[5];
        System.out.println("" + e1 + " " + e2 + " " + e3 + " " + e4 + " " + e5 + " " + e6);

        String[] n = {"a", "b", "c"};
        String[] m = {"a", "d", "c"};
        System.out.println(n[0] + " - " + m[0] + ", " + n[1] + " - " + m[1] + ", " + n[2] + " - " + m[2]);
    }
}

