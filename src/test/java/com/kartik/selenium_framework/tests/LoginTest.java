package com.kartik.selenium_framework.tests;

import org.testng.annotations.Test;
import com.kartik.selenium_framework.base.BaseTest;
import com.kartik.selenium_framework.pages.LoginPage;
import com.kartik.selenium_framework.pages.HomePage; 

public class LoginTest extends BaseTest {

    
    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = loginPage.login("standard_user", "secret_sauce");
        System.out.println("✅ Login Successful!");
    }

}
