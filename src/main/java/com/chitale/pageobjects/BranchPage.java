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

public class BranchPage {

    private ConfigReader config = new ConfigReader();;
    private Properties prop = config.initProps();
    private WebDriver driver;

    private final By branchBtn = By.xpath("//body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/a[1]");

    private final By createNewBtn = By.xpath("//button[normalize-space()='Create Branch']");

    private final By branchName = By.xpath("//input[@id='branch_name']");

    private final By branchStartdDate = By.xpath("//div[@class='ant-picker input-control ']");

    private final By todayDate = By.xpath("//a[normalize-space()='Today']");
    private final By initial = By.xpath("//input[@id='branch_initial']");
    private final By FSSAINumb = By.xpath("//input[@id='branch_fssai_number']");

    private final By phoneNumber = By.xpath("//input[@id='branch_phone_number']");

    private final By faxNumber = By.xpath("//input[@id='branch_fax_no']");

    private final By emailAddress = By.xpath("//input[@id='branch_email_id']");
    private final By address = By.xpath("//textarea[@id='branch_address']");
    private final By city = By.xpath("//input[@id='branch_city_name']");
    private final By country = By.xpath("//select[@id='cntry_id']");
    private final By state = By.xpath("//select[@id='state_id']");
    private final By district = By.xpath("//select[@id='dist_id']");
    private final By tehsil = By.xpath("//select[@id='subdst']");

    private final By pinCode = By.xpath("//input[@id='branch_pincode']");

    private final By sendfForAcceptance = By.xpath("//button[normalize-space()='Send For Acceptance']");

    public BranchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnBranchBtn ()  {
        driver.findElement(branchBtn).click();}
    public void clickOnCreateNewBtn(){driver.findElement(createNewBtn).click();}

    public void enterBranchName(){driver.findElement(branchName).sendKeys(prop.getProperty("B_Branch_Name"));}
//    public void enterBranchStartDate(){
//        driver.findElement(branchStartdDate).click();
//        driver.findElement(todayDate).click();}
    public void enterBranchStartDate() {
        driver.findElement(branchStartdDate).click();
        driver.findElement(By.xpath("//button[normalize-space()='Feb']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement yearElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='2024']")));
        String desiredYear = prop.getProperty("B_Start_Year");
        while (true) {
            String currentYear = yearElement.getText();
            if (desiredYear.equals(currentYear)) {
                break;
            } else {
                driver.findElement(By.xpath("//button[@class='ant-picker-header-super-prev-btn']")).click();
            }
        }
        String month = prop.getProperty("B_Start_Month");
        driver.findElement(By.xpath("//div[normalize-space()='"+month+"']")).click();
        String full_date = prop.getProperty("B_Start_Full_Date");
        String Date = prop.getProperty("B_Start_Date");
        driver.findElement(By.xpath("//td[@title='"+full_date+"']//div[@class='ant-picker-cell-inner'][normalize-space()='"+Date+"']")).click();
    }
    public void enterInitail (){driver.findElement(initial).sendKeys(prop.getProperty("B_Initial"));}
    public void enterFSSAI (){
        driver.findElement(FSSAINumb).sendKeys(prop.getProperty("B_FSSAI_Number"));
    }
    public void enterPhoneNumber() {
        driver.findElement(phoneNumber).sendKeys(prop.getProperty("B_Phone_Number"));
    }
    public void enterFaxNumber(){
        driver.findElement(faxNumber).sendKeys(prop.getProperty("B_Fax_Number"));
    }
    public void enterEmailAddress (){
        driver.findElement(emailAddress).sendKeys(prop.getProperty("B_Email_Address"));
    }
    public void enterAddress (){
        driver.findElement(address).sendKeys(prop.getProperty("B_Address"));
    }
    public void enterCity (){
        driver.findElement(city).sendKeys(prop.getProperty("B_City"));
    }
    public void selectCountry(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement ele =driver.findElement(country);
        Select sc = new Select(ele);
        sc.selectByVisibleText(prop.getProperty("B_Country"));
    }
    public void selectSate(){
        WebElement ele =driver.findElement(state);
        Select sc = new Select(ele);
        sc.selectByVisibleText(prop.getProperty("B_State"));
    }
    public void selectDistrict(){
        WebElement ele =driver.findElement(district);
        Select sc = new Select(ele);
        sc.selectByVisibleText(prop.getProperty("B_District"));
    }
    public void selectTehsil(){
        WebElement ele =driver.findElement(tehsil);
        Select sc = new Select(ele);
        sc.selectByVisibleText(prop.getProperty("B_Tehsil"));
    }
    public void enterPinCode(){
        driver.findElement(pinCode).sendKeys(prop.getProperty("B_Pincode"));
    }
    public void clickOnSendForAcceptance (){
        driver.findElement(sendfForAcceptance).click();
    }
}
