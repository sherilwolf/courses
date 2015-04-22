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

/**
 * Created by Ann on 21.04.2015.
 */
@RunWith(JUnit4.class)
public class Main91 {
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
        //driver.get("http://oxogamestudio.com/passwd.current7.htm");
        driver.get("http://oxogamestudio.com/passwd.current8.htm");
    }

    @Test
    public void test1() throws InterruptedException {
        setField("Your master password", "12345678");
        setField("Site name", "gmail.com");
        waitButton();
        generate();
        waitPassword();
        String pwd = getField("Generated password");
        Assert.assertEquals("W3Hdka0clbEI+@1a", pwd);
    }
    @Test
    public void test2() throws InterruptedException {
        setField("Your master password", "");
        setField("Site name", "gmail.com");
        waitButton();
        generate();
        waitPassword();
        String pwd = getField("Generated password");
        Assert.assertEquals("zmcHOAyf2oZm+@1a", pwd);
    }
    @Test
    public void test3() throws InterruptedException {
        setField("Your master password", "12345678");
        setField("Site name", "");
        waitButton();
        generate();
        waitPassword();
        String pwd = getField("Generated password");
        Assert.assertEquals("9Ixm2r5Xnm41Q@1a", pwd);
    }
    @Test
    public void test4() throws InterruptedException {
        waitButton();
        generate();
        waitPassword();
        String pwd = getField("Generated password");
        Assert.assertEquals("BaefBs8/Z/cm2@1a", pwd);
    }
    @Test
    public void test5() throws InterruptedException {
        String s = "";
        for (int i = 0; i < 200; i++) {
            s = s + 1;
        }
        setField("Your master password", s);
        waitButton();
        generate();
        waitPassword();
        String pwd = getField("Generated password");
        Assert.assertEquals("/nYu7j9eFh1Da@1a", pwd);
    }
    @Test
    public void test6() throws InterruptedException {
        setField("Your master password", "!@#$%^&*");
        setField("Site name", "!@#$%^&*");
        waitButton();
        generate();
        waitPassword();
        String pwd = getField("Generated password");
        Assert.assertEquals("UZ8lLGSKoFxUd@1a", pwd);
    }
    @Test
    public void test7() throws InterruptedException {
        waitButton();
        String res = button();
        Assert.assertEquals("Generate", res);
    }
    @Test
    public void test8(){
        setField("Your master password", "!@#$%^&*");
        setField("Site name", "1111111");
        generate();
        Assert.assertEquals("!@#$%^&*", driver.findElement(By.xpath("//td[text()='Your master password']/following::input")).getAttribute("value"));
    }
    @Test
    public void test9(){
        setField("Your master password", "!@#$%^&*");
        setField("Site name", "1111111");
        generate();
        Assert.assertEquals("1111111", driver.findElement(By.xpath("//td[text()='Site name']/following::input")).getAttribute("value"));
    }
    @Test
    public void test10(){
        setField("Your master password", "!@#$%^&*");
        setField("Site name", "!@#$%^&*");
        generate();
        Assert.assertEquals(true, driver.findElement(By.xpath("//td[text()='Your master password']/following::input")).isEnabled());
    }
    @Test
    public void test11(){
        setField("Your master password", "!@#$%^&*");
        setField("Site name", "!@#$%^&*");
        generate();
        Assert.assertEquals(true, driver.findElement(By.xpath("//td[text()='Site name']/following::input")).isEnabled());
    }
    @Test
    public void test12(){
        setField("Your master password", "!@#$%^&*");
        setField("Site name", "!@#$%^&*");
        generate();
        Assert.assertEquals(true, driver.findElement(By.xpath("//td[text()='Generated password']/following::input")).isEnabled());
    }
    @Test
    public void test13() {
        WebElement td = driver.findElement(By.xpath("//td[text()='Your master password']"));
        String s = td.getText();
        Assert.assertEquals("Your master password", s);
    }
    @Test
    public void test14(){
        WebElement td = driver.findElement(By.xpath("//td[text()='Site name']"));
        String s = td.getText();
        Assert.assertEquals("Site name", s);
    }
    @Test
    public void test15(){
        WebElement td = driver.findElement(By.xpath("//td[text()='Generated password']"));
        String s = td.getText();
        Assert.assertEquals("Generated password", s);
    }
    public void setField(String fieldName, String fieldValue){
        WebElement field = driver.findElement(By.xpath("//td[text()='" + fieldName + "']/following::input"));
        field.clear();
        field.sendKeys(fieldValue);
    }
    public String getField(String fieldName){
        String field = driver.findElement(By.xpath("//td[text()='" + fieldName + "']/following::input")).getAttribute("value");
        return field;
    }
    public void generate(){
        driver.findElement(By.xpath("//td[text()='Site name']/following::input")).sendKeys(Keys.ENTER);
    }
    public String button(){
        return driver.findElement(By.xpath("//input[@type='submit']")).getAttribute("value");
    }
    public void waitPassword() throws InterruptedException {
        while (driver.findElement(By.xpath("//td[text()='Generated password']/following::input")).getAttribute("value").equals("")){
            Thread.sleep(200);
        }
    }
    public void waitButton() throws InterruptedException {
        while (driver.findElements(By.xpath("//input[@type='submit']")).size() <= 0){
            Thread.sleep(200);
        }
    }
}