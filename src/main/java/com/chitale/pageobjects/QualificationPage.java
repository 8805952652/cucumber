package com.chitale.pageobjects;

import com.chitale.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Properties;


public class QualificationPage {

    private CommonObjects obj = new CommonObjects();
    private WebDriver driver;
    private ConfigReader config = new ConfigReader();
    ;
    private Properties prop = config.initProps();
    private final By adminButton = By.xpath("//span[normalize-space()='Admin']");
    private final By qualificationTab = By.xpath("//span[normalize-space()='Qualification']");

    private final By createNewBtn = By.xpath("//button[normalize-space()='Create New']");
    private final By qualification = By.xpath("//input[@id='qualification']");

    private final By specialization = By.xpath("//input[@id='specialization']");

    private final By sendForAcceptance = By.xpath("//button[normalize-space()='Send For Acceptance']");


    public QualificationPage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickOnAdmin() {
        driver.findElement(adminButton).click();
    }

    public void clickOnQualification() {
        obj.waitForVisiblityOfElement(driver, 10, driver.findElement(qualificationTab)); }

    public void clickOnCreatNew() {
        obj.waitForVisiblityOfElement(driver, 10, driver.findElement(createNewBtn));
    }

    public void enterQualificationName() {
        driver.findElement(qualification).sendKeys(prop.getProperty("Qualification"));}

    public void enterSpecializationName() {
        driver.findElement(specialization).sendKeys(prop.getProperty("Specialization"));}

    public void clickOnSendForAcceptance (){
        driver.findElement(sendForAcceptance).click();
    }

}
