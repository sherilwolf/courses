package com.company;

/**
 * Created by Ann on 07.04.2015.
 */
public class MainHome6 {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        String s = "Hello";
        String m = multiply(s, 5);
        System.out.println(m);
        // HelloHelloHelloHelloHello
        System.out.println(multiply(s, b));
        // HelloHelloHello
        System.out.println(multiplyNewLine("NewLine", a));
        // NewLine
        // NewLine
        // NewLine
        // NewLine
        // NewLine
        // NewLine
        // NewLine
        System.out.println(multiplyNewLine("Hey, this one on new line", 3));
        // Hey, this one on new line
        // Hey, this one on new line
        // Hey, this one on new line
        doubleAndPrint("TwoTimes");
        // TwoTimesTwoTimes
        doubleAndPrint("StillTwoTimes");
        // StillTwoTimesStillTwoTimes
        System.out.println(multiply(3, "switch"));
        // switchswitchswitch
        System.out.println(multiply(1, "switchAgain"));
        // switchAgain
    }
    public static String multiply(String s, int j){
        String r = "";
        for (int i = 0; i < j; i++){
            r = r + s;
        }
        return r;
    }
    public static String multiplyNewLine(String s, int j){
        String r = "";
        for (int i = 0; i < j; i++){
            r = r + s + "\n";
        }
        return r;
    }
    public static String doubleAndPrint(String s){
        System.out.println(s + s);
        return s;
    }
    public static String multiply(int j, String s) {
        String r = "";
        for (int i = 0; i < j; i++) {
            r = r + s;
        }
        return r;
    }
}