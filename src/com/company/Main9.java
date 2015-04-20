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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by Admin on 20.04.15.
 */

@RunWith(JUnit4.class)
public class Main9 {
    public WebDriver driver;
    @After
    public void clean(){
        driver.quit();
    }
    @Before
    public void before(){
        System.setProperty("webdriver.chrome.driver",
                "C:/Autom/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //driver.get("http://oxogamestudio.com/passwd.current6.htm");
        driver.get("http://oxogamestudio.com/passwd.current7.htm");
    }

    @Test
    public void test1(){
        setMaster("12345678");
        setSite("gmail.com");
        generate();
        String  pwd = getPassword();
        Assert.assertEquals("W3Hdka0clbEI+@1a", pwd);
    }
    @Test
    public void test2(){
        setMaster("");
        setSite("gmail.com");
        generate();
        String  pwd = getPassword();
        Assert.assertEquals("zmcHOAyf2oZm+@1a", pwd);
    }
    @Test
    public void test3(){
        setMaster("12345678");
        setSite("");
        generate();
        String  pwd = getPassword();
        Assert.assertEquals("9Ixm2r5Xnm41Q@1a", pwd);
    }
    @Test
    public void test4(){
        generate();
        String pwd = getPassword();
        Assert.assertEquals("BaefBs8/Z/cm2@1a", pwd);
    }
    @Test
    public void test5(){
        String s = "";
        for (int i = 0; i < 200; i++) {
            s = s + 1;
        }
        setMaster(s);
        setSite(s);
        generate();
        String pwd = getPassword();
        Assert.assertEquals("aR8ztwNBbSqe5@1a", pwd);
    }
    @Test
    public void test6(){
        setMaster("!@#$%^&*");
        setSite("!@#$%^&*");
        generate();
        String pwd = getPassword();
        Assert.assertEquals("UZ8lLGSKoFxUd@1a", pwd);
    }
    @Test
    public void test7(){
        String res = button();
        Assert.assertEquals("Generate", res);
    }
    @Test
    public void test8(){
        setMaster("!@#$%^&*");
        setSite("1111111");
        generate();
        Assert.assertEquals("!@#$%^&*", driver.findElement(By.xpath("//td[text()='Your master password']/following::input")).getAttribute("value"));
    }
    @Test
    public void test9(){
        setMaster("!@#$%^&*");
        setSite("1111111");
        generate();
        Assert.assertEquals("1111111", driver.findElement(By.xpath("//td[text()='Site name']/following::input")).getAttribute("value"));
    }
    @Test
    public void test10(){
        setMaster("!@#$%^&*");
        setSite("!@#$%^&*");
        generate();
        Assert.assertEquals(true, driver.findElement(By.xpath("//td[text()='Your master password']/following::input")).isEnabled());
    }
    @Test
    public void test11(){
        setMaster("!@#$%^&*");
        setSite("!@#$%^&*");
        generate();
        Assert.assertEquals(true, driver.findElement(By.xpath("//td[text()='Site name']/following::input")).isEnabled());
    }
    @Test
    public void test12(){
        setMaster("!@#$%^&*");
        setSite("!@#$%^&*");
        generate();
        Assert.assertEquals(true, driver.findElement(By.xpath("//td[text()='Generated password']/following::input")).isEnabled());
    }
    @Test
    public void test13() {
        WebElement list = driver.findElement(By.xpath("//td[text()='Your master password']"));
        String s = list.getText();
        Assert.assertEquals("Your master password", s);
    }
    @Test
    public void test14(){
        WebElement list = driver.findElement(By.xpath("//td[text()='Site name']"));
        String s = list.getText();
        Assert.assertEquals("Site name", s);
    }
    @Test
    public void test15(){
        WebElement list = driver.findElement(By.xpath("//td[text()='Generated password']"));
        String s = list.getText();
        Assert.assertEquals("Generated password", s);
    }
    public void setMaster(String m){
        driver.findElement(By.xpath("//td[text()='Your master password']/following::input")).clear();
        driver.findElement(By.xpath("//td[text()='Your master password']/following::input")).sendKeys(m);
    }
    public void setSite(String s){
        driver.findElement(By.xpath("//td[text()='Site name']/following::input")).clear();
        driver.findElement(By.xpath("//td[text()='Site name']/following::input")).sendKeys(s);
    }
    public void generate(){
        driver.findElement(By.xpath("//td[text()='Site name']/following::input")).sendKeys(Keys.ENTER);
    }
    public String getPassword(){
        return driver.findElement(By.xpath("//td[text()='Generated password']/following::input")).getAttribute("value");
    }
    public String button(){
        return driver.findElement(By.xpath("//input[@type='submit']")).getAttribute("value");
    }
}
