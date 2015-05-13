package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.nio.charset.Charset;


/**
 * Created by Admin on 29.04.15.
 */
public class Translate {
    public static void open(){
        TestHelper.driver.get("https://translate.google.com/");
    }
    public static void buttonTranslate(){ //тест 1, нажать кнопку транслейт
        TestHelper.driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
    public  static String rightFieldText(){ //тест 1, проверить, что правое поле пустое
        WebElement rightField = TestHelper.driver.findElement(By.xpath("//span[@id='result_box']"));
        
        String tmp = rightField.getText();
        return new String (tmp.getBytes(Charset.forName("utf-8")));
    }
    public static String title(){ //тест 2, проверить тайтл
        return TestHelper.driver.getTitle();
    }
    public static void checkElements(){ //тест 3, наличие правого, левого полей, кнопки транслейт
        TestHelper.driver.findElement(By.xpath("//input[@type='submit']"));
        TestHelper.driver.findElement(By.xpath("//span[@id='result_box']"));
        TestHelper.driver.findElement(By.xpath("//textarea[@id='source']"));
    }
    public static void showLanguageLeft(){ //тест 5, нажать на кнопку, чтобы увидеть языки слева
        TestHelper.driver.findElement(By.xpath("//div[@id='gt-sl-gms']")).click();
    }
    public static boolean isLanguagePresent(String lang){ //тест 5, проверка наличия языков
        WebElement language = TestHelper.driver.findElement(By.xpath("//div[text()='" + lang + "']"));
        return language.isDisplayed();
    }
    public static void from(String text){ //тест 6, левое поле
        WebElement textArea = TestHelper.driver.findElement(By.xpath("//textarea[@id='source']"));
        textArea.sendKeys(text);
    }
    public static boolean isSoundPresentInResult(){ //тест 6, кнопка прослушки
        WebElement sound = TestHelper.driver.findElement(By.xpath("//div[@id='gt-res-listen']/span"));
        return sound.isDisplayed();
    }
    public static void openLink(String link) { //тест 7, открыть ссылку
        TestHelper.driver.get(link); //"https://translate.google.com/#auto/en/Hello"
    }
    public  static String leftFieldText(){ //тест 7, проверить, что в правом поле хелллоу
        return TestHelper.driver.findElement(By.xpath("//textarea[@id='source']")).getAttribute("value");
    }
    public static void showLanguageRight(){ //тест 8, нажать на кнопку, чтобы увидеть языки справа
        TestHelper.driver.findElement(By.xpath("//div[@id='gt-tl-gms']")).click();
    }
    public static void changeLanguageLeft(String lang){ //тест 8, выбрать язык слева
        TestHelper.driver.findElement(By.xpath("//div[@id='gt-sl-gms-menu']//div[text()='" + lang + "']")).click();
    }
    public static void changeLanguageRight(String lang){ //тест 8, выбрать язык справа
        TestHelper.driver.findElement(By.xpath("//div[@id='gt-tl-gms-menu']//div[text()='" + lang + "']")).click();
    }
    public static void buttonChangeLanguage(){ //тест 8, нажать кнопку <>
        TestHelper.driver.findElement(By.xpath("//div[@id='gt-swap']")).click();
    }
    public static void buttonClear(){
        TestHelper.driver.findElement(By.xpath("//div[@id='gt-clear']/span")).click();
    }
    public static void checkLanguagePressLeft(String lang){
        TestHelper.driver.findElement(By.xpath("//div[@id='gt-sl-sugg']//div[text()='" + lang + "' and @aria-pressed='true']"));
    }
    public static void checkLanguagePressRight(String lang){
        TestHelper.driver.findElement(By.xpath("//div[@id='gt-tl-sugg']//div[text()='" + lang + "' and @aria-pressed='true']"));
    }
    public static void checkLanguageLeft(String lang){
        TestHelper.driver.findElement(By.xpath("//div[@id='gt-sl-sugg']//div[text()='" + lang + "']"));
    }
    public static void checkLanguageRight(String lang){
        TestHelper.driver.findElement(By.xpath("//div[@id='gt-tl-sugg']//div[text()='" + lang + "']"));
    }
}
