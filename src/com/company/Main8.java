package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Admin on 15.04.15.
 */
@RunWith(JUnit4.class)
public class Main8 {
    public WebDriver driver;
    @After
    public void clean(){
        driver.quit();
    }
    @Before
    public void befor(){
        System.setProperty("webdriver.chrome.driver",
                "C:/Autom/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://angel.net/~nic/passwd.current.html");
    }

    @Test
    public void test1(){
        setMaster("12345678");
        setSite("gmail.com");
        generate();
        String  pwd = getPassword();
        Assert.assertEquals("W3Hdka0clbEI+@1a", pwd);
    }
    public void setMaster(String m){
        driver.findElement(By.name("master")).clear();
        driver.findElement(By.name("master")).sendKeys(m);
    }
    public void setSite(String s){
        driver.findElement(By.name("site")).clear();
        driver.findElement(By.name("site")).sendKeys(s);
    }
    public void generate(){
        driver.findElement(By.name("site")).sendKeys(Keys.ENTER);
    }
    public String getPassword(){
        return driver.findElement(By.name("password")).getAttribute("value");
    }

}
