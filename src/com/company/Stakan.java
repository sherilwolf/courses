package com.company;

/**
 * Created by Ann on 02.04.2015.
 */
public class Stakan {
    public String imia;
    public static String material;
    public static int vysota;
    public int procentZapolneniia;

    public Stakan(String i){
        imia = i;
        material = "Bumaga";
        vysota = 10;
    }
    public int procentZapolneniia(){
        return procentZapolneniia;
    }
    public void nalit(int nalit){
        procentZapolneniia = procentZapolneniia + nalit;
        if (procentZapolneniia > 100){
            procentZapolneniia = 100;
            System.out.println("Super perepolnen. Lishnee vylilos.");
        }
    }
    public int vylit(){
        int t = procentZapolneniia;
        procentZapolneniia = 0;
        return t;
    }
    public String imia(){
        return imia;
    }
    public static int obiom(int vysota){

        int obiom = vysota * 20;
        return obiom;
    }
}
