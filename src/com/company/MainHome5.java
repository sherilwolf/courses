package com.company;

/**
 * Created by Ann on 02.04.2015.
 */
public class MainHome5 {
    public static void main(String[] args) {
        Stakan s = new Stakan("Super");
        Stakan k = new Stakan("Bigger");
        System.out.println("s: " + s.imia);
        System.out.println("k: " + k.imia);
        System.out.println("Stakan: " + Stakan.material);
        System.out.println("Stakan: " + Stakan.vysota);
        System.out.println("s: " + s.procentZapolneniia());
// s: Super
// k: Bigger
// Stakan: Bumaga
// Stakan: 10
// s: 0
        s.nalit(30);
        System.out.println("s: " + s.procentZapolneniia());
// s: 30
        int v = s.vylit();
        System.out.println("v: " + v);
        System.out.println("k: " + k.procentZapolneniia());
// v: 30
// k: 0
        k.nalit(v);
        System.out.println("k: " + k.procentZapolneniia());
// k: 30
        s.nalit(k.vylit());
        System.out.println("s: " + s.procentZapolneniia());
        System.out.println("k: " + k.procentZapolneniia());
// s: 30
// k: 0
        s.nalit(50);
        System.out.println("s: " + s.procentZapolneniia());
// s: 80
        s.nalit(45);
// Super perepolnen. Lishnee vylilos.
        System.out.println("s: " + s.procentZapolneniia());
// s: 100
        s.imia = "ReSuper";
        System.out.println("s: " + s.imia());
        System.out.println("k: " + k.imia());
// s: ReSuper
// k: Bigger
        System.out.println("Obiom Stakana vysotoy 20: " + Stakan.obiom(20));
        // Obiom Stakana vysotoy 20: 400

    }
}
