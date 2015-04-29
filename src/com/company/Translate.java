package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;


/**
 * Created by Admin on 29.04.15.
 */
public class Translate {
    public static void open(){
        TestHelper.driver.get("https://translate.google.com/");
    }
    public static void buttonTranslate(){
        TestHelper.driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
    public  static String rightField(){
        WebElement rigthField = TestHelper.driver.findElement(By.xpath("//span[@id='result_box']"));
        String s = rigthField.getText();
        return s;
    }
    public static void checkElements(){
        TestHelper.driver.findElement(By.xpath("//input[@type='submit']"));
        TestHelper.driver.findElement(By.xpath("//span[@id='result_box']"));
        TestHelper.driver.findElement(By.xpath("//textarea[@id='source']"));
    }
    public static void checkRigthField(){
        TestHelper.driver.findElement(By.xpath("//span[@id='result_box']"));
    }
    public static void checkLanguage(){
        TestHelper.driver.findElement(By.xpath("//div[@id='gt-sl-gms']")).click();
        TestHelper.driver.findElement(By.xpath("//div[text()='греческий']"));
        TestHelper.driver.findElement(By.xpath("//div[text()='мальтийский']"));
        TestHelper.driver.findElement(By.xpath("//div[text()='словацкий']"));

    }

}
