package com.portal.ServiceDesk.support;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static com.portal.ServiceDesk.support.BaseClass.driver;

public class ElementsUtils{

    public void waitForElementVisibility(WebElement element){
        fluentWait().until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementVisibilityOID(WebElement element){
        waitForSomeTimeForOID().until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementVisibilityLineTest(WebElement element) {
        waitForSomeTimeForLineTest().until(ExpectedConditions.visibilityOf(element));
    }
//element.isDisplayed()
    public Wait fluentWait(){
        Wait wait = new FluentWait(driver)
                .withTimeout(20,TimeUnit.SECONDS)
                .pollingEvery(3,TimeUnit.SECONDS)
                .ignoring(WebDriverException.class);
        return wait;
    }

    public Wait waitForSomeTimeForOID(){
        Wait wait = new FluentWait(driver)
                .withTimeout(120,TimeUnit.SECONDS)
                .pollingEvery(5,TimeUnit.SECONDS)
                .ignoring(WebDriverException.class);
        return wait;
    }

    public Wait waitForSomeTimeForLineTest(){
        Wait wait = new FluentWait(driver)
                .withTimeout(90,TimeUnit.SECONDS)
                .pollingEvery(3,TimeUnit.SECONDS)
                .ignoring(WebDriverException.class);
        return wait;
    }

    public void implicitWait(int sec){
        driver.manage().timeouts().implicitlyWait(sec,TimeUnit.SECONDS);

    }

    public void selectByVisibleText(WebElement element,String option){
        Select select = new Select(element);
        select.selectByVisibleText(option);
    }

    public String getSelectedOption(WebElement element){
        Select select = new Select(element);
        return(select.getFirstSelectedOption().getText());
    }

    public int getDropdownsize(WebElement element){
        Select select = new Select(element);
        return select.getOptions().size();

    }

    public void captureScreenShot(String screenshotName) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source,new File("./ScreenShots/"+screenshotName+".png"));
        System.out.println("ScreenShot Taken");
    }



}

