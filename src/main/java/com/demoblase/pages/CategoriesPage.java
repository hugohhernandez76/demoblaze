package com.demoblase.pages;

import org.openqa.selenium.By;

public class CategoriesPage extends setUpPage {
    void validateCategories() {
        setUpPage categoriesPage = null;
        categoriesPage.goToHomePage();

        driver.findElement(By.cssSelector("#login2")).click();
        driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("vhernandez");
        driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("hugo1234");
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();


    }
}




