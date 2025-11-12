package com.kartik.selenium_framework.base;

import org.openqa.selenium.WebDriver;
import com.kartik.selenium_framework.factory.BrowserFactory;

public class DriverFactory {
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void initDriver(String browserName) {
        if (driver.get() == null) {
            driver.set(BrowserFactory.createInstance(browserName));
        }
    }

    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}



