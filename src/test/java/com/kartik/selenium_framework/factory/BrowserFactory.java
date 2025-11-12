package com.kartik.selenium_framework.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import java.util.Locale;

public class BrowserFactory {

    public static WebDriver createInstance(String browserName) {
        if (browserName == null) {
            browserName = "chrome"; // default
        }

        browserName = browserName.toLowerCase(Locale.ROOT);
        WebDriver driver;

        switch (browserName) {
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver(new FirefoxOptions());
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver(new EdgeOptions());
                break;
            case "brave":
                WebDriverManager.chromedriver().setup();
                ChromeOptions braveOptions = new ChromeOptions();
                braveOptions.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
                driver = new ChromeDriver(braveOptions);
                break;
            case "chrome":
            default:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(new ChromeOptions());
                break;
        }

        driver.manage().window().maximize();
        return driver;
    }
}

