package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

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
        System.out.println(h.getTitle());
        WebElement s = h.findElement(By.name("q"));
        s.sendKeys("qa factory");
        s.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        WebElement rso = h.findElement(By.id("rso"));
        WebElement f = rso.findElement(By.tagName("a"));
        System.out.println(f.getText());
        List<WebElement> as = rso.findElements(By.tagName("a"));
        for (int y = 0; y < as.size(); y++){
            WebElement cur = as.get(y);
            System.out.println(cur.getText());
            System.out.println(as.get(y).getAttribute("href"));
        }
        s.clear();
        s.sendKeys("angel sha1");
        h.findElement(By.name("btnG")).click();

        //h.quit();

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
