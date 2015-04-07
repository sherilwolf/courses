package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Ann on 02.04.2015.
 */
public class Main6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:/Autom/chromedriver_win32/chromedriver.exe");
        WebDriver h = new ChromeDriver();
        h.manage().window().maximize();
        h.get("http://angel.net/~nic/passwd.current.html");
        /*h.findElement(By.name("master")).sendKeys("12345678");
        h.findElement(By.name("site")).sendKeys("google.com");
        h.findElement(By.name("site")).sendKeys(Keys.ENTER);
        System.out.println(h.findElement(By.name("password")).getAttribute("value"));*/

       /*if(getWebDriver(h, "123456", "gmail.com").equals(getWebDriver(h, "123456", "gmail.com"))){
           System.out.println("Passed");
       }else{
           System.out.println("Failed");
       }

       if(getWebDriver(h, "12345678", "google.com").equals(getWebDriver(h, "12345678", "google.com"))){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }*/

        //System.out.println(getWebDriver(h, "123456", "gmail.com"));
        //System.out.println(getWebDriver(h, "12345678", "google.com"));

        compare(getWebDriver(h, "123456", "gmail.com"),getWebDriver(h, "123456", "gmail.com"));
        compare(getWebDriver(h, "12345678", "google.com"), getWebDriver(h, "12345678", "google.com"));

    }


    public static void compare(String o, String  p){
        if (o.equals(p)){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    public static String getWebDriver(WebDriver j, String i, String t){
        j.findElement(By.name("master")).sendKeys(i);
        j.findElement(By.name("site")).sendKeys(t);
        j.findElement(By.name("site")).sendKeys(Keys.ENTER);
        j.findElement(By.name("master")).clear();
        j.findElement(By.name("site")).clear();

        return j.findElement(By.name("password")).getAttribute("value");

    }
}
