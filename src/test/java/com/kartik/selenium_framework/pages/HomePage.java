package com.kartik.selenium_framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.kartik.selenium_framework.utils.WaitUtils;
import org.testng.Assert;

public class HomePage {
    private WebDriver driver;
    private By pageTitle = By.className("title");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHomePageTitle() {
        return WaitUtils.waitForElementVisible(driver, pageTitle, 10).getText();
    }

    public void verifyTitle(String expectedTitle) {
        String actualTitle = getHomePageTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Home page title mismatch!");
    }
}








