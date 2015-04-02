package com.company;

/**
 * Created by Ann on 31.03.2015.
 */
public class MainHome4 {
    public static void main(String[] args) {
        String t = "Hello Class";
        System.out.println(t);
// Hello Class

        String ts = ", and Studend!";
        System.out.println(t + ts);
// Hello Class, and Student!

        String[] u = {"0", "1", "Under key one but three", "3", "4", "Under key five"};
        System.out.println(u[5]);
// Under key five
        System.out.println(u[3-1]);
// Under key one but three

        for (int x = 8; x < 11; x++) {
            System.out.println(x);
        }
// 8
// 9
// 10

        String[] s = {"How", "are", "you"};
        for (int i = 0; i < 3; i++) {
            System.out.println(s[i]);
        }
// How
// are
// you

        int[] m = {10, 20, 25, 30};
        int b = 25;
        int i = 0;
        while (i < 4) {
            if (m[i] == b) {
                break;
            }
            System.out.println(m[i]);
            i++;
        }
// 10
// 20

        int[] n = {10, 20, 25, 30};
        int d = 10;
        int j = 0;
        while (j < 4) {
            if (n[j] == d) {
                j++;
                continue;
            }
            System.out.println(n[j]);
            j++;
        }
// 20
// 25
// 30

        TestClass c = new TestClass();
        c.say();
// Hello World
        c.update();
// Goodbye World

        ProDoor door = new ProDoor(2000, 900, true, false);
        String doorInfo = door.toString();
        System.out.println("Door info:\n" + doorInfo);
// Door info:
// Size: 2000x900 mm
// Opened: yes
// Locked: no
        ProDoor door2 = new ProDoor(1900, 800, false, true);
        System.out.println("Door info:\n" + door2.toString());
// Door info:
// Size: 1900x800 mm
// Opened: no
// Locked: yes
        door.lock();
        System.out.println(door.isLocked());
// true

        door.close();
// Lock is in the way. Cannot close!
        System.out.println(door.isClosed());
// false
        System.out.println("Door info:\n" + door.toString());
// Door info:
// Size: 2000x900 mm
// Opened: yes
// Locked: yes
        door.unlock();
        System.out.println(door.isLocked());
// false
        door.close();
        System.out.println(door.isClosed());
// true

        door2.open();
// Door is locked. Cannot open!
        door2.unlock();
        door2.open();
        System.out.println("Door info:\n" + door2.toString());
// Door info:
// Size: 1900x800 mm
// Opened: yes
// Locked: no
    }
}
