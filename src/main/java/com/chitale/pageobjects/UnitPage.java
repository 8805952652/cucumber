package com.chitale.pageobjects;

import com.chitale.factory.DriverFactory;
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

public class UnitPage {

    private CommonObjects obj = new CommonObjects();
    private ConfigReader config = new ConfigReader();;
    private Properties prop = config.initProps();
    private WebDriver driver;
    private final By unitBtn = By.xpath("//span[normalize-space()='Unit']");
    private final By createNewBtn = By.xpath("//button[normalize-space()='Create New']");
    private final By branch = By.xpath("//select[@id='branch']");
    private final By unitName = By.xpath("//input[@id='unit_name']");
    private final By initial = By.xpath("//input[@id='unit_initial']");
    private final By unitIntake = By.xpath("//input[@id='unit_intake']");
    private final By unitStartDate = By.xpath("//div[@class='ant-picker input-control ']");
    private final By todayDate = By.xpath("//a[normalize-space()='Today']");
    private final By fssaiNo = By.xpath("//input[@id='unit_fssai_number']");
    private final By phoneNumber=By.xpath("//input[@id='unit_phone_number']");
    private final By faxNumber = By.xpath("//input[@id='unit_fax_number']");
    private final By emailAddress = By.xpath("//input[@id='unit_email_address']");
    private final By labelType = By.xpath("//select[@id='unit_label_type']");
    private final By initailRollNo = By.xpath("//input[@id='unit_initial_roll_number']");
    private final By factoryLicenceNo = By.xpath("//input[@id='unit_factory_license_number']");
    private final By activeStatus = By.xpath("//input[@id='unit_status_1']");
    private final By inactiveStatus = By.xpath("//input[@id='unit_status_0']");
    private final By address = By.xpath("//textarea[@id='unit_address']");
    private final By city = By.xpath("//input[@id='unit_city']");
    private final By country = By.xpath("//select[@id='country']");
    private final By state = By.xpath("//select[@id='state']");
    private final By district = By.xpath("//select[@id='dist']");
    private final By tehsil = By.xpath("//select[@id='subdst']");
    private final By pinCode = By.xpath("//input[@id='unit_pincode']");
    private final By sendForAcceptance = By.xpath("//button[normalize-space()='Send For Acceptance']");
    public UnitPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickUnitBtn ()  {
        driver.findElement(unitBtn).click();
        }
    public void clickOnCreateNewBtn(){
        obj.waitForVisiblityOfElement(driver, 10, driver.findElement(createNewBtn));
    }

    public void selectBranchName(){
        WebElement ele = driver.findElement(branch);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Select sc = new Select(ele);
        sc.selectByVisibleText(prop.getProperty("U_Branch_Name"));
    }

    public void enterUnitName (){driver.findElement(unitName).sendKeys(prop.getProperty("U_Unit_Name"));}
    public void enterInitial (){
        driver.findElement(initial).sendKeys(prop.getProperty("U_Initial"));
    }
    public void enterUnitIntake() {
        driver.findElement(unitIntake).sendKeys(prop.getProperty("Unit_Intake"));
    }

//    public void enterUnitStartDate(){
//        driver.findElement(unitStartDate).click();
//        driver.findElement(todayDate).click();
//    }
public void enterUnitStartDate() {
    driver.findElement(unitStartDate).click();
    driver.findElement(By.xpath("//button[normalize-space()='Feb']")).click();
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    WebElement yearElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='2024']")));
    String desiredYear = prop.getProperty("U_Start_Year");
    while (true) {
        String currentYear = yearElement.getText();
        if (desiredYear.equals(currentYear)) {
            break;
        } else {
            driver.findElement(By.xpath("//button[@class='ant-picker-header-super-prev-btn']")).click();
        }
    }
    String month = prop.getProperty("U_Start_Month");
    driver.findElement(By.xpath("//div[normalize-space()='"+month+"']")).click();
    String full_date = prop.getProperty("U_Start_Full_Date");
    String Date = prop.getProperty("U_Start_Date");
    driver.findElement(By.xpath("//td[@title='"+full_date+"']//div[@class='ant-picker-cell-inner'][normalize-space()='"+Date+"']")).click();
}
    public void enterFSSAINo(){
        driver.findElement(fssaiNo).sendKeys(prop.getProperty("U_FSSAI_Number"));
    }
    public void enterPhoneNumber (){
        driver.findElement(phoneNumber).sendKeys(prop.getProperty("U_Phone_Number"));
    }
    public void enterFaxNumber (){
        driver.findElement(faxNumber).sendKeys(prop.getProperty("U_Fax_Number"));
    }
    public void enterEmailAddress (){
        driver.findElement(emailAddress).sendKeys(prop.getProperty("U_Email_Address"));
    }

    public void selectLabelType (){
        WebElement ele = driver.findElement(labelType);
        Select sc = new Select(ele);
        sc.selectByVisibleText(prop.getProperty("U_Label_Type"));
    }
    public void enterInitailRollNumber(){
        driver.findElement(initailRollNo).sendKeys(prop.getProperty("U_Initial_Roll_Number"));
    }
    public void enterFactoryLicenceNumber(){
        driver.findElement(factoryLicenceNo).sendKeys(prop.getProperty("U_Factory_License_Number"));
    }
    public void selectStatus(){
        driver.findElement(activeStatus).click();
    }
    public void enterAddress(){
        driver.findElement(address).sendKeys(prop.getProperty("U_Address"));
    }
    public void enterCity(){
        driver.findElement(city).sendKeys(prop.getProperty("U_City"));
    }

    public void selectCountry(){
        WebElement ele =driver.findElement(country);
        Select sc = new Select(ele);
        sc.selectByVisibleText(prop.getProperty("U_Country"));
    }
    public void selectSate(){
        WebElement ele =driver.findElement(state);
        Select sc = new Select(ele);
        sc.selectByVisibleText(prop.getProperty("U_State"));
    }
    public void selectDistrict(){
        WebElement ele =driver.findElement(district);
        Select sc = new Select(ele);
        sc.selectByVisibleText(prop.getProperty("U_District"));
    }
    public void selectTehsil(){
        WebElement ele =driver.findElement(tehsil);
        Select sc = new Select(ele);
        sc.selectByVisibleText(prop.getProperty("U_Tehsil"));
    }
    public void enterPinCode(){
        driver.findElement(pinCode).sendKeys(prop.getProperty("U_Pincode"));
    }
    public void clickOnSendForAcceptance (){
        driver.findElement(sendForAcceptance).click();
    }
}
