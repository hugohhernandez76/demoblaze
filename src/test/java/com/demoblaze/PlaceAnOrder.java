package com.demoblaze;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PlaceAnOrder extends setUp {

    @Test
    void orderplaced() {
        if (driver == null) {
            System.out.println("Driver is Null");

            System.out.println();
            driver.get(BASE_URL);

            //User logging in
            driver.findElement(By.cssSelector("#login2")).click();
            driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("vhernandez");
            driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("hugo1234");
            driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

            //Adding a Phone to the Cart
            driver.findElement(By.xpath("//a[contains(text(),'Samsung galaxy s6')]")).click();
            driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
            Alert simpleAlert = driver.switchTo().alert(); // HOW TO MAKE THIS A GLOBAL VARIABLE
            simpleAlert.accept();
            driver.findElement(By.xpath("//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();

            //Adding a Laptop to the Cart
            driver.findElement(By.xpath("//a[contains(text(),'Laptops')]")).click();
            driver.findElement(By.xpath("//a[contains(text(),'MacBook Pro')]")).click();
            driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
            simpleAlert = driver.switchTo().alert();
            simpleAlert.accept();
            driver.findElement(By.xpath("//body/nav[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();

            //Adding a Monitor to the Cart
            driver.findElement(By.xpath("//a[contains(text(),'Monitors')]")).click();
            driver.findElement(By.xpath("//a[contains(text(),'Apple monitor 24')]")).click();
            driver.findElement(By.xpath("//a[contains(text(),'Apple monitor 24')]")).click();
            simpleAlert = driver.switchTo().alert();
            simpleAlert.accept();

            //Placing an order
            driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
            simpleAlert = driver.switchTo().alert();
            simpleAlert.accept();

            //Fill out shipping form and payment method
            driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Victor Hernandez");
            driver.findElement(By.xpath("//input[@id='country']")).sendKeys("Mexico");
            driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Queretaro");
            driver.findElement(By.xpath("//input[@id='card']")).sendKeys("4125789645237452");
            driver.findElement(By.xpath("//input[@id='month']")).sendKeys("02");
            driver.findElement(By.xpath("//input[@id='year']")).sendKeys("2025");

            //Placing the order
            driver.findElement(By.xpath("//button[contains(text(),'Purchase')]")).click();
            driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();


        }
    }
}
