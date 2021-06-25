package com.demoblase.pages;

import org.openqa.selenium.By;

public class CreateUserPage extends setUpPage {

    void crtUser() {
        //Act
        driver.get(BASE_URL);
        driver.findElement(By.cssSelector("#signin2")).click();
        driver.findElement(By.id("sign-username")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='sign-password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[contains(text(),'Sign up')]")).click();
    }
}
