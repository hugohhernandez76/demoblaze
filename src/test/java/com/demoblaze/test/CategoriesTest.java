package com.demoblaze.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CategoriesTest extends setUpTest {


        @Test
        void validateCategories(){

        if (driver== null) {
            System.out.println("Driver is Null");

            driver.get(BASE_URL);

            driver.findElement(By.cssSelector("#login2")).click();
            driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("vhernandez");
            driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("hugo1234");
            driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();


            String menuCategories = driver.findElement(By.linkText("CATEGORIES")).getText();
            Assert.assertEquals(menuCategories, "CATEGORIES", "Menu is not displayed");

            String phoneslink = driver.findElement(By.linkText("Phones")).getText();
            Assert.assertEquals(phoneslink, "Phones", "Link does not exist or match!");

            String laptopslink = driver.findElement(By.linkText("Laptops")).getText();
            Assert.assertEquals(laptopslink, "Laptops", "LInk does not exist or match!");

            String monitorslink = driver.findElement(By.linkText("Monitors")). getText();
            Assert.assertEquals(laptopslink, "Laptops", "Link does not exist or match!");

        }

     }

}
