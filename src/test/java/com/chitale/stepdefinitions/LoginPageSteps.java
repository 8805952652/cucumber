package com.chitale.stepdefinitions;

import com.chitale.factory.DriverFactory;
import com.chitale.pageobjects.LoginPage;
import com.chitale.utils.ConfigReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Properties;

public class LoginPageSteps {

    private static String title;
    private final LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private ConfigReader config = new ConfigReader();;
    private Properties prop = config.initProps();

    @Given("User is on login page")
    public void user_is_on_login_page() {
        DriverFactory.getDriver().get(prop.getProperty("app.url"));
    }


    @Then("User clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.clickOnLogin1();
    }

    @When("User gets the title of the page")
    public void user_gets_the_title_of_the_page()  {
        title = loginPage.getLoginPageTitle();
        System.out.println("Page title is: " + title);
    }

    @Then("Page title should be {string}")
    public void page_title_should_be(String expectedTitleName)  {
        Assert.assertTrue(title.contains(expectedTitleName));
    }

    @When("User enters username {string}")
    public void user_enters_username(String username)  {
        loginPage.enterUserName(username);
    }


    @When("User enters password {string}")
    public void user_enters_password(String password)  {
        loginPage.enterPassword(password);

    }

    @Then("User Do Login")
    public void user_do_login (){
        loginPage.loginToApplication();
    }
//
    @Then("User clicks on logon button")
    public void user_clicks_on_logon_button() throws InterruptedException {
        loginPage.clickOnLogonButton();
        Thread.sleep(10000);

    }

    }
