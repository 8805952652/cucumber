package com.chitale.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private final By emailId = By.id("user-name");
    private final By password = By.id("password");
    private final By signInButton = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getLoginPageTitle() {
        return driver.getTitle();
    }

    public void enterUserName(String username) {
        driver.findElement(emailId).sendKeys(username);
    }

    public void enterPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
    }

    public void clickOnLogin() {
        driver.findElement(signInButton).click();
    }

    public void loginToApplication(String userName, String pwd) {
        System.out.println("login with: " + userName + " and " + pwd);
        driver.findElement(emailId).sendKeys(userName);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(signInButton).click();
    }
}
