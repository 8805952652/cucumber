package com.chitale.stepdefinitions;

import com.chitale.factory.DriverFactory;
import com.chitale.pageobjects.BranchPage;
import com.chitale.pageobjects.UnitPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UnitPageSteps {

    private final UnitPage unitPage = new UnitPage(DriverFactory.getDriver());

    @And("User click on Unit tab")
    public void user_click_on_unit_tab() throws InterruptedException {
        Thread.sleep(5000);
        unitPage.clickUnitBtn();
    }

    @And("User click on Create Unit button")
    public void user_click_on_create_unit_button() {
        unitPage.clickOnCreateNewBtn();
    }

    @When("User enter Unit details")
    public void user_enter_branch_details()  {
        unitPage.selectBranchName();
        unitPage.enterUnitName();
        unitPage.enterInitial();
        unitPage.enterUnitIntake();
        unitPage.enterUnitStartDate();
        unitPage.enterFSSAINo();
        unitPage.enterPhoneNumber();
        unitPage.enterFaxNumber();
        unitPage.enterEmailAddress();
        unitPage.selectLabelType();
        unitPage.enterInitailRollNumber();
        unitPage.enterFactoryLicenceNumber();
        unitPage.selectStatus();
        unitPage.enterAddress();
        unitPage.enterCity();
        unitPage.selectCountry();
        unitPage.selectSate();
        unitPage.selectDistrict();
        unitPage.selectTehsil();
        unitPage.enterPinCode();

    }
    @Then("User Click on Send For Acceptance button of Unit")
    public void user_click_on_send_for_acceptance_button_of_unit() {
        unitPage.clickOnSendForAcceptance();

    }
}
