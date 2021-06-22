package com.demoblase.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class setUpPage<properties> {
    protected static WebDriver driver;

    public String browser;
    public String BASE_URL;
    //public String Properties;
    private Object properties;


    private void loadProperties() {
        FileInputStream fis = null;
        // in case there is an error or file may not be available we will use a try catch block
        try {
            properties = new Properties();
            fis = new FileInputStream("C:\\Users\\victorhernandez\\demoblaze\\src\\main\\java\\config\\config.properties");
            loadProperties();

            browser = properties.getProperty("browser");
            BASE_URL = properties.getProperty("BASE_URL");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
              try {
                 fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        private void openBrowser(){
            if(browser.equals("chrome")){
                driver = new ChromeDriver();
            }
            driver.manage().window().maximize();
    }
    public void closeBrowser(){
        driver.close();
    }
}