package com.chitale.pageobjects;

import com.chitale.utils.ConfigReader;
import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Properties;

public class LicensePage {

    private WebDriver driver;
    private ConfigReader config = new ConfigReader();;
    private Properties prop = config.initProps();
    private final By LicenseBtn = By.xpath("//span[normalize-space()='License']");
    private final By createNewBtn = By.xpath("//button[normalize-space()='Create New']");
    private final By branchName = By.xpath("//select[@id='branch']");
    private final By unitName = By.xpath("//select[@id='unit']");
    private final By licenseType = By.xpath("//select[@id='license_type']");
    private final By licenseNumb = By.xpath("//input[@id='license_number']");
    private final By startDate = By.xpath("//div[contains(@role,'dialog')]//div[3]//div[1]//div[1]//div[1]//input[1]");
    private final By StartDateToday = By.xpath("//a[normalize-space()='Today']");
    private final By endDate = By.xpath("//div[@class='col-md-4']//div//div[@class='ant-picker-input']");
    private final By endDateToday = By.xpath("//a[normalize-space()='Today']");
    private final By activeStatus = By.xpath("//input[@id='license_status_1']");
    private final By inctiveStatus = By.xpath("//input[@id='license_status_0']");
    private final By sendForAcceptance = By.xpath("//button[normalize-space()='Send For Acceptance']");


    public LicensePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnLicense (){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(LicenseBtn).click();
    }
    public void clickOnCreateNewBtn (){driver.findElement(createNewBtn).click();}
    public void selectBranchName (){
        WebElement ele = driver.findElement(branchName);
        Select sel = new Select (ele);
        sel.selectByVisibleText(prop.getProperty("L_Branch_Name"));
    }
    public void selectUnitName (){
        WebElement ele = driver.findElement(unitName);
        Select sel = new Select (ele);
        sel.selectByVisibleText(prop.getProperty("L_Unit_Name"));
    }
    public void selectLicenseType (){
        WebElement ele = driver.findElement(licenseType);
        Select sel = new Select (ele);
        sel.selectByVisibleText(prop.getProperty("License_Type"));
    }
    public void enterLicenseNumb (){
        driver.findElement(licenseNumb).sendKeys(prop.getProperty("License_Number"));
    }

    public void selectLicenseStartDate() {
        driver.findElement(startDate).click();
        driver.findElement(By.xpath("//button[normalize-space()='Feb']")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement yearElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='2024']")));
        String desiredYear = prop.getProperty("Start_Year");
        while (true) {
            String currentYear = yearElement.getText();
            if (desiredYear.equals(currentYear)) {
                break;
            } else {
                driver.findElement(By.xpath("//button[@class='ant-picker-header-super-prev-btn']")).click();
            }
        }
        String month = prop.getProperty("Start_Month");
        driver.findElement(By.xpath("//div[normalize-space()='"+month+"']")).click();
       String full_date = prop.getProperty("Start_Full_Date");
        String Date = prop.getProperty("Start_Date");
        driver.findElement(By.xpath("//td[@title='"+full_date+"']//div[@class='ant-picker-cell-inner'][normalize-space()='"+Date+"']")).click();
    }
    public void selectLicenseEndDate() {
        driver.findElement(endDate).click();
        driver.findElement(By.xpath("//button[normalize-space()='Feb']")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement endYearElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='2024']")));
        String desiredYear = prop.getProperty("End_Year");
        while (true) {
            String eDCurrentYear = endYearElement.getText();
            if (desiredYear.equals(eDCurrentYear)) {
                break;
            } else {
                driver.findElement(By.xpath("//button[@class='ant-picker-header-super-prev-btn']")).click();
            }
        }
        String end_Month = prop.getProperty("End_Month");
        driver.findElement(By.xpath("//div[normalize-space()='"+end_Month+"']")).click();
        String end_full_date = prop.getProperty("End_Full_Date");
        String Date = prop.getProperty("End_Date");
        driver.findElement(By.xpath("//td[@title='"+end_full_date+"']//div[@class='ant-picker-cell-inner'][normalize-space()='"+Date+"']")).click();
        //td[@title='2024-12-31']//div[@class='ant-picker-cell-inner'][normalize-space()='31']
    }
    public void clickOnSendForAcceptance (){
        driver.findElement((sendForAcceptance)).click();
    }

    }











    

