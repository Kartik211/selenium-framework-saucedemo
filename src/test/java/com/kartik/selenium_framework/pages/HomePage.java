package com.kartik.selenium_framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

// Page object for the landing / inventory page after successful login
public class HomePage {

    private WebDriver driver;

    @FindBy(css = "span.title")   // SauceDemo shows "Products" in span.title
    private WebElement productsTitle;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Return the displayed page title (e.g., "Products")
    public String getHomePageTitle() {
        try {
            return productsTitle.getText().trim();
        } catch (Exception e) {
            return driver.getTitle(); // fallback to browser title
        }
    }
}



