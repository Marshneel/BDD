package com.portal.ServiceDesk.stepDefs;

import com.portal.ServiceDesk.support.WebModel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Caller_Details_stepDefs {
    WebModel webModel = new WebModel();

    @Given("^I search by Account Number$")
    public void i_search_by_Account_Number() throws Throwable {
        webModel.getDashBoardPage().loginServiceDesk();
        webModel.getServiceDeskPage().searchByAccountNumber("Adam As A Reseller");
    }

    @When("^I click on Log an Incident$")
    public void i_click_on_Log_an_Incident() throws Throwable {
        webModel.getServiceDeskPage().verifyLogButton();
    }

    @Then("^I should be able to select Contact with telephone number$")
    public void i_should_be_able_to_select_Contact_with_telephone_number() throws Throwable {
        webModel.getContactDetailsPage().contactPageValidations();
        webModel.getContactDetailsPage().selectContactWithTelephone("Jeanette Staton (jeanette.staton@spectrum-coms.co.uk)");
    }

    @Then("^I should be able to select Contact without telephone number$")
    public void i_should_be_able_to_select_Contact_without_telephone_number() throws Throwable {
        webModel.getContactDetailsPage().contactPageValidations();
        webModel.getContactDetailsPage().selectContactWithoutTelephone("Adam Reed (adam.reed@unionstreet.uk.com)");
    }

    @Then("^I should be able to select Third Party Contact$")
    public void i_should_be_able_to_select_Third_Party_Contact() throws Throwable {
        webModel.getContactDetailsPage().selectThirdPartyContact();
    }

}
