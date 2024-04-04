package com.chitale.stepdefinitions;

import com.chitale.factory.DriverFactory;
import com.chitale.pageobjects.BankPage;
import com.chitale.pageobjects.LoginPage;
import com.chitale.pageobjects.QualificationPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class QualificationPageSteps {

    private final QualificationPage qualPage = new QualificationPage(DriverFactory.getDriver());
    private final LoginPage loginPage = new LoginPage(DriverFactory.getDriver());


    @Then("User click on Admin tab.")
    public void user_click_on_admin_tab() throws InterruptedException {
        Thread.sleep(8000);
        qualPage.clickOnAdmin();
    }

    @Then("User click on qualification tab")
    public void user_click_on_qualification_tab() throws InterruptedException {
        Thread.sleep(5000);
        qualPage.clickOnQualification();
    }

    @When("User gets qualification list")
    public void user_gets_qualification_list() {
        String Qualification_List_title = DriverFactory.getDriver().getTitle();
        System.out.println("Qualification_List Title id " + Qualification_List_title);
    }

    @Then("User click on Create New button of qualification")
    public void user_click_on_create_new_button_of_qualification() throws InterruptedException {
        Thread.sleep(2000);
        qualPage.clickOnCreatNew();
    }

    @When("User enter qualification details fields")
    public void user_enter_qualification_details_fields() throws InterruptedException {
        Thread.sleep(1000);
        qualPage.enterQualificationName();
        qualPage.enterSpecializationName();
    }

    @Then("Click on Send For Acceptance button of qualification")
    public void click_on_send_for_acceptance_button_of_qualification() {
        qualPage.clickOnSendForAcceptance();

    }
}