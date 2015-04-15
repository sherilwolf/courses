package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Ann on 13.04.2015.
 */
public class MainHome7 {
    public static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:/Autom/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://angel.net/~nic/passwd.current.html");
        master("12345678");
        site("gmail.com");
        generate();
        System.out.println(password());
// W3Hdka0clbEI+@1a
        master("12345678");
        site("gmail.com");
        generate();
        System.out.println(password());
// W3Hdka0clbEI+@1a
        System.out.println(master());
// 12345678
        System.out.println(site());
// gmail.com
        System.out.println(title());
// Password generator
        System.out.println(button());
// Generate
        site("");
        generate();
        System.out.println(password());
// 9Ixm2r5Xnm41Q@1a
        driver.quit();

    }
    public static void master(String s){
        driver.findElement(By.name("master")).clear();
        driver.findElement(By.name("master")).sendKeys(s);
    }
    public static void site(String s){
        driver.findElement(By.name("site")).clear();
        driver.findElement(By.name("site")).sendKeys(s);
    }
    public static void generate(){
        driver.findElement(By.name("site")).sendKeys(Keys.ENTER);
    }
    public static String password(){
        return driver.findElement(By.name("password")).getAttribute("value");
    }
    public static String master(){
        return driver.findElement(By.name("master")).getAttribute("value");
    }
    public static String site(){
        return driver.findElement(By.name("site")).getAttribute("value");
    }
    public static String title(){
        return driver.getTitle();
    }
    public static String button(){
        return driver.findElements(By.tagName("input")).get(2).getAttribute("value");
    }




}
