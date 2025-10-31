package com.kartik.selenium_framework.tests;

import org.testng.annotations.Test;
import com.kartik.selenium_framework.base.BaseTest;
import com.kartik.selenium_framework.pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.login("standard_user", "secret_sauce");
    }
}
