package com.demoblase.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class setUpPage {
    protected static WebDriver driver;

    public String browser;
    public String BASE_URL;
    public String username;
    public String password;
    public Properties properties;



    private void loadProperties() {
        FileInputStream fis = null;
        // in case there is an error or file may not be available we will use a try catch block
        try {
            properties = new Properties();
            fis = new FileInputStream("C:\\Users\\victorhernandez\\demoblaze\\src\\main\\java\\config\\config.properties");
            properties.load(fis);

            browser = properties.getProperty("browser");
            BASE_URL = properties.getProperty("BASE_URL");
            username = properties.getProperty("username");
            password = properties.getProperty("password");

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
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void closeBrowser(String browser){
        driver.close();
    }

    public boolean goToHomePage(){
        try{
            loadProperties();
            openBrowser();
            driver.get(BASE_URL);
        }catch (Exception e){
            System.out.println("Unable to navigate to page!");
            e.printStackTrace();
            return false;
        }

        return false;
    }

}
