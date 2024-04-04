package com.chitale.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private final By signInButton = By.xpath("//button[normalize-space()='Log In']");
    private final By btnLogin = By.xpath("//input[@type='submit']");


    private final By emailId = By.xpath("//input[@id='j_username']");
    private final By password = By.xpath("//input[@id='j_password']");
    private final By logonButton = By.xpath("//input[@id='loginButton']");

    private final By btnAdmin = By.xpath("//span[normalize-space()='Admin']");

    private final By btnDesignation = By.xpath("//span[contains(text(),'Designation')]");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getLoginPageTitle() {
        return driver.getTitle();
    }

//    public void clickOnLoginButtonHomePage() {
//        driver.findElement().click();
//    }

   // public String getHomePage() { return driver.getHome(); }

    public void enterUserName(String username) {
        driver.findElement(emailId).sendKeys(username);
    }

    public void enterPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
    }

    public void clickOnLoginButton() {
        driver.findElement(btnLogin).click();
    }

    public void clickOnAdminButton() { driver.findElement(btnAdmin).click(); }

    public void clickOnDesignationButton() { driver.findElement(btnDesignation).click(); }


    public void loginToApplication(String userName, String pwd) {
        System.out.println("login with: " + userName + " and " + pwd);
        driver.findElement(signInButton).click();

        driver.findElement(emailId).sendKeys(userName);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(logonButton).click();


    }
}
