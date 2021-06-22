package com.demoblaze.test;

import com.demoblase.pages.setUpPage;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class setUpTest extends setUpPage {
//    public static final String BASE_URL = "https://www.demoblaze.com/index.html";
//    public static WebDriver driver;


    @BeforeSuite
    public void initDriver() {
        Assert.assertTrue(goToHomePage(), "An error has ocurred, unable to access Page!");
   }


    //static WebDriver mainSetUp() {



        //Arrange
        //System.setProperty("webdriver.chrome.driver", "C:\\DevTools\\Drivers\\chromever91\\chromedriver.exe");

        // Set options to full screen
//        ChromeOptions options = new ChromeOptions().addArguments("start-fullscreen");
//        driver = new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        return driver;


    @AfterSuite
    public void cleanup() {
        closeBrowser();
    }

}

