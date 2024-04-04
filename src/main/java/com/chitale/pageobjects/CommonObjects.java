package com.chitale.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonObjects {


    public void waitForVisiblityOfElement(WebDriver driver, int time, WebElement ele) {
        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
        wt.until(ExpectedConditions.visibilityOf(ele)).click();
    }

//    public void waitForVisibilityOfElementLocated (WebDriver driver, int time, WebElement ele){
//        WebDriverWait wt = new WebDriverWait (driver, Duration.ofSeconds(time));
//        wt.until(ExpectedConditions.visibilityOfElementLocated());
//    }
    public void waitForVisibilityOfElementWithoutClick(WebDriver driver, int time, WebElement ele) {
        WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(time));
        wt.until(ExpectedConditions.visibilityOf(ele));
    }
}
