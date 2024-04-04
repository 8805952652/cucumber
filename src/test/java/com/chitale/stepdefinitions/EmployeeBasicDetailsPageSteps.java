package com.chitale.stepdefinitions;

import com.chitale.factory.DriverFactory;
import com.chitale.pageobjects.BankPage;
import com.chitale.pageobjects.EmployeeBasicDetailsPage;
import com.chitale.pageobjects.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeBasicDetailsPageSteps {

    private final EmployeeBasicDetailsPage EmpBasDet = new EmployeeBasicDetailsPage(DriverFactory.getDriver());
    private final LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @Then("User click on Admin tab .")
    public void User_click_on_Admin_tab() throws InterruptedException {
        Thread.sleep(8000);
        EmpBasDet.clickOnAdmin();

    }

    @Then("User click on Employee tab")
    public void user_click_on_employee_tab() {
        EmpBasDet.clickOnEmployee();

    }

    @Then("User click on Basic Details tab")
    public void user_click_on_basic_details_tab() {
        EmpBasDet.clickOnBasicDetails();
    }

    @When("User gets employee list")
    public void user_gets_employee_list() {
        System.out.println("Employee List");

    }

    @Then("click on Create New button of Employee basic details")
    public void click_on_create_new_button_of_employee_basic_details() {
        EmpBasDet.clickOnCreatNew();

    }

    @When("User enter Essential Information fields")
    public void user_enter_essential_information_fields() {
        EmpBasDet.clickOnAdmin();
        EmpBasDet.selectBranchName();
        EmpBasDet.enterUnicodeName();
        EmpBasDet.selectDepartmentName();
        EmpBasDet.selectDesignationName();
        EmpBasDet.selectEmployeeType();
        EmpBasDet.enterRollNumber();
        EmpBasDet.enterEmployeeFullName();
        EmpBasDet.enterMarathiName();
        EmpBasDet.enterUnicodeName();
        EmpBasDet.enterFatherName();
        EmpBasDet.enterMotherName();
        EmpBasDet.enterMobileNumber();
        EmpBasDet.enterEmployeeEmailAddress();
        EmpBasDet.enterDomainEmailAddress();
        EmpBasDet.enterAadharNumber();
        EmpBasDet.enterPanNumber();
        EmpBasDet.enterPFNumber();
        EmpBasDet.enterPFStartDate();
        EmpBasDet.enterUANNumber();
        EmpBasDet.enterESICNumber();
        EmpBasDet.selectQualification();
        EmpBasDet.selectBloodGroup();
        EmpBasDet.enterPhysicalIDMark();
        EmpBasDet.selectGender();
        EmpBasDet.selectMarriedStatus();
        EmpBasDet.enterSpouseName();
        EmpBasDet.selectStatus();
        EmpBasDet.clickOnNextButton();


    }

    @Then("User click on Next button")
    public void user_click_on_next_button() {

    }

    @Then("User enter Address Details Fields")
    public void user_enter_address_details_fields() {

    }


}