package com.chitale.stepdefinitions;

import com.chitale.factory.DriverFactory;
import com.chitale.pageobjects.LicensePage;
import com.chitale.pageobjects.LicenseTypePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LicenseSteps {

    private final LicensePage LicPage = new LicensePage(DriverFactory.getDriver());

    @And("User click on License tab")
    public void user_click_on_license_type_tab() {
        LicPage.clickOnLicense();
    }
    @And("User click on Create New Button")
    public void user_click_on_create_new_button() {

        LicPage.clickOnCreateNewBtn();
    }
    @When("User enter License details")
    public void user_enter_license_type_details() {
        LicPage.selectBranchName();
        LicPage.selectUnitName();
        LicPage.selectLicenseType();
        LicPage.enterLicenseNumb();
        LicPage.selectLicenseStartDate();
        LicPage.selectLicenseEndDate();

    }
    @Then("User Click on Send For Acceptance button of License")
    public void user_click_on_send_for_acceptance_button_of_license_type() {
        LicPage.clickOnSendForAcceptance();
    }

}
