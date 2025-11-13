package com.kartik.selenium_framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage extends BasePage {

    //Locators
    private By pageTitle = By.className("title");
    private By sortDropdown = By.className("product_sort_container");
    private By addToCartButton = By.xpath("(//button[contains(text(),'Add to cart')])[1]");
    private By cartIcon = By.className("shopping_cart_link");

    //Constructor
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Methods
    public String getHomePageTitle() {
        return getText(pageTitle);
    }

    public void verifyTitle(String expectedTitle) {
        Assert.assertEquals(getHomePageTitle(), expectedTitle, "Home page title mismatch!");
    }

    public void verifySortDropdownVisible() {
        Assert.assertTrue(isElementDisplayed(sortDropdown), "Sort dropdown is not visible on home page!");
    }

    public void verifyAddToCartButtonVisible() {
        Assert.assertTrue(isElementDisplayed(addToCartButton), "Add to Cart button is not visible on home page!");
    }

    public void verifyCartIconVisible() {
        Assert.assertTrue(isElementDisplayed(cartIcon), "Cart icon is not visible on home page!");
    }
}











