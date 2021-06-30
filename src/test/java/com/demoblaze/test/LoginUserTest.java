package com.demoblaze.test;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginUserTest extends setUpTest {

    @Test
    void AccessUserAccount() {
            //verify if user is logged in
        String userLoggedin = driver.findElement(By.cssSelector("#nameofuser")).getText();
        Assert.assertEquals(userLoggedin, "Welcome vhernandez", "Text did not matched!");


    }

    }

