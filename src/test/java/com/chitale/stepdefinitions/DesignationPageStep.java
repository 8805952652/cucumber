package com.chitale.stepdefinitions;

import com.chitale.factory.DriverFactory;
import com.chitale.pageobjects.Designation;
import com.chitale.pageobjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DesignationPageStep {

    //private static String title;
    private final LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private final Designation desObj = new Designation(DriverFactory.getDriver());



    @Then("User do login")
    public void user_do_login() {
        loginPage.loginToApplication("Supervisor", "Sangli1");
    }


    @Then("User clicks on Admin button")
    public void user_clicks_on_Admin_button() throws InterruptedException {
        Thread.sleep(5000);
        desObj.clickOnAdminButton();
    }


    @Then("User clicks on Designation button")
    public void user_clicks_on_Designation_button() throws InterruptedException {
        Thread.sleep(5000);
        desObj.clickOnDesignationButton();
    }

    @Then("User clicks on Create New button")
    public void user_clicks_on_create_new_button() throws InterruptedException {
        Thread.sleep(5000);
        desObj.clickOnCreateNewButton();

    }

    @When("User enters Designation Name")
    public void user_enters_designation_name() throws InterruptedException{
        Thread.sleep(5000);
        desObj.enterDesignationName();
    }

    @And("User enters Description")
    public void user_enters_description() throws InterruptedException {
        Thread.sleep(5000);
        desObj.enterDescription();
    }

    @And("User enters Account Number")
    public void user_enters_account_number() throws InterruptedException {
        Thread.sleep(5000);
        desObj.enterAccountNumber();
    }

    @And("User selects Approval Authority")
    public void user_selects_approval_authority_as() throws InterruptedException {
        Thread.sleep(5000);
        desObj.clickOnApprovalAuthority();
    }

    @And("User selects Status")
    public void user_selects_status_as() throws InterruptedException {
        Thread.sleep(5000);
        desObj.clickOnActiveStatus();

    }

    @Then("User clicks on Send For Acceptance button")
    public void user_clicks_on_send_for_acceptance_button() throws InterruptedException {
        Thread.sleep(5000);
        desObj.clickOnSendForAcceptanceButton();
    }
}


