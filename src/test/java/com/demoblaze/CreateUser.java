package com.demoblaze;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CreateUser extends setUp {

        @Test
        void crtUser(){
        //Act
        driver.get(BASE_URL);
        driver.findElement(By.cssSelector("#signin2")).click();
        driver.findElement(By.id("sign-username")).sendKeys("vhernandez2");
        driver.findElement(By.xpath("//input[@id='sign-password']")).sendKeys("hugo1234");
        driver.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();

        //Simple Alert
        //Alert alert = driver.switchTo().alert();
        //alert.accept();



        //Assert

    }
}
