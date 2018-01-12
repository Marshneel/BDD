package com.portal.ServiceDesk.stepDefs;

import com.portal.ServiceDesk.support.WebModel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Log_OpenReach_Incident_stepDefs {
    WebModel webModel = new WebModel();

    @Given("^I search by \"([^\"]*)\"$")
    public void i_search_by(String CLI) throws Throwable {
        webModel.getServiceDeskPage().searchByCLI(CLI);


    }

    @Then("^I should be able to log Openreach Incident$")
    public void i_should_be_able_to_log_Openreach_Incident() throws Throwable {

    }
}
