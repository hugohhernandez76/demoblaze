package com.demoblaze.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginUserTest extends setUpTest {

    @Test
    void AccessUserAccount() {


        //Arrange
        if (driver == null) {
            System.out.println("Driver is Null");

        System.out.println();
        driver.get(BASE_URL);

        //User logging in
        driver.findElement(By.cssSelector("#login2")).click();
        driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("vhernandez");
        driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("hugo1234");
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

        //Simple Alert
        Alert simpleAlert = driver.switchTo().alert();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            simpleAlert.accept();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            //verify if user is logged in
        String userLoggedin = driver.findElement(By.linkText("Welcome vhernandez")).getText();
        Assert.assertEquals(userLoggedin, "Welcome vhernandez", "Text did not matched!");


    }

    }
}
