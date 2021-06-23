package com.demoblase.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class LoginUserPage extends setUpPage {
    //Arrange
    setUpPage LoginUserPage = null;
    {
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


    }

}