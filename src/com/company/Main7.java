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
 * Created by Admin on 08.04.15.
 */
@RunWith(JUnit4.class)
public class Main7 {
    public WebDriver h;
    @Test
    public void test1(){
        Assert.fail();
    }
    @Test
    public void test2(){
        int a = 10;
        int b = 5;
        int expectedResult = 15;
        Assert.assertEquals("Expected results did not match", expectedResult, a + b);
        Assert.assertTrue(expectedResult == (a + b));
    }
    @Test
    public void test3(){
        h.get("http://angel.net/~nic/passwd.current.html");
        h.findElement(By.name("master")).sendKeys("12345678");
        h.findElement(By.name("site")).sendKeys("google.com");
        h.findElement(By.name("site")).sendKeys(Keys.ENTER);
        String res = h.findElement(By.name("password")).getAttribute("value");
        Assert.assertEquals("C5cOLpg5+do25@1a", res);
        //h.quit();
    }
    @Test
    public void test4(){
        h.get("http://angel.net/~nic/passwd.current.html");
        h.findElement(By.name("master")).sendKeys("");
        h.findElement(By.name("site")).sendKeys("google.com");
        h.findElement(By.name("site")).sendKeys(Keys.ENTER);
        String res = h.findElement(By.name("password")).getAttribute("value");
        Assert.assertEquals("qYJKKiLDonZiO@1a", res);
        //h.quit();
    }
    @Test
    public void test5(){
        h.get("http://angel.net/~nic/passwd.current.html");
        h.findElement(By.name("master")).sendKeys("12345678");
        h.findElement(By.name("site")).sendKeys("");
        h.findElement(By.name("site")).sendKeys(Keys.ENTER);
        String res = h.findElement(By.name("password")).getAttribute("value");
        Assert.assertEquals("9Ixm2r5Xnm41Q@1a", res);
        //h.quit();
    }
    @After
    public void clean(){
      h.quit();
    }
    @Before
    public void befor(){
        System.setProperty("webdriver.chrome.driver",
                "C:/Autom/chromedriver_win32/chromedriver.exe");
        h = new ChromeDriver();
        h.manage().window().maximize();
        h.get("http://angel.net/~nic/passwd.current.html");
    }
    @Test
    public void test6(){
        h.findElement(By.name("site")).sendKeys(Keys.ENTER);
        String res = h.findElement(By.name("password")).getAttribute("value");
        Assert.assertEquals("BaefBs8/Z/cm2@1a", res);
    }
    @Test
    public void test7(){
//200 символов в поле мастер, 200 символов в поле сайт, пароль верный (переделать циклом)
        h.get("http://angel.net/~nic/passwd.current.html");
        h.findElement(By.name("master")).sendKeys("11121212154545687879/79774654654555555555578999999999999995555555555554444111111111111111111111115555555555555888888888888885487945465465465465465465431213213545968789798765465413135413546748/7987987");
        h.findElement(By.name("site")).sendKeys("11121212154545687879/79774654654555555555578999999999999995555555555554444111111111111111111111115555555555555888888888888885487945465465465465465465431213213545968789798765465413135413546748/7987987");
        h.findElement(By.name("site")).sendKeys(Keys.ENTER);
        String res = h.findElement(By.name("password")).getAttribute("value");
        Assert.assertEquals("PAQYSyVvTxU9f@1a", res);
    }
    @Test
    public void test8(){
        h.get("http://angel.net/~nic/passwd.current.html");
        h.findElement(By.name("master")).sendKeys("!@#$%^&*");
        h.findElement(By.name("site")).sendKeys("!@#$%^&*");
        h.findElement(By.name("site")).sendKeys(Keys.ENTER);
        String res = h.findElement(By.name("password")).getAttribute("value");
        Assert.assertEquals("UZ8lLGSKoFxUd@1a", res);
    }
    @Test
    public void test9(){
        h.get("http://angel.net/~nic/passwd.current.html");
        String res = h.findElements(By.tagName("input")).get(2).getAttribute("value");
        Assert.assertEquals("Generate", res);
    }

}
