package com.company;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Ann on 07.04.2015.
 */
public class MainHome51 {
    public static void main(String[] args) {
        List<String> s = new ArrayList<String>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        print(s);
        //a
        //b
        //c
        //d
        List<String> f = new ArrayList<String>();
        f.add("a");
        f.add("b");
        f.add("c");
        f.add("d");
        System.out.println(isListsEqual(s, f));
        //true
        f.add("d");
        System.out.println(isListsEqual(s, f));
        //false
        s.add("b");
        System.out.println(isListsEqual(s, f));
        //false
        List<String> s1 = new ArrayList<String>();
        List<String> s2 = new ArrayList<String>();
        System.out.println(isListsEqual(s1, s2));
        //true
        String[] a = {"a", "b", "c", "d", "b"};
        print(a);
        //abcdb
        System.out.println(isEqual(a, s));
        //true
    }

    public static void print(List<String> l) {
        // Тут дописать тело функции.
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }

    public static boolean isListsEqual(List<String> first, List<String> second) {
        if (first.equals(second)) {
            return true;
        } else {
            return false;
        }
    }

    public static void print(String[] a) {
        // Тут дописать тело функции.
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static boolean isEqual(String[] a, List<String> s) {
        if (Arrays.asList(a).equals(s)) {
            return true;
        } else {
            return false;
        }
    }
}
