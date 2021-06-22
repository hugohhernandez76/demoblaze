package com.demoblaze;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class setUp {
    public static final String BASE_URL = "https://www.demoblaze.com/index.html";
    public static WebDriver driver;


    @BeforeMethod
    static void initDriver() {
        mainSetUp();
    }


    static WebDriver mainSetUp() {


        //Arrange
        System.setProperty("webdriver.chrome.driver", "C:\\DevTools\\Drivers\\chromever91\\chromedriver.exe");

        // Set options to full screen
        ChromeOptions options = new ChromeOptions().addArguments("start-fullscreen");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

    @AfterMethod
    static void cleanup() {
        driver.close();
    }

}

