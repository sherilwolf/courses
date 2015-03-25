package com.company;

/**
 * Created by Admin on 25.03.15.
 */
public class Main2 {
    public static void main(String[] args) {
        //System.out.println(args[0]);
             if (args[0].equals("Hello"))
            System.out.println("Class");
            else
            System.out.println("Good bye");

        if(args[0].equals("Hello") && args[1].equals("Class"))
            System.out.println("Success");
        else
            System.out.println("Good bye");


    }
}
