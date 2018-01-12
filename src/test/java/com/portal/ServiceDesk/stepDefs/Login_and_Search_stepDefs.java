package com.portal.ServiceDesk.stepDefs;

import com.portal.ServiceDesk.support.WebModel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class Login_and_Search_stepDefs {
    WebModel webModel = new WebModel();

    @Given("^I am logged in as CP$")
    public void i_am_logged_in_as_CP() throws Throwable {
        webModel.getLoginPage().loginAsAdamr();

    }

    @When("^I click on Log an Incident Menu under Service Desk$")
    public void i_click_on_Log_an_Incident_Menu_under_Service_Desk() throws Throwable {
        webModel.getDashBoardPage().loginServiceDesk();
    }

    @Then("^I should be able to search by Account Number\"([^\"]*)\"$")
    public void i_should_be_able_to_search_by_Account_Number(String account_number) throws Throwable {
        webModel.getServiceDeskPage().searchByAccountNumber(account_number);
        Assert.assertTrue(webModel.getServiceDeskPage().verifySearchResults("Chiswick","AR & Co","AR & Co / Chiswick","1 Chiswick Lane,Chiswick,London,W4 1WW","01234567899"));
        Assert.assertTrue(webModel.getServiceDeskPage().verifyAccountDetails("AR & Co","SLA needs to be upgraded. Bills pendings.","Agent","Rob Bristow","3Enigma","Ok","Test Level","Showing 1 to 5 of 5 entries"));
        Assert.assertTrue(webModel.getServiceDeskPage().verifyLogButton());
    }


    @Then("^I should be able to search by Account Name\"([^\"]*)\"$")
    public void i_should_be_able_to_search_by_Account_Name(String account_name) throws Throwable {
        webModel.getServiceDeskPage().searchByAccountNumber(account_name);
        Assert.assertTrue(webModel.getServiceDeskPage().verifySearchResults("A New Sage Ref Co","A New Sage Ref Co","A New Sage Ref Co / A New Sage Ref Co","2 Sheen Road,Richmond,London,SW14 06B","0201122334"));
        Assert.assertTrue(webModel.getServiceDeskPage().verifyAccountDetails("A New Sage Ref Co","Company Billing","A A","Adam Reed","3Enigma","On Hold","Level 1","Showing 1 to 2 of 2 entries"));
        Assert.assertTrue(webModel.getServiceDeskPage().verifyLogButton());
    }

    @Then("^I should be able to search by CLI \"([^\"]*)\"$")
    public void i_should_be_able_to_search_by_CLI(String CLI) throws Throwable {
        webModel.getServiceDeskPage().searchByCLI(CLI);
        Assert.assertTrue(webModel.getServiceDeskPage().verifySearchResults("Adam As A Reseller","Adam As A Reseller","Adam As A Reseller / Adam As A Reseller","3 Milton Road,Richmond,London,SW14 8JP","01234569891"));
        Assert.assertTrue(webModel.getServiceDeskPage().verifyAccountDetails("Adam As A Reseller","Care Level 4 for this Company.\n" + "Tariff Plan : Gold Standard","Adam Reseller","Adam Reed","3Enigma","Ok","Default","Showing 1 to 5 of"));
        Assert.assertTrue(webModel.getServiceDeskPage().verifyLogButton());
    }

}
