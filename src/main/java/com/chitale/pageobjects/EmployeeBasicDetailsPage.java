package com.chitale.pageobjects;

import com.chitale.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Properties;


public class EmployeeBasicDetailsPage {

    private CommonObjects obj = new CommonObjects();
    private WebDriver driver;
    private ConfigReader config = new ConfigReader();
    ;
    private Properties prop = config.initProps();
    private final By adminButton = By.xpath("//span[normalize-space()='Admin']");
    private final By employee = By.xpath("//span[normalize-space()='Employee']");
    private final By basicDetails = By.xpath("//span[normalize-space()='Basic Details']");

    private final By createNewBtn = By.xpath("//button[normalize-space()='Create New']");
    private final By branchName = By.xpath("//select[@id='branch']");

    private final By unitName = By.xpath("//select[@id='unit']");
    private final By departmentName = By.xpath("//select[@id='dept']");
    private final By designationName = By.xpath("//select[@id='desg']");

    private final By employeeType = By.xpath("//select[@id='emptype_id']");

    private final By rollNumber = By.xpath("//input[@id='emp_roll_no']");
    private final By employeeName = By.xpath("//input[@id='emp_name']");

    private final By marathiName = By.xpath("//input[@id='emp_marathi_name']");

    private final By unicodeName = By.xpath("//input[@id='emp_unicode_name']");
    private final By fatherName = By.xpath("//input[@id='emp_father_name']");
    private final By motherName = By.xpath("//input[@id='emp_mother_name']");
    private final By dateOfBirth = By.xpath("//body/div[@id='root']/div[contains(@class,'admin-layout container-fluid')]/div[contains(@class,'row')]/div[contains(@class,'custom-col-9-5 px-0 col')]/div[contains(@class,'row')]/div[contains(@class,'col')]/div[contains(@class,'admin-card rounded-3 m-3')]/div[contains(@class,'tab-content')]/div[@id='edit-form-tabs-tabpane-group']/form[contains(@action,'#')]/div[contains(@class,'card-body p-0 ms-3')]/div[contains(@class,'employee-scroll p-3')]/div[contains(@class,'row')]/div[contains(@class,'col')]/div[2]/div[1]/div[1]");

    private final By mobileNumber = By.xpath("//input[@id='emp_mobile_no']");

    private final By emailAddress = By.xpath("//input[@id='emp_email']");
    private final By domainEmailAddress = By.xpath("//input[@id='emp_domain_address']");

    private final By adharNumber = By.xpath("//input[@id='emp_aadhar_number']");
    private final By panNumber = By.xpath("//input[@id='emp_pan_number']");
    private final By pfNumber = By.xpath("//input[@id='emp_pf_number']");

    private final By pfStartDate = By.xpath("//body//div[@id='root']//div[@class='row']//div[@class='row']//div[@class='row']//div[1]//div[1]//div[2]//div[1]//input[1]");

    private final By TodayDate = By.xpath("//a[normalize-space()='Today']");
    private final By uanNumber = By.xpath("//input[@id='emp_uan_number']");
    private final By esicNumber = By.xpath("//input[@id='emp_esic_number']");

    private final By qualification = By.xpath("//select[@id='qual_id']");

    private final By bloodGroup = By.xpath("//select[@id='blood_id']");
    private final By physicalIdMark = By.xpath("//input[@id='emp_pid_mark']");
    private final By malGender = By.xpath("//input[@id='emp_gender_1']");
    private final By femaleGender = By.xpath("//input[@id='emp_gender_2']");
    private final By marriedStatus = By.xpath("//input[@id='emp_marital_status_1']");

    private final By unmarriedStatus = By.xpath("//input[@id='emp_marital_status_2']");

    private final By spouseName = By.xpath("//input[@id='emp_spouse_name']");
    private final By activeStatus = By.xpath("//input[@id='emp_status_1']");
    private final By inactiveStatus = By.xpath("//input[@id='emp_status_0']");
    private final By nextButton = By.xpath("//button[normalize-space()='Next']");
    private final By ethnicity = By.xpath("//select[@id='ethnicity_id']");
    private final By nationality = By.xpath("//select[@id='nationality_id']");

    private final By state = By.xpath("//select[@id='state_id']");

    private final By district = By.xpath("//select[@id='dist_id']");
    private final By tehsil = By.xpath("//select[@id='subdst_id']");
    private final By city = By.xpath("//input[@id='emp_permanent_city_name']");
    private final By permanentAddress = By.xpath("//input[@id='emp_permanent_city_name']");
    private final By pinCode = By.xpath("//input[@id='emp_permanent_pincode']");

    private final By sameAsAbove = By.xpath("//input[@id='sameAsPermanent']");

    private final By state1 = By.xpath("//input[@id='emp_spouse_name']");
    private final By district1 = By.xpath("//select[@id='state_id1']");
    private final By city1 = By.xpath("//input[@id='emp_local_city_name']");
    private final By localAddress = By.xpath("//textarea[@id='emp_local_address']");
    private final By localPinCode = By.xpath("//input[@id='emp_local_pincode']");
    private final By sendForAcceptance = By.xpath("//button[normalize-space()='Send For Acceptance']");



    public EmployeeBasicDetailsPage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickOnAdmin() {
        driver.findElement(adminButton).click();
    }

