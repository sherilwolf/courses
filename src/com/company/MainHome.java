package com.company;

/**
 * Created by Ann on 27.03.2015.
 */
public class MainHome {
    public static void main(String[] args){
        /*boolean pereryv = true;
        boolean luchshe = false;
        if (!luchshe && pereryv) {
            System.out.println("Перерьіву не бьіть.");
        } if (!(luchshe && pereryv)) {
            System.out.println("Перерьіву бьіть.");
        }*/
    }
    /*public static int min(int a, int b, int c, int d)
    {
        int m2;
        m2=min(a, b);
        if (m2<=c & m2<=d) return m2;
        if (c<=m2 & c<=d) return c;
        if (d<=c & d<=m2) return d;
        return m2;
        //Напишите тут ваш код
    }
    public static int min(int a, int b)
    {
        int m1;
        if (a<b) m1=a;
        else m1=b;
        return m1;
        //Напишите тут ваш код
    }*/
    public static int min(int a, int b, int c, int d) {
        int m;
        m = min(a,b);
        int f;
        f = min(c,d);
        int r;
        if (m<f) r = m;
        else r = f;
        return r;
    }
    public static int min(int a, int b)
    {
        int r2;
        if (a<b) r2=a;
        else r2=b;
        return r2;
    }
}

