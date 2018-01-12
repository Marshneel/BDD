package com.portal.ServiceDesk.support;

import cucumber.api.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseClass {

    public static WebDriver driver;
    public static Properties prop;
    public static ElementsUtils utils = new ElementsUtils();

/*
    public BaseClass(){


        try {
            prop = new Properties();
            FileInputStream fileInputStream = new FileInputStream("src/test/Resources/config.properties");
            prop.load(fileInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
*/
    @Before
    public static void initialization() throws IOException {

        prop = new Properties();
        FileInputStream fileInputStream = new FileInputStream("src/test/Resources/config.properties");
        prop.load(fileInputStream);

        String browserName = prop.getProperty("browser");
        if(browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","DriverFiles\\chromedriver.exe");
            driver = new ChromeDriver();


        }

        else if (browserName.equalsIgnoreCase("firefox")){
            driver = new FirefoxDriver();

        }
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));

    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
        if(scenario.isFailed()){
            utils.captureScreenShot(scenario.getName());
        }
        driver.close();
        driver.quit();
    }


}
