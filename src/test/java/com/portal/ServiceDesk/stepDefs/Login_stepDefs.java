package com.portal.ServiceDesk.stepDefs;


import com.portal.ServiceDesk.support.WebModel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_stepDefs{


    WebModel webModel = new WebModel();

    @Given("^I am on login page$")
    public void i_am_on_login_page() throws ClassNotFoundException {
    webModel.getLoginPage().verifyPageTitle();
    }

    @When("^I enter \"([^\"]*)\" and \"([^\"]*)\" of CP$")
    public void i_enter_and_of_CP(String username, String password) throws ClassNotFoundException {
    webModel.getLoginPage().loginAsCP(username,password);
    }

    @Then("^I should be able to login successfully as CP$")
    public void i_should_be_able_to_login_successfully_as_CP() throws ClassNotFoundException {
    webModel.getLoginPage().verifyLogin("Adam");

    }

    @When("^I enter \"([^\"]*)\" and \"([^\"]*)\" of Reseller$")
    public void i_enter_and_of_Reseller(String username, String password) throws ClassNotFoundException{
        webModel.getLoginPage().loginAsReseller(username,password);
    }
    @Then("^I should be able to login successfully as Reseller$")
    public void i_should_be_able_to_login_successfully_as_Reseller() throws ClassNotFoundException {
        webModel.getLoginPage().verifyLogin("Adam");

    }

    @When("^I enter \"([^\"]*)\" and \"([^\"]*)\" of Agent$")
    public void i_enter_and_of_Agent(String username, String password) throws ClassNotFoundException {
        webModel.getLoginPage().loginAsAgent(username,password);
    }
    @Then("^I should be able to login successfully as Agent$")
    public void i_should_be_able_to_login_successfully_as_Agent() throws ClassNotFoundException {
        webModel.getLoginPage().verifyLogin("Sukhn");

    }
}
