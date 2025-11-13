package com.kartik.selenium_framework.tests;

import com.kartik.selenium_framework.base.BaseTest;
import com.kartik.selenium_framework.pages.HomePage;
import com.kartik.selenium_framework.pages.LoginPage;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyHomePageTitle() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = loginPage.login("standard_user", "secret_sauce");
        homePage.verifyTitle("Products");
    }

    @Test
    public void verifySortDropdownVisible() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = loginPage.login("standard_user", "secret_sauce");
        homePage.verifySortDropdownVisible();
    }

    @Test
    public void verifyAddToCartButtonVisible() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = loginPage.login("standard_user", "secret_sauce");
        homePage.verifyAddToCartButtonVisible();
    }

    @Test
    public void verifyCartIconVisible() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = loginPage.login("standard_user", "secret_sauce");
        homePage.verifyCartIconVisible();
    }
}




