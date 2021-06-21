package com.demoblaze;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginUser extends setUp {

    @Test(priority = 2)
    void AccessUserAccount() {


        //Arrange

        driver.get(BASE_URL);

        //Act
        driver.findElement(By.cssSelector("#login2")).click();
        driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("vhernandez");
        driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("hugo1234");
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();






        //Simple Alert
        Alert simpleAlert = driver.switchTo().alert();
        //Thread.sleep(3000);
        simpleAlert.accept();
        //Thread.sleep(3000);



    }
}
