package com.chitale.stepdefinitions;

import com.chitale.factory.DriverFactory;
import com.chitale.pageobjects.LicenseTypePage;
import com.chitale.pageobjects.UnitPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LicenseTypeSteps {

    private final LicenseTypePage LicTypePage = new LicenseTypePage(DriverFactory.getDriver());

    @And("User click on License Type tab")
    public void user_click_on_license_type_tab() {
        LicTypePage.clickOnLicenseType();
    }
    @And("User click on Create New button")
    public void user_click_on_create_new_button() {
        LicTypePage.clickOnCreateNewBtn();
    }
    @When("User enter License Type details")
    public void user_enter_license_type_details() {
        LicTypePage.enterLicenseName();
        LicTypePage.enterDescription();
    }
    @Then("User Click on Send For Acceptance button of License Type")
    public void user_click_on_send_for_acceptance_button_of_license_type() {
        LicTypePage.clickOnsendForAcceptance();
    }
}
