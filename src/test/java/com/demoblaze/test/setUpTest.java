package com.demoblaze.test;

import com.demoblase.pages.setUpPage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class setUpTest extends setUpPage {

    @BeforeSuite
    public void initDriver() {
        goToHomePage();
    }

    {





    }

    @AfterSuite
    public void tearDown() {
        driver.close();
           }


}



