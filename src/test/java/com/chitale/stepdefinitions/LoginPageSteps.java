package com.chitale.stepdefinitions;

import com.chitale.factory.DriverFactory;
import com.chitale.pageobjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {

    private static String title;
    private final LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @Given("User is on login page")
    public void user_is_on_login_page() {

        DriverFactory.getDriver().get("https://erpqa.chitalegroup.co.in/");
    }




    @When("User gets the title of the page")
    public void user_gets_the_title_of_the_page() {
        title = loginPage.getLoginPageTitle();
        System.out.println("Page title is: " + title);
    }

    @When("User enters username {string}")
    public void user_enters_username(String username) {
        loginPage.enterUserName("supervisor");
    }

    @When("User enters password {string}")
    public void user_enters_password(String password ) {
        loginPage.enterPassword("Sangli1");
    }

    @Then("User clicks on Login button")
    public void user_clicks_on_login_button() {
        loginPage.clickOnLoginButton();
    }

    @Given("the user is on the homepage")
    public void theUserIsOnTheHomepage() {
    }
}





