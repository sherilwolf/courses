package com.company;

/**
 * Created by Admin on 25.03.15.
 */
public class Main2 {
    public static void main(String[] args) {
             if (args[0].equals("Hello"))
            System.out.println("Class");
            else
            System.out.println("Good bye");

        if(args[0].equals("Hello") && args[1].equals("Class"))
            System.out.println("Success");
        else
            System.out.println("Good bye");

        int a = 10;
        while(a <15){
            System.out.println("a is:" + a);
            a = a + 1;
        }
        System.out.println("while is over");

        while(true){
            if(a>15){
                break;
            }
            a=a+1;
            System.out.println("a is:" + a);
        }
    }
}
