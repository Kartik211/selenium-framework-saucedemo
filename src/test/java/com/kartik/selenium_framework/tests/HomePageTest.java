package com.kartik.selenium_framework.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.kartik.selenium_framework.base.BaseTest;
import com.kartik.selenium_framework.pages.LoginPage;
import com.kartik.selenium_framework.pages.HomePage;

public class HomePageTest extends BaseTest {

    @Test(description = "Verify user can login and land on Home page with Products title")
    public void verifyHomePageTitleTest() {

        // Arrange
        LoginPage loginPage = new LoginPage(getDriver());

        // Act
        HomePage homePage = loginPage.login("standard_user", "secret_sauce");

        // Assert
        String actualTitle = homePage.getHomePageTitle();
        Assert.assertEquals(actualTitle, "Products", "Home Page Title did not match expected value.");
    }
}

