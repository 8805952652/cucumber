package com.chitale.stepdefinitions;

import com.chitale.factory.DriverFactory;
import com.chitale.pageobjects.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPageSteps {

    private static String title;
    private final LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

    @Given("User is on login page")
    public void user_is_on_login_page() {
        DriverFactory.getDriver().get("https://www.saucedemo.com/");
    }

    @When("User gets the title of the page")
    public void user_gets_the_title_of_the_page() {
        title = loginPage.getLoginPageTitle();
        System.out.println("Page title is: " + title);
    }

    @Then("Page title should be {string}")
    public void page_title_should_be(String expectedTitleName) {
        Assert.assertTrue(title.contains(expectedTitleName));
    }

    @When("User enters username {string}")
    public void user_enters_username(String username) {
        loginPage.enterUserName(username);
    }

    @When("User enters password {string}")
    public void user_enters_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("User clicks on Login button")
    public void user_clicks_on_login_button() {
        loginPage.clickOnLogin();
    }
}
