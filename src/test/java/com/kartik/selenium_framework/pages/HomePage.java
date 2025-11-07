package com.kartik.selenium_framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage extends BasePage {

    private By pageTitle = By.className("title");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String getHomePageTitle() {
        return getText(pageTitle);
    }

    public void verifyTitle(String expectedTitle) {
        Assert.assertEquals(getHomePageTitle(), expectedTitle, "Home page title mismatch!");
    }
}









