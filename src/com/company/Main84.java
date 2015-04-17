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
 * Created by Ann on 16.04.2015.
 */
@RunWith(JUnit4.class)
public class Main84 {
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
        driver.get("http://oxogamestudio.com/passwd.current4.htm");
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
        Assert.assertEquals("!@#$%^&*", driver.findElement(By.name("master")).getAttribute("value"));
    }
    @Test
    public void test9(){
        setMaster("!@#$%^&*");
        setSite("1111111");
        generate();
        Assert.assertEquals("1111111", driver.findElement(By.name("site")).getAttribute("value"));
    }
    @Test
    public void test10(){
        setMaster("!@#$%^&*");
        setSite("!@#$%^&*");
        generate();
        Assert.assertEquals(true, driver.findElement(By.name("master")).isEnabled());
    }
    @Test
    public void test11(){
        setMaster("!@#$%^&*");
        setSite("!@#$%^&*");
        generate();
        Assert.assertEquals(true, driver.findElement(By.name("site")).isEnabled());
    }
    @Test
    public void test12(){
        setMaster("!@#$%^&*");
        setSite("!@#$%^&*");
        generate();
        Assert.assertEquals(true, driver.findElement(By.name("password")).isEnabled());
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
    public String button(){
        return driver.findElements(By.tagName("input")).get(2).getAttribute("value");
    }
}