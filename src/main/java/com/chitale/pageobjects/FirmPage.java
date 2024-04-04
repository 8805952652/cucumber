package com.chitale.pageobjects;

import com.chitale.factory.DriverFactory;
import com.chitale.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class FirmPage {

    private CommonObjects obj = new CommonObjects();
    private WebDriver driver;
    private ConfigReader config = new ConfigReader();;
    private Properties prop = config.initProps();
    private final By adminButton = By.xpath("//span[normalize-space()='Admin']");
    private final By firm = By.xpath("//span[normalize-space()='Firm']");

    private final By createNewBtn = By.xpath("//button[normalize-space()='Create New']");
    private final By firmName = By.xpath("//input[@id='comp_name']");
    private final By firmType = By.cssSelector("//select[@id='comptp_id']");
//    @FindBy (xpath="//select[@id='comptp_id']")
//    private WebElement Type;

    private final By shortName = By.xpath("//input[@id='comp_short_name']");
    private final By initial = By.xpath("//input[@id='comp_initial']");
    private final By panNumber = By.xpath("//input[@id='comp_pan_gir_no']");

    private final By scope = By.xpath("//textarea[@id='comp_scope']");

    private final By firmStartDate = By.xpath("//div[@class='ant-picker input-control ']");
    private final By today = By.xpath("//a[normalize-space()='Today']");

    private final By logo = By.xpath("//span[normalize-space()='Choose file']");

    private final By nextBtn = By.xpath("//button[normalize-space()='Next']");


    public FirmPage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickOnAdmin () {
        driver.findElement(adminButton).click();
    }

    public void clickOnFirm(){
        obj.waitForVisiblityOfElement(driver, 10, driver.findElement(firm));
    }

    public void clickOnCreatNew (){
        obj.waitForVisiblityOfElement(driver, 10, driver.findElement(createNewBtn));
    }

    public void enterFirmName(){
        driver.findElement(firmName).sendKeys(prop.getProperty("Firm_Name"));
    }

    public void selectFirmType(){
       WebElement Type = driver.findElement(By.xpath("//select[@id='comptp_id']"));
       obj.waitForVisibilityOfElementWithoutClick(driver, 10, Type);
        Select sc = new Select(Type);
        sc.selectByValue(prop.getProperty("Firm_Type"));
    }

    public void enterShortName(){
        driver.findElement(shortName).sendKeys(prop.getProperty("Firm_Short_Name"));
    }

    public void enterInitial(){
        driver.findElement(initial).sendKeys(prop.getProperty("Firm_Initial"));
    }

    public void enterPanNumber (){
        driver.findElement(panNumber).sendKeys(prop.getProperty("Firm_PAN_Number"));
    }

//    public void enterStartDate(){
//        driver.findElement(firmStartDate).click();
//        driver.findElement(today).click();
//    }
    public void enterStartDate() {
        driver.findElement(firmStartDate).click();
        driver.findElement(By.xpath("//button[normalize-space()='Feb']")).click();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement yearElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='2024']")));
        String desiredYear = prop.getProperty("F_Start_Year");
        while (true) {
            String currentYear = yearElement.getText();
            if (desiredYear.equals(currentYear)) {
                break;
            } else {
                driver.findElement(By.xpath("//button[@class='ant-picker-header-super-prev-btn']")).click();
            }
        }
        String month = prop.getProperty("F_Start_Month");
        driver.findElement(By.xpath("//div[normalize-space()='"+month+"']")).click();
        String full_date = prop.getProperty("F_Start_Full_Date");
        String Date = prop.getProperty("F_Start_Date");
        driver.findElement(By.xpath("//td[@title='"+full_date+"']//div[@class='ant-picker-cell-inner'][normalize-space()='"+Date+"']")).click();
    }
    public void enterScope(){
        driver.findElement(scope).sendKeys("Chitale Foods Company");
    }

    public void uploadLogo() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String path = "/home/logo.jpg";
        driver.findElement(logo).sendKeys(path);}
    public void clickOnNextBtn (){
        driver.findElement(nextBtn).click();
    }

}
