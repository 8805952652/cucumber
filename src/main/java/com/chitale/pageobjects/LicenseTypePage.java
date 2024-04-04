package com.chitale.pageobjects;

import com.chitale.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.Properties;

public class LicenseTypePage {

    private ConfigReader config = new ConfigReader();;
    private Properties prop = config.initProps();
    private WebDriver driver;
    private final By licenseTypeTab = By.xpath("//span[normalize-space()='License Type']");
    private final By createNewBtn = By.xpath("//button[normalize-space()='Create New']");

    private final By licenseName = By.xpath("//input[@id='license_name']");
    private final By description = By.xpath("//textarea[@id='description']");
    private final By sendForAcceptance = By.xpath("//button[normalize-space()='Send For Acceptance']");


    public LicenseTypePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnLicenseType () {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(licenseTypeTab).click();
    }
    public void clickOnCreateNewBtn (){
        driver.findElement(createNewBtn).click();
    }
    public void enterLicenseName (){
        driver.findElement(licenseName).sendKeys(prop.getProperty("License_Name"));
    }
    public void enterDescription (){
        driver.findElement(description).sendKeys(prop.getProperty("License_Description"));
    }
    public void clickOnsendForAcceptance (){
        driver.findElement(sendForAcceptance).click();
    }
}
