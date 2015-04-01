package com.company;

/**
 * Created by Ann on 01.04.2015.
 */
public class ProDoor {
    public int height;
    public int width;
    public boolean isOpened;
    public boolean isLocked;
    public boolean isClosed;

    public ProDoor (int h, int w, boolean isOpened, boolean isLocked){
        height = h;
        width = w;
        isOpened = true;
        isLocked = false;
    }

    public String toString(){
        System.out.println("Size:"+ height + "x" + width);
        System.out.println("Opened: "+ isOpened);
        System.out.println("Locked: "+ isLocked);
        return toString();
    }


    public void lock(){

    }

    public void close(){
        System.out.println("Lock is in the way. Cannot close!");
    }

    public void unlock(){

    }

    public void open(){
        System.out.println("Door is locked. Cannot open!");
    }
}
