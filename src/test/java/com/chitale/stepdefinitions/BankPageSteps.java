package com.chitale.stepdefinitions;

import com.chitale.factory.DriverFactory;
import com.chitale.pageobjects.BankPage;
import com.chitale.pageobjects.FirmPage;
import com.chitale.pageobjects.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BankPageSteps {

    private final BankPage bankPage = new BankPage(DriverFactory.getDriver());
    private final LoginPage loginPage = new LoginPage(DriverFactory.getDriver());


    @When("User gets the title of the DashBoard Page")
    public void User_gets_the_title_of_the_DashBoardPage() {
        String Dash_title = DriverFactory.getDriver().getTitle();
        System.out.println("Dashboard Title id " + Dash_title);
    }

    @Then("User click on Admin tab")
    public void user_click_on_admin_tab() throws InterruptedException {

        Thread.sleep(8000);
        bankPage.clickOnAdmin();
    }

    @Then("User click on Bank tab")
    public void user_click_on_bank_tab() throws InterruptedException {
        Thread.sleep(5000);
        bankPage.clickOnBank();
    }

    @When("User gets bank list")
    public void user_gets_bank_list() {
        String firmList_title = DriverFactory.getDriver().getTitle();
        System.out.println("Firm_List Title id " + firmList_title);
    }

    @Then("User click on Create New button of bank")
    public void user_click_on_create_new_button_of_bank() throws InterruptedException {
        Thread.sleep(2000);
        bankPage.clickOnCreatNew();
    }

    @When("User enter bank details fields")
    public void user_enter_bank_details_fields() throws InterruptedException {
        Thread.sleep(1000);
        bankPage.enterBankName();
        bankPage.enterBankAccountNo();
        bankPage.enterBranchName();
        bankPage.enterIFSCCode();
        bankPage.enterMICRCode();
        bankPage.enterSwiftCode();
        bankPage.selectAccountType();
        bankPage.selectCurrency();
        bankPage.enterBranchAddress();
        bankPage.selectTransactionType();
        bankPage.selectActiveStatus();
//        bankPage.selectInactiveStatus();

    }

    @Then("Click on Send For Acceptance button")
    public void click_on_send_for_acceptance_button() {
        bankPage.clickOnSendForAcceptance();

    }
}