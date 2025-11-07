package com.kartik.selenium_framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.kartik.selenium_framework.utils.WaitUtils;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void click(By locator) {
        WaitUtils.waitForElementClickable(driver, locator, 10).click();
    }

    public void type(By locator, String text) {
        WaitUtils.waitForElementVisible(driver, locator, 10).sendKeys(text);
    }

    public String getText(By locator) {
        return WaitUtils.waitForElementVisible(driver, locator, 10).getText();
    }
}


