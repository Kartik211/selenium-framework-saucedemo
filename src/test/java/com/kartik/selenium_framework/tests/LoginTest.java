package com.kartik.selenium_framework.tests;

import com.kartik.selenium_framework.base.BaseTest;
import com.kartik.selenium_framework.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest() {
        LoginPage login = new LoginPage(driver);
        login.login("standard_user", "secret_sauce");
        // Add assertion later
    }
}