    public void clickOnEmployee() {
        obj.waitForVisiblityOfElement(driver, 10, driver.findElement(employee));
    }
    public void clickOnBasicDetails() {
        obj.waitForVisiblityOfElement(driver, 10, driver.findElement(basicDetails));
    }

    public void clickOnCreatNew() {
        obj.waitForVisiblityOfElement(driver, 10, driver.findElement(createNewBtn));
    }

    public void selectBranchName () {
        WebElement branch = driver.findElement(By.xpath("//select[@id='branch']"));
        obj.waitForVisibilityOfElementWithoutClick(driver, 10, branch);
        Select sc = new Select(branch);
        sc.selectByVisibleText(prop.getProperty("Emp_Branch_Name"));
    }
    public void selectUnitName () {
        WebElement unit = driver.findElement(By.xpath("//select[@id='unit']"));
        obj.waitForVisibilityOfElementWithoutClick(driver, 10, unit);
        Select sc = new Select(unit);
        sc.selectByVisibleText(prop.getProperty("Unit_Name"));
    }
    public void selectDepartmentName () {
        WebElement department = driver.findElement(By.xpath("//select[@id='dept']"));
        obj.waitForVisibilityOfElementWithoutClick(driver, 10, department);
        Select sc = new Select(department);
        sc.selectByVisibleText(prop.getProperty("Department_Name"));
    }
    public void selectDesignationName () {
        WebElement designation = driver.findElement(By.xpath("//select[@id='desg']"));
        obj.waitForVisibilityOfElementWithoutClick(driver, 10, designation);
        Select sc = new Select(designation);
        sc.selectByVisibleText(prop.getProperty("Designation_Name"));
    }
    public void selectEmployeeType () {
        WebElement employee_Type = driver.findElement(By.xpath("//select[@id='emptype_id']"));
        obj.waitForVisibilityOfElementWithoutClick(driver, 10, employee_Type);
        Select sc = new Select(employee_Type);
        sc.selectByVisibleText(prop.getProperty("Employee_Type"));
    }
    public void enterRollNumber() {
        driver.findElement(rollNumber).sendKeys(prop.getProperty("Roll_Number"));
    }

    public void enterEmployeeFullName() {
        driver.findElement(employeeName).sendKeys(prop.getProperty("Employee_Full_Name"));
    }

    public void enterMarathiName() {
        driver.findElement(marathiName).sendKeys(prop.getProperty("Marathi_Name"));
    }

    public void enterUnicodeName() {
        driver.findElement(unicodeName).sendKeys(prop.getProperty("Unicode_Name"));}
    public void enterFatherName() {
        driver.findElement(fatherName).sendKeys("Father_Name");}

    public void enterMotherName() {
        driver.findElement(motherName).sendKeys("Mother_Name");}
    public void enterMobileNumber() {
        driver.findElement(mobileNumber).sendKeys(prop.getProperty("Mobile_Number"));
    }

    public void enterEmployeeEmailAddress() {
        driver.findElement(emailAddress).sendKeys(prop.getProperty("Employee_Employee_Email_Address"));
    }

    public void enterDomainEmailAddress() {
        driver.findElement(domainEmailAddress).sendKeys(prop.getProperty("Domain_Email_Address"));
    }

    public void enterAadharNumber() {
        driver.findElement(adharNumber).sendKeys(prop.getProperty("Employee_Aadhar_Number"));}
    public void enterPanNumber() {
        driver.findElement(panNumber).sendKeys("Employee_Pan_Number");}

    public void enterPFNumber() {
        driver.findElement(pfNumber).sendKeys("PF_Number");}

    public void enterPFStartDate() {
        driver.findElement(pfStartDate).click();
        driver.findElement(TodayDate).click();
    }

    public void enterUANNumber() {
        driver.findElement(uanNumber).sendKeys(prop.getProperty("UAN_Number"));
    }

    public void enterESICNumber() {
        driver.findElement(esicNumber).sendKeys(prop.getProperty("ESIC_number"));}

    public void selectQualification () {
        WebElement qaulification = driver.findElement(By.xpath("//select[@id='qual_id']"));
        obj.waitForVisibilityOfElementWithoutClick(driver, 10, qaulification);
        Select sc = new Select(qaulification);
        sc.selectByVisibleText(prop.getProperty("Qualification"));
    }
    public void selectBloodGroup () {
        WebElement BloodGroup = driver.findElement(By.xpath("//select[@id='blood_id']"));
        obj.waitForVisibilityOfElementWithoutClick(driver, 10, BloodGroup);
        Select sc = new Select(BloodGroup);
        sc.selectByVisibleText(prop.getProperty("Blood_Group"));
    }
    public void enterPhysicalIDMark() {
        driver.findElement(physicalIdMark).sendKeys("Physical_Id_Mark");}

    public void selectGender() {
        driver.findElement(malGender).click();
//        driver.findElement(femaleGender).click();
    }
        public void selectMarriedStatus() {
            driver.findElement(marriedStatus).click();
//        driver.findElement(unmarriedStatus).click();
        }
    public void enterSpouseName() {
        driver.findElement(spouseName).sendKeys("Spouse_Name");}
    public void selectStatus() {
        driver.findElement(activeStatus).click();
//        driver.findElement(inactiveStatus).click();
    }
    public void clickOnNextButton (){
        driver.findElement(nextButton).click();
    }


    public void clickOnSendForAcceptance (){
        driver.findElement(sendForAcceptance).click();
    }

}
