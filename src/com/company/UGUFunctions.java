package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Admin on 18.05.15.
 */
public class UGUFunctions {

    public static boolean WaitForElement (int WaitTime, String WFEString) {
        // WaitTime - in seconds
        // WFEString - xPath of element
        boolean TmpBoolean = false;
        for (int timerz= 0; timerz < WaitTime*1000; ) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException a) {
                a.printStackTrace();
            }
            try {
                if (UGUWebDriver.driver.findElement(By.xpath(WFEString)).isDisplayed()) {
                    TmpBoolean = true;
                    break;
                }
            } catch (Exception e) {}
            timerz = timerz + 100;
        }
        return TmpBoolean;
    }



    public static void open(){
        UGUWebDriver.driver.get("http://booking.uz.gov.ua/");
    }

    public static void from(String text) throws InterruptedException {
        WebElement stationFrom = UGUWebDriver.driver.findElement(By.xpath("//div[@id='station_from']/input"));
        stationFrom.sendKeys(text);

        if (WaitForElement (5, "//div[@class='autosuggest']/div[@title= '" + text + "']")) {

        };
        /*
        while (UGUWebDriver.driver.findElements(By.xpath("/div[@class='autosuggest']/div[@title= '" + text + "']")).size() == 0){
            Thread.sleep(1000);
        }
        */
        WebElement dropDown = UGUWebDriver.driver.findElement(By.xpath("//div[@class='autosuggest']/div[@title= '" + text + "']"));
        dropDown.click();
    }
    public static void to(){

    }
    public static void date(){

    }
    public static void search(){

    }
    public static void resultsCount(){

    }
}
