package com.chitale.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Designation {

    private WebDriver driver;
    private final By signInButton1 = By.xpath("//button[normalize-space()='Log In']");
    private final By emailId = By.xpath("//input[@id='j_username']");
    private final By password = By.xpath("//input[@id='j_password']");
    private final By logonButton = By.xpath("//input[@id='loginButton']");
    private final By AdminButton = By.xpath("//span[normalize-space()='Admin']");

    private final By DesignationButton = By.xpath("//span[normalize-space()='Designation']");

    private final By CreateNewButton = By.xpath("//button[contains(text(),'Create New')]");

    private final By DesignationName = By.xpath("//input[@id='desg_name']");

    private final By Description = By.xpath("//textarea[@id='desg_description']");

    private final By AccountNumber = By.name("desg_account_number");

    private final By Authority = By.id("desg_approval_authority_1");

    private final By approvalAuthorityBtn = By.xpath("//input[@id='desg_approval_authority_1']");
    private final By yesBtn = By.xpath("//input[@id='desg_status_1']");

    private final By sendForAcceptanceBtn = By.xpath("//button[normalize-space()='Send For Acceptance']");


    public Designation(WebDriver driver) {
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

    public void clickOnAdminButton() {
        driver.findElement(AdminButton).click();
    }


    public void clickOnDesignationButton() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(DesignationButton).click();
    }
    public void clickOnCreateNewButton() {
        driver.findElement(CreateNewButton).click();
    }

    public void enterDesignationName() {
        driver.findElement(DesignationName).sendKeys("Testing57");
    }

    public void enterDescription() {
            driver.findElement(Description).sendKeys("Testing");

    }
    public void enterAccountNumber() {
        driver.findElement(AccountNumber).sendKeys("45645");

    }
    public void clickOnActiveStatus() {driver.findElement(yesBtn).click();

    }
    public void clickOnApprovalAuthority() {
        driver.findElement(approvalAuthorityBtn).click();

    }
    public void clickOnSendForAcceptanceButton() {
        driver.findElement(sendForAcceptanceBtn).click();

    }

    public void loginToApplication (String userName, String pwd){
        System.out.println("login with: " + userName + " and " + pwd);
        driver.findElement(signInButton1).click();
        driver.findElement(emailId).sendKeys(userName);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(logonButton).click();
        driver.findElement(AdminButton).click();
        driver.findElement(DesignationButton).click();
        driver.findElement(CreateNewButton).click();
        driver.findElement(DesignationName).sendKeys();
        driver.findElement(Description).sendKeys();
        driver.findElement(AccountNumber).sendKeys();
        driver.findElement(Authority).click();
        driver.findElement(yesBtn).click();
        driver.findElement(sendForAcceptanceBtn).click();





    }
}



