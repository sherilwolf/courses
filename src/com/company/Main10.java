package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * Created by Admin on 22.04.15.
 */
@RunWith(JUnit4.class)
public class Main10 {
    @After
    public void clean(){
        TestHelper.driver.quit();
    }
    @Before
    public void before(){
        TestHelper.init();
        GenPassPage.open();
        m,m,m,m,m
    }

    @Test
    public void test1() throws InterruptedException {
        GenPassPage.setField("Your master password", "12345678");
        GenPassPage.setField("Site name", "gmail.com");
        GenPassPage.waitButton();
        GenPassPage.generate();
        GenPassPage.waitPassword();
        String pwd = GenPassPage.getField("Generated password");
        Assert.assertEquals("W3Hdka0clbEI+@1a", pwd);
    }
    @Test
    public void test2() throws InterruptedException {
        GenPassPage.setField("Your master password", "");
        GenPassPage.setField("Site name", "gmail.com");
        GenPassPage.waitButton();
        GenPassPage.generate();
        GenPassPage.waitPassword();
        String pwd = GenPassPage.getField("Generated password");
        Assert.assertEquals("zmcHOAyf2oZm+@1a", pwd);
    }
    @Test
    public void test3() throws InterruptedException {
        GenPassPage.setField("Your master password", "12345678");
        GenPassPage.setField("Site name", "");
        GenPassPage.waitButton();
        GenPassPage.generate();
        GenPassPage.waitPassword();
        String pwd = GenPassPage.getField("Generated password");
        Assert.assertEquals("9Ixm2r5Xnm41Q@1a", pwd);
    }
    @Test
    public void test4() throws InterruptedException {
        GenPassPage.waitButton();
        GenPassPage.generate();
        GenPassPage.waitPassword();
        String pwd = GenPassPage.getField("Generated password");
        Assert.assertEquals("BaefBs8/Z/cm2@1a", pwd);
    }
    @Test
    public void test5() throws InterruptedException {
        String s = "";
        for (int i = 0; i < 200; i++) {
            s = s + 1;
        }
        GenPassPage.setField("Your master password", s);
        GenPassPage.waitButton();
        GenPassPage.generate();
        GenPassPage.waitPassword();
        String pwd = GenPassPage.getField("Generated password");
        Assert.assertEquals("/nYu7j9eFh1Da@1a", pwd);
    }
    @Test
    public void test6() throws InterruptedException {
        GenPassPage.setField("Your master password", "!@#$%^&*");
        GenPassPage.setField("Site name", "!@#$%^&*");
        GenPassPage.waitButton();
        GenPassPage.generate();
        GenPassPage.waitPassword();
        String pwd = GenPassPage.getField("Generated password");
        Assert.assertEquals("UZ8lLGSKoFxUd@1a", pwd);
    }
    @Test
    public void test7() throws InterruptedException {
        GenPassPage.waitButton();
        String res = GenPassPage.button();
        Assert.assertEquals("Generate", res);
    }
    @Test
    public void test8(){
        GenPassPage.setField("Your master password", "!@#$%^&*");
        GenPassPage.setField("Site name", "1111111");
        GenPassPage.generate();
        Assert.assertEquals("!@#$%^&*", TestHelper.driver.findElement(By.xpath("//td[text()='Your master password']/following::input")).getAttribute("value"));
    }
    @Test
    public void test9(){
        GenPassPage.setField("Your master password", "!@#$%^&*");
        GenPassPage.setField("Site name", "1111111");
        GenPassPage.generate();
        Assert.assertEquals("1111111", TestHelper.driver.findElement(By.xpath("//td[text()='Site name']/following::input")).getAttribute("value"));
    }
    @Test
    public void test10(){
        GenPassPage.setField("Your master password", "!@#$%^&*");
        GenPassPage.setField("Site name", "!@#$%^&*");
        GenPassPage.generate();
        Assert.assertEquals(true, TestHelper.driver.findElement(By.xpath("//td[text()='Your master password']/following::input")).isEnabled());
    }
    @Test
    public void test11(){
        GenPassPage.setField("Your master password", "!@#$%^&*");
        GenPassPage.setField("Site name", "!@#$%^&*");
        GenPassPage.generate();
        Assert.assertEquals(true, TestHelper.driver.findElement(By.xpath("//td[text()='Site name']/following::input")).isEnabled());
    }
    @Test
    public void test12(){
        GenPassPage.setField("Your master password", "!@#$%^&*");
        GenPassPage.setField("Site name", "!@#$%^&*");
        GenPassPage.generate();
        Assert.assertEquals(true, TestHelper.driver.findElement(By.xpath("//td[text()='Generated password']/following::input")).isEnabled());
    }
    @Test
    public void test13() {
        WebElement td = TestHelper.driver.findElement(By.xpath("//td[text()='Your master password']"));
        String s = td.getText();
        Assert.assertEquals("Your master password", s);
    }
    @Test
    public void test14(){
        WebElement td = TestHelper.driver.findElement(By.xpath("//td[text()='Site name']"));
        String s = td.getText();
        Assert.assertEquals("Site name", s);
    }
    @Test
    public void test15(){
        WebElement td = TestHelper.driver.findElement(By.xpath("//td[text()='Generated password']"));
        String s = td.getText();
        Assert.assertEquals("Generated password", s);
    }
}
