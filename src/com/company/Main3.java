package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Ann on 27.03.2015.
 */
public class Main3 {
    public static void main(String[] args) throws InterruptedException {
        /*int i = 0;
        while (i < 5){
            i = i +1;
            System.out.println(i);
        }
        for (int j = 0; j < 5; j = j +1){
            System.out.println(j);
        }
        System.out.println();*/

        //open chrome
        System.setProperty("webdriver.chrome.driver",
                "C:/Autom/chromedriver_win32/chromedriver.exe");
        WebDriver h = new ChromeDriver();
        h.manage().window().maximize();
        h.get("http://google.com");
        //Thread.sleep(5000); pause
        h.quit();

    }
}
