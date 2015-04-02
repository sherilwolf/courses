package com.company;

/**
 * Created by Ann on 01.04.2015.
 */
public class ProDoor {
    public int height;
    public int width;
    public boolean isOpened;
    public boolean isLocked;

    public ProDoor(int h, int w, boolean o, boolean l) {
        height = h;
        width = w;
        isOpened = o;
        isLocked = l;
    }

    public String toString() {
        String opened;
        String locked;
        if (isOpened == true) {
            opened = "yes";
        } else {
            opened = "no";
        }
        if (isLocked == true) {
            locked = "yes";
        } else {
            locked = "no";
        }
        String doorInfo = "Size: " + height + "x" + width + " mm" + "\nOpened: " + opened + "\nLocked: " + locked;
        return doorInfo;
    }

    public boolean isClosed() {
        return !isOpened;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void lock(){
        isLocked = true;
    }

    public void close(){
        if (isLocked){
            System.out.println("Lock is in the way. Cannot close!");
            //isOpened = true;
        } else {
            isOpened = false;
        }
}

    public void unlock(){
        isLocked = false;
    }

    public void open(){
        if (isLocked){
            System.out.println("Door is locked. Cannot open!");
            //isOpened = false;
        } else {
            isOpened = true;
        }
    }
}
