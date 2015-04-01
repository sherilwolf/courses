package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Ann on 27.03.2015.
 */
public class Main3 {
    public static void main(String[] args) throws InterruptedException {
        //while & for
        int i = 0;
        while (i < 5){
            i = i +1;
            System.out.println(i);
        }
        for (int j = 0; j < 5; j = j +1){
            System.out.println(j);
        }

        //open chrome
        System.setProperty("webdriver.chrome.driver",
                "C:/Autom/chromedriver_win32/chromedriver.exe");
        WebDriver h = new ChromeDriver();
        h.manage().window().maximize();
        h.get("http://google.com");
        //Thread.sleep(5000); pause
        h.quit();

        //make class
        Door K = new Door(100);
        Door L = new Door(190);
        System.out.println("K heigth is " + K.height);
        if (K.isOpened){
            System.out.println("K is opened");
        } else {
            System.out.println("K is closed");
        }
        K.height = 500;
        System.out.println("K height is " + K.height);
        K.close();
        if (K.isOpened) {
            System.out.println("K is opened");
        }else {
            System.out.println("K is closed");
        }
        int d = K.height;
        d = L.height;
        K.isOpened = true;
        K.print();

    }
}
