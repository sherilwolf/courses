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
    public void Smoke() throws InterruptedException {
        UGUFunctions.open();
        UGUFunctions.from("Київ");
        //UGUFunctions.to("Івано-Франківськ");
        UGUFunctions.date();
        UGUFunctions.search();
        //Assert.assertEquals(2, UGUFunctions.resultsCount());
    }
}
