package com.chitale.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;
    private final By signInButton1  = By.xpath("//button[@type='button']");
    private final By emailId = By.xpath("//input[@id='j_username']");
    private final By password = By.xpath("//input[@id='j_password']");
    private final By logonButton= By.xpath("//input[@id='loginButton']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getLoginPageTitle() {
        return driver.getTitle();
    }

    public void clickOnLogin1() {
        driver.findElement(signInButton1).click();
    }

    public void enterUserName(String username) {
        driver.findElement(emailId).sendKeys("supervisor");
    }

    public void enterPassword(String pwd) {
        driver.findElement(password).sendKeys("Sangli1");
    }

    public void clickOnLogonButton() {
        driver.findElement(logonButton).click();
    }

    public void loginToApplication(String userName, String pwd) {
        System.out.println("login with: " + userName + " and " + pwd);
        driver.findElement(signInButton1).click();
        driver.findElement(emailId).sendKeys(userName);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(logonButton).click();
    }
}
