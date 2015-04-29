package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

/**
 * Created by Admin on 29.04.15.
 */
@RunWith(JUnit4.class)
public class Main11 {
    @After
    public void clean(){
        TestHelper.driver.quit();
    }
    @Before
    public void before(){
        TestHelper.init();
        Translate.open();
    }
    @Test //нажали транслейт, результат пустой
    public void test1() {
        Translate.buttonTranslate();
        Assert.assertEquals("", Translate.rightField());
    }
    @Test //проверить тайтл
    public void test2() {
        String title = TestHelper.driver.getTitle();
        Assert.assertEquals("Google Translate", title);
    }
    @Test //наличие правого, левого полей, кнопки транслейт
    public void test3() {
        Translate.checkElements();
    }
    @Test //правое поле пустое
    public void test4() {
        Translate.checkRigthField();
    }
    @Test //проверить наличие Греческого, Мальтийского и Словацкого языка
    public void test5() {
        Translate.checkLanguage();
    }
}
