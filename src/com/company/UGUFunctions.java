package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by Admin on 18.05.15.
 */
public class UGUFunctions {
    public static void open(){
        UGUWebDriver.driver.get("http://booking.uz.gov.ua/");
    }

    public static void from(String text){
        WebElement stationFrom = UGUWebDriver.driver.findElement(By.xpath("//input[@name='station_from']"));
        stationFrom.sendKeys(text);
        try {
            new WebDriverWait(UGUWebDriver.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='stations_from']/div[@title='" + text + "']"))).click();
        }
        catch (TimeoutException e){
            System.out.println("No such element from");
        }
    }

    public static void to(String text){
        WebElement stationTo = UGUWebDriver.driver.findElement(By.xpath("//input[@name='station_till']"));
        stationTo.sendKeys(text);
        try {
            new WebDriverWait(UGUWebDriver.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='stations_till']/div[@title='" + text + "']"))).click();
        }
        catch (TimeoutException e){
            System.out.println("No such element to");
        }
    }

    public static void date(String month, int date){
        UGUWebDriver.driver.findElement(By.xpath("//input[@id='date_dep']")).click();
        UGUWebDriver.driver.findElement(By.xpath("//table/caption[text()='" + month + "']/following::tbody[1]/tr/td[text()='" + date + "']")).click();
    }

    public static void search(){
        UGUWebDriver.driver.findElement(By.xpath("//button[@name='search']")).click();
    }

    public static boolean resultsTrain(String train){
        try{
            new WebDriverWait(UGUWebDriver.driver,10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='" + train + "']")));
        }catch (TimeoutException e){
            System.out.println("No such element train");
            return false;
        }
        return true;
    }

    public static void clickTrain(String train){
        UGUWebDriver.driver.findElement(By.xpath("//a[text()='" + train + "']")).click();
    }

    public static String modalName(){
        try {
            return new WebDriverWait(UGUWebDriver.driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Маршрут поезда']"))).getText();
        }
        catch (TimeoutException e){
            System.out.println("No such element modalName");
            return null;
        }
    }

    public static void modalClose(){
        UGUWebDriver.driver.findElement(By.xpath("//a[@title='закрыть']")).click();
    }

    public static String selectPlaces(String number, String coupe){
        //div[@title='Купе']/button
    }

    }
