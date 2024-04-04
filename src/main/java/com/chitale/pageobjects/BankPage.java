package com.chitale.pageobjects;

import com.chitale.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class BankPage {

    private CommonObjects obj = new CommonObjects();
    private WebDriver driver;
    private ConfigReader config = new ConfigReader();
    ;
    private Properties prop = config.initProps();
    private final By adminButton = By.xpath("//span[normalize-space()='Admin']");
    private final By bank = By.xpath("//span[normalize-space()='Bank']");

    private final By createNewBtn = By.xpath("//button[normalize-space()='Create New']");
    private final By bankName = By.xpath("//input[@id='bank_name']");

    private final By bankAccountNo = By.xpath("//input[@id='bank_account_number']");
    private final By branchName = By.xpath("//input[@id='bank_branch_name'] ");
    private final By IFSCCode = By.xpath("//input[@id='bank_ifsc_code']");

    private final By MICRCode = By.xpath("//input[@id='bank_micr_code']");

    private final By swiftCode = By.xpath("//input[@id='bank_swift_code']");
    private final By accountType = By.xpath("//select[@id='bank_account_type']");

    private final By currency = By.xpath("//select[@id='bank_currency']");

    private final By branchAddress = By.xpath("//textarea[@id='bank_branch_address']");
    private final By transactionType = By.xpath("//select[@id='bank_transaction_type']");
    private final By activeStatus = By.xpath("//input[@id='bank_status_1']");
    private final By inactiveStatus = By.xpath("//input[@id='bank_status_0']");

    private final By sendForAcceptance = By.xpath("//button[normalize-space()='Send For Acceptance']");


    public BankPage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickOnAdmin() {
        driver.findElement(adminButton).click();
    }

    public void clickOnBank() {
        obj.waitForVisiblityOfElement(driver, 10, driver.findElement(bank));
    }

    public void clickOnCreatNew() {
        obj.waitForVisiblityOfElement(driver, 10, driver.findElement(createNewBtn));
    }

    public void enterBankName() {
        driver.findElement(bankName).sendKeys(prop.getProperty("Bank_Name"));
    }


    public void enterBankAccountNo() {
        driver.findElement(bankAccountNo).sendKeys(prop.getProperty("Account_Number"));
    }

    public void enterBranchName() {
        driver.findElement(branchName).sendKeys(prop.getProperty("Branch_Name"));
    }

    public void enterIFSCCode() {
        driver.findElement(IFSCCode).sendKeys(prop.getProperty("IFSC_Code"));
    }

    public void enterMICRCode() {
        driver.findElement(MICRCode).sendKeys(prop.getProperty("MICR_Code"));}
    public void enterSwiftCode() {
        driver.findElement(swiftCode).sendKeys("Swift_Code");}
    public void selectAccountType() {
        WebElement Type = driver.findElement(By.xpath("//select[@id='bank_account_type']"));
        obj.waitForVisibilityOfElementWithoutClick(driver, 10, Type);
        Select sc = new Select(Type);
        sc.selectByVisibleText(prop.getProperty("Account_Type"));
    }
    public void selectCurrency() {
        WebElement Currency = driver.findElement(By.xpath("//select[@id='bank_currency']"));
        obj.waitForVisibilityOfElementWithoutClick(driver, 10, Currency);
        Select sc = new Select(Currency);
        sc.selectByVisibleText(prop.getProperty("Currency"));
    }
    public void enterBranchAddress() {
        driver.findElement(branchAddress).sendKeys("Branch_Address");}

    public void selectTransactionType() {
        WebElement TransactionType  = driver.findElement(By.xpath("//select[@id='bank_transaction_type']"));
        obj.waitForVisibilityOfElementWithoutClick(driver, 10, TransactionType);
        Select sc = new Select(TransactionType);
        sc.selectByVisibleText(prop.getProperty("Transaction_Type"));
    }
    public void selectActiveStatus() {
        driver.findElement(activeStatus).click();}
    public void selectInactiveStatus() {
        driver.findElement(inactiveStatus).click();}

    public void clickOnSendForAcceptance (){
        driver.findElement(sendForAcceptance).click();
    }

}
