package com.demoblaze;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class setUp {
    public static final String BASE_URL="https://www.demoblaze.com/index.html";
    static WebDriver driver;

    @BeforeMethod
    static void mainSetUp() {

        //Arrange
        System.setProperty("webdriver.chrome.driver", "C:\\DevTools\\Drivers\\chromedriver.exe");

        // Set options to full screen
        ChromeOptions options = new ChromeOptions().addArguments("start-fullscreen");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
//    @AfterMethod
//    static void cleanup(){
//        driver.close();
    }



