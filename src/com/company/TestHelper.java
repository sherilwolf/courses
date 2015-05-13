package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Created by Admin on 22.04.15.
 */
public class TestHelper {
    public static WebDriver driver;
    public static void init(){
        /*System.setProperty("webdriver.chrome.driver",
                "C:/Autom/chromedriver_win32/chromedriver.exe");*/
        System.setProperty("webdriver.chrome.driver",
                "/usr/local/bin/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=ru");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }
}
