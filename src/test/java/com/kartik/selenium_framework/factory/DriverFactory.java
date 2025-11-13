package com.kartik.selenium_framework.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void initDriver(String browser) {
        if (driver.get() == null) {
            if (browser.equalsIgnoreCase("chrome")) {
                ChromeOptions options = new ChromeOptions();

                // Common arguments to ensure stability in CI and local
                options.addArguments("--disable-gpu");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");

                // Enable headless mode automatically for CI or if user sets headless=true
                if (System.getenv("CI") != null || 
                    System.getProperty("headless", "false").equalsIgnoreCase("true")) {
                    options.addArguments("--headless=new");
                    System.out.println("✅ Running Chrome in headless mode (CI detected)");
                }

                driver.set(new ChromeDriver(options));

            } else if (browser.equalsIgnoreCase("firefox")) {
                FirefoxOptions options = new FirefoxOptions();

                // Enable headless mode for CI
                if (System.getenv("CI") != null || 
                    System.getProperty("headless", "false").equalsIgnoreCase("true")) {
                    options.addArguments("--headless");
                    System.out.println("✅ Running Firefox in headless mode (CI detected)");
                }

                driver.set(new FirefoxDriver(options));

            } else {
                throw new IllegalArgumentException("❌ Unsupported browser: " + browser);
            }
        }
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}


