package com.kartik.selenium_framework.tests;

import com.kartik.selenium_framework.base.BaseTest;
import com.kartik.selenium_framework.pages.HomePage;
import com.kartik.selenium_framework.pages.LoginPage;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void verifyHomePageTitleTest() {
        LoginPage login = new LoginPage(driver);
        HomePage home = login.login("standard_user", "secret_sauce");
        home.verifyTitle("Products"); // ✅ Now should PASS
    }
}



