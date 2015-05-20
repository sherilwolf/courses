package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by Admin on 18.05.15.
 */

@RunWith(JUnit4.class)
public class UzGovUa {
    @After
    public void clean(){
        UGUWebDriver.driver.quit();
    }
    @Before
    public void before(){
        UGUWebDriver.init();
        //UGUFunctions.open();
    }
    @Test
    public void Smoke(){
        UGUFunctions.open();
        UGUFunctions.from("Киев");
        UGUFunctions.to("Ивано-Франковск");
        UGUFunctions.date("Июнь 2015", 20);
        UGUFunctions.search();
        Assert.assertTrue(UGUFunctions.resultsTrain("043 К"));
        Assert.assertTrue(UGUFunctions.resultsTrain("143 К"));
        UGUFunctions.clickTrain("043 К");
        Assert.assertEquals("Маршрут поезда", UGUFunctions.modalName());
        UGUFunctions.modalClose();
        UGUFunctions.selectPlaces("043 К", "Купе"); //кликаем выбрать купе в 043 К
        /*Assert.assertTrue(UGUFunctions.isPlaceEmpty(36)); //проверяем свободно ли место 36
        Assert.assertEquals(5, UGUFunctions.selectedCoach); //проверяем, что выбран 5-й вагон
        UGUFunctions.selectPlace(36); //кликаем на 36 место
        Assert.assertEquals(212.70, UGUFunctions.price()); //проверяем, что цена 212,70
        UGUFunctions.name("Ann", 36); //заполняем имя для места 36
        UGUFunctions.lastname("Polikarpova", 36); //заполняем фамилию для места 36*/
    }
}
