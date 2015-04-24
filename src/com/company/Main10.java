package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

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
    public void test8() throws InterruptedException {
        GenPassPage.setField("Your master password", "!@#$%^&*");
        GenPassPage.setField("Site name", "1111111");
        GenPassPage.waitButton();
        GenPassPage.generate();
        Assert.assertEquals("!@#$%^&*", GenPassPage.getField("Your master password"));
    }
    @Test
    public void test9() throws InterruptedException {
        GenPassPage.setField("Your master password", "!@#$%^&*");
        GenPassPage.setField("Site name", "1111111");
        GenPassPage.waitButton();
        GenPassPage.generate();
        Assert.assertEquals("1111111", GenPassPage.getField("Site name"));
    }
    @Test
    public void test10() throws InterruptedException {
        GenPassPage.setField("Your master password", "!@#$%^&*");
        GenPassPage.setField("Site name", "!@#$%^&*");
        GenPassPage.waitButton();
        GenPassPage.generate();
        Assert.assertEquals(true, GenPassPage.isEnabled("Your master password"));
    }
    @Test
    public void test11() throws InterruptedException {
        GenPassPage.setField("Your master password", "!@#$%^&*");
        GenPassPage.setField("Site name", "!@#$%^&*");
        GenPassPage.waitButton();
        GenPassPage.generate();
        Assert.assertEquals(true, GenPassPage.isEnabled("Site name"));
    }
    @Test
    public void test12() throws InterruptedException {
        GenPassPage.setField("Your master password", "!@#$%^&*");
        GenPassPage.setField("Site name", "!@#$%^&*");
        GenPassPage.waitButton();
        GenPassPage.generate();
        Assert.assertEquals(true, GenPassPage.isEnabled("Generated password"));
    }
    @Test
    public void test13() {
        Assert.assertEquals("Your master password", GenPassPage.getText(0));
    }
    @Test
    public void test14(){
        Assert.assertEquals("Site name", GenPassPage.getText(2));
    }
    @Test
    public void test15(){
        Assert.assertEquals("Generated password", GenPassPage.getText(5));
    }
}
