package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

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
        Assert.assertEquals("", Translate.rightFieldText());
    }
    @Test //проверить тайтл
    public void test2() {
        Assert.assertEquals("Переводчик Google", Translate.title());
    }
    @Test //наличие правого, левого полей, кнопки транслейт
    public void test3() {
        Translate.checkElements();
    }
    @Test //правое поле пустое
    public void test4() {
        Translate.rightFieldText();
    }
    @Test //проверить наличие Греческого, Мальтийского и Словацкого языка
    public void test5() {
        Translate.showLanguageLeft();
        Assert.assertTrue(Translate.isLanguagePresent("греческий"));
        Assert.assertTrue(Translate.isLanguagePresent("мальтийский"));
        Assert.assertTrue(Translate.isLanguagePresent("словацкий"));
    }
    @Test //ввести хеллоу в левое поле, нажать транслейт, проверить наличие кнопки прослушки
    public void test6() throws InterruptedException {
        Translate.from("Hello");
        Translate.buttonTranslate();
        Thread.sleep(400);
        Assert.assertTrue(Translate.isSoundPresentInResult());
    }
    @Test // открыть ссылку https://translate.google.com/#auto/en/Hello, слева Hello, справа перевод
    public void test7() throws InterruptedException {
        Translate.openLink("https://translate.google.com/#auto/en/Hello");
        Thread.sleep(400);
        Assert.assertEquals("Hello", Translate.leftFieldText());
        Assert.assertEquals("Hello", Translate.rightFieldText());
    }
    @Test // слева  испанский, справа английский, ввести Hello, нажать <>, проверить справа ¡Hola
    public void test8() throws InterruptedException {
        Translate.showLanguageLeft();
        Translate.changeLanguageLeft("испанский");
        Translate.showLanguageRight();
        Translate.changeLanguageRight("английский");
        Translate.from("Hello");
        Translate.buttonChangeLanguage();
        Thread.sleep(400);
        Assert.assertEquals("¡Hola", Translate.rightFieldText());
    }
    @Test //слева Hello, нажимаем X, проверяем слева и справа пусто
    public void test9() {
        Translate.from("Hello");
        Translate.buttonClear();
        Assert.assertEquals("", Translate.rightFieldText());
        Assert.assertEquals("", Translate.leftFieldText());
    }
    @Test // слева украинский, справа китайский, вводим слева С У! \nГ С!, проверить перевод
    public void test10() throws InterruptedException {
        Translate.showLanguageLeft();
        Translate.changeLanguageLeft("украинский");
        Translate.showLanguageRight();
        Translate.changeLanguageRight("китайский (традиционный)");
        Translate.from("Слава Україні! \nГероям Слава!");
        Thread.sleep(400);
        Assert.assertEquals("光榮屬於烏克蘭！\n光榮屬於英雄！", Translate.rightFieldText());
    }
    @Test // открыть ссылку, проверить слева укр, справа яванский, в обоих полях Hello
    public void test11() {
        Translate.openLink("https://translate.google.com/#uk/jw/Hello");
        Translate.checkLanguagePressLeft("украинский");
        Translate.checkLanguagePressRight("яванский");
        Assert.assertEquals("Hello", Translate.rightFieldText());
        Assert.assertEquals("Hello", Translate.leftFieldText());
    }
    @Test // проверить быстродоступные кнопки языков слева и справа
    public void test12() {
        Translate.checkLanguageLeft("английский");
        Translate.checkLanguageLeft("русский");
        Translate.checkLanguageLeft("немецкий");
        Translate.checkLanguageRight("русский");
        Translate.checkLanguageRight("английский");
        Translate.checkLanguageRight("украинский");
    }

}
