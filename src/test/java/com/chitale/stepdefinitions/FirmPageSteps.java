//package com.chitale.stepdefinitions;
//
//import com.chitale.factory.DriverFactory;
//import com.chitale.pageobjects.CommonObjects;
//
//import com.chitale.pageobjects.FirmPage;
//import com.chitale.pageobjects.LoginPage;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//public class FirmPageSteps {
//
//    private final FirmPage firmPage = new FirmPage(DriverFactory.getDriver());
//    private final LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
//
//
//    @When("User gets the title of the DashBoardPage")
//    public void User_gets_the_title_of_the_DashBoardPage() {
//        String Dash_title = DriverFactory.getDriver().getTitle();
//        System.out.println("Dashboard Title id " + Dash_title);
//    }
//
//    @Then("User click on Admin tab")
//    public void user_click_on_admin_tab() throws InterruptedException {
//        Thread.sleep(8000);
//        firmPage.clickOnAdmin();
//    }
//
//    @Then("User click on firm tab")
//    public void user_click_on_firm_tab() throws InterruptedException {
//
//        Thread.sleep(5000);
//        firmPage.clickOnFirm();
//    }
//
//    @When("User gets firm list")
//    public void user_gets_firm_list() {
//        String firmList_title = DriverFactory.getDriver().getTitle();
//        System.out.println("Firm_List Title id " + firmList_title);
//    }
//
//    @Then("click on Create New button")
//    public void click_on_create_new_button() throws InterruptedException {
//        Thread.sleep(2000);
//        firmPage.clickOnCreatNew();
//    }
//
//    @When("User enter basic details fields")
//    public void user_enter_basic_details_fields() throws InterruptedException {
//        firmPage.enterFirmName();
//        firmPage.enterShortName();
//        firmPage.enterInitial();
//        firmPage.enterPanNumber();
//        firmPage.enterStartDate();
//        firmPage.enterScope();
//        firmPage.selectFirmType();
//        Thread.sleep(3000);
//        firmPage.uploadLogo();
//
//    }
//
//    @Then("Click on Next button")
//    public void click_on_next_button() {
//        firmPage.clickOnNextBtn();
//
//    }
//}