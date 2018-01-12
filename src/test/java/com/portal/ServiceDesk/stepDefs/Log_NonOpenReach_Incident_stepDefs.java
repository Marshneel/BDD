package com.portal.ServiceDesk.stepDefs;

import com.portal.ServiceDesk.support.WebModel;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Log_NonOpenReach_Incident_stepDefs {
    WebModel webModel = new WebModel();

    @When("^I select Contact with telephone number$")
    public void i_select_Contact_with_telephone_number() throws Throwable {
        webModel.getContactDetailsPage().selectContactWithTelephone("Jeanette Staton (jeanette.staton@spectrum-coms.co.uk)");

    }

    @Then("^I should be able to log non openreach Incident$")
    public void i_should_be_able_to_log_non_openreach_Incident() throws Throwable {
        Assert.assertTrue(webModel.getIncidentDetailsPage().incidentPageValidation("Adam Reed"));
        webModel.getIncidentDetailsPage().nonOpenReachIncident("Billing Enquiries", "Account query", "Billing error", "1", "Last month error", "Extra 15 pounds");

    }

    @When("^I select Third Party Contact$")
    public void i_select_Third_Party_Contact() throws Throwable {
        webModel.getContactDetailsPage().selectThirdPartyContact();

    }
}
