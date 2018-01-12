package com.portal.ServiceDesk.pages;

import com.portal.ServiceDesk.support.BaseClass;
import com.portal.ServiceDesk.support.ElementsUtils;
import com.portal.ServiceDesk.support.WebModel;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.portal.ServiceDesk.support.BaseClass.driver;

public class LoginPage{

    ElementsUtils utils = new ElementsUtils();

    @FindBy(id="UserName")
    WebElement USERNAME;

    @FindBy(id="Password")
    WebElement PASSWORD;

    @FindBy(className="DivButton")
    WebElement SIGN_IN;

    @FindBy(id="page-heading")
    WebElement DASHBOARD_HEADING;

    @FindBy(xpath=".//*[@id='sidebar']/div/div[1]/ul[1]/li/div[2]")
    WebElement LOGIN_USER;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void verifyPageTitle(){
        Assert.assertEquals(driver.getTitle(),"Login");

    }

    public void loginAsCP(String username,String password){
        utils.waitForElementVisibility(USERNAME);
        USERNAME.sendKeys(username);
        PASSWORD.sendKeys(password);
        SIGN_IN.click();
    }

    public void loginAsAdamr(){
        utils.waitForElementVisibility(USERNAME);
        USERNAME.sendKeys("adamr");
        PASSWORD.sendKeys("password");
        SIGN_IN.click();
    }

    public void loginAsReseller(String username,String password){
        utils.waitForElementVisibility(USERNAME);
        USERNAME.sendKeys(username);
        PASSWORD.sendKeys(password);
        SIGN_IN.click();
    }

    public void loginAsAgent(String username,String password){
        utils.waitForElementVisibility(USERNAME);
        USERNAME.sendKeys(username);
        PASSWORD.sendKeys(password);
        SIGN_IN.click();
    }

    public void verifyLogin(String loginUser){
        utils.waitForElementVisibility(DASHBOARD_HEADING);
        Assert.assertEquals(LOGIN_USER.getText(),loginUser);

    }

}
