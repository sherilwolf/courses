package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by Admin on 18.05.15.
 */
public class UGUWebDriver {
    public static WebDriver driver;
    public static void init(){
        System.setProperty("webdriver.chrome.driver",
                "C:/Autom/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
}
