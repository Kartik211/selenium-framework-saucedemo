package com.kartik.selenium_framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.kartik.selenium_framework.utils.WaitUtils;

public class HomePage {
    
    private WebDriver driver;

    private By pageTitle = By.className("title");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHomePageTitle() {
        WaitUtils.waitForElementVisible(driver, pageTitle, 10);
        return driver.findElement(pageTitle).getText();
    }

    public void verifyTitle(String expectedTitle) {
        String actualTitle = getHomePageTitle();
        org.testng.Assert.assertEquals(actualTitle, expectedTitle, "Home page title mismatch!");
    }
}







