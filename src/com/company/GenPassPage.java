package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Admin on 22.04.15.
 */
public class GenPassPage {
    public static void open(){
        TestHelper.driver.get("httYp://oxogamestudio.com/passwd.current8.htm");
    }
    public static void setField(String fieldName, String fieldValue){
        WebElement field = TestHelper.driver.findElement(By.xpath("//td[text()='" + fieldName + "']/following::input"));
        field.clear();
        field.sendKeys(fieldValue);
    }
    public static String getField(String fieldName){
        String field = TestHelper.driver.findElement(By.xpath("//td[text()='" + fieldName + "']/following::input")).getAttribute("value");
        return field;
    }
    public static void generate(){
        TestHelper.driver.findElement(By.xpath("//td[text()='Site name']/following::input")).sendKeys(Keys.ENTER);
    }
    public static String button(){
        return TestHelper.driver.findElement(By.xpath("//input[@type='submit']")).getAttribute("value");
    }
    public static void waitPassword() throws InterruptedException {
        while (TestHelper.driver.findElement(By.xpath("//td[text()='Generated password']/following::input")).getAttribute("value").equals("")){
            Thread.sleep(200);
        }
    }
    public static void waitButton() throws InterruptedException {
        while (TestHelper.driver.findElements(By.xpath("//input[@type='submit']")).size() <= 0){
            Thread.sleep(200);
        }
    }
}
