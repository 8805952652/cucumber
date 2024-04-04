package com.chitale.stepdefinitions;

import com.chitale.factory.DriverFactory;
import com.chitale.pageobjects.BranchPage;
import com.chitale.pageobjects.FirmPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BranchPageSteps {

    private final BranchPage branchPage = new BranchPage(DriverFactory.getDriver());
    @And("User click on branch button")
    public void user_click_on_branch_button() throws InterruptedException {
        Thread.sleep(3000);
        branchPage.clickOnBranchBtn();

    }
    @And("User click on Create Branch button")
    public void user_click_on_create_branch_button() throws InterruptedException {
        Thread.sleep(2000);
        branchPage.clickOnCreateNewBtn();

    }
    @When("User enter branch details")
    public void user_enter_branch_details() throws InterruptedException {
        branchPage.enterBranchName();
        branchPage.enterBranchStartDate();
        branchPage.enterInitail();
        branchPage.enterFSSAI();
        branchPage.enterPhoneNumber();
        branchPage.enterFaxNumber();
        branchPage.enterEmailAddress();
        branchPage.enterAddress();
        branchPage.enterCity();
        branchPage.selectCountry();
        branchPage.selectSate();
        branchPage.selectDistrict();
        branchPage.selectTehsil();
        branchPage.enterPinCode();

    }
    @Then("User Click on Send For Acceptance button")
    public void user_click_on_send_for_acceptance_button() {
        branchPage.clickOnSendForAcceptance();

    }
}
