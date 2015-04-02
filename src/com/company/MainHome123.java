package com.company;

/**
 * Created by Ann on 27.03.2015.
 */
public class MainHome123 {
    public static void main(String[] args){
// Зеленым цветом выделен вывод в консоль в результате выполнения кода.
        int n = 10;
        System.out.println(n);
// 10
        int m = 20;
        System.out.println(n + m);
// 30
        String v = "Hello class";
        System.out.println(v);
// Hello class
        String w = "15";
        System.out.println(w);
// 15
        System.out.println(v + w);
// Hello class15
        if (n < m) {
            System.out.println("n less then m");
        }
// n less then m
        if (n > m) {
            System.out.println("n more then m");
        } else if (n == m) {
            System.out.println("n equals m");
        } else {
            System.out.println("conditions not met");
        }
// conditions not met

        /*Задача понять что появится в консоли после каждого блока действий. Что не понятно, спрашиваем в скайпе.
        Для того что бы увидеть правильный ответ — необходимо выделить мышью пространство после //*/

        int a = 20;
        int b = a + 5;
        String s = "Test String";
        System.out.println(a);
// 20
        System.out.println(a + b);
// 45
        System.out.println(s + a);
// Test String20
        System.out.println(a + s);
// 20Test String
        System.out.println(a == b);
// false
        System.out.println(a < b);
// true
        System.out.println(true && false); // && means AND
// false
        System.out.println(a == 20.0);
// true
        System.out.println(true || false); // || means OR
// true
        if ("20" != s) { System.out.println("a not eqal s"); }
// a not eqal s
        if (s == "20") { System.out.println("equals"); } else { System.out.println("not equals"); }
// not equals
        if (a > a) {
            System.out.println("a greater a");
        } else if (a < a) {
            System.out.println("a less a");
        } else {
            System.out.println("other");
        }
// other
        if (false) { System.out.println("hi there"); }
//
        while (a > 0) {
            System.out.println("Recycle " + b);
            a = a - 10; } // Recycle 25 // Recycle 25
    }
}