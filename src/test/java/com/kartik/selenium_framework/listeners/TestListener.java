package com.kartik.selenium_framework.listeners;

import com.aventstack.extentreports.Status;
import com.kartik.selenium_framework.base.BaseTest;
import com.kartik.selenium_framework.reports.ExtentReportManager;
import com.kartik.selenium_framework.utils.ScreenshotUtils;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        ExtentReportManager.startTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentReportManager.getTest().log(Status.PASS, result.getMethod().getMethodName() + " Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // Capture screenshot on failure
        Object testClass = result.getInstance();
        WebDriver driver = ((BaseTest) testClass).getDriver();
        ScreenshotUtils.takeScreenshot(driver, result.getMethod().getMethodName());
        
        ExtentReportManager.getTest().log(Status.FAIL, 
                result.getMethod().getMethodName() + " Failed — Screenshot Captured");

        System.out.println("Screenshot captured for failed test: " + result.getMethod().getMethodName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentReportManager.getTest().log(Status.SKIP, result.getMethod().getMethodName() + " Skipped");
    }

    @Override
    public void onFinish(ITestContext context) {
        ExtentReportManager.getReporter().flush();
    }
}




