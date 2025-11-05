package com.kartik.selenium_framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.kartik.selenium_framework.utils.WaitUtils;

public class LoginPage {
    private WebDriver driver;
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage login(String username, String password) {
        WaitUtils.waitForElementVisible(driver, usernameField, 10).sendKeys(username);
        WaitUtils.waitForElementVisible(driver, passwordField, 10).sendKeys(password);
        WaitUtils.waitForElementClickable(driver, loginButton, 10).click();
        return new HomePage(driver);
    }
}






