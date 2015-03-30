package com.company;

import org.apache.xpath.SourceTree;

/**
 * Created by Admin on 30.03.15.
 */
//make class
public class Door {
    public int height;
    public boolean isOpened;
    public Door(int h){
        height = h;
        isOpened = false;
    }
    public void close(){
        isOpened = false;
        System.out.println("Closing door");
    }
    public void print(){
        System.out.println("Door height is " + height);
        if (isOpened) {
            System.out.println("K is opened");
        }else {
            System.out.println("K is closed");
        }
    }
}
