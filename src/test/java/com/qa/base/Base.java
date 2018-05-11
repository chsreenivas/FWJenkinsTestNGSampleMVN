package com.qa.base;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class Base {

	public static WebDriver driver;
	public static ExtentReports extentReports ;
	public static ExtentHtmlReporter extentHtmlReporter ;
	public static ExtentTest parentTest;
	public static ExtentTest childTest;
	public static String method;

	@BeforeMethod
	public void beforeMethod(Method method) {
		parentTest = extentReports.createTest(method.getName());
	}

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "/Users/alliancetech/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@AfterClass
	public void afterClass() {
		extentReports.flush();
		driver.quit();
	}

	@BeforeTest
	public void beforeTest() {
		extentHtmlReporter = new ExtentHtmlReporter("/Users/alliancetech/Desktop/FrameWorkD/Test2/Reports/extent.html");
		extentReports = new ExtentReports();
		extentReports.attachReporter(extentHtmlReporter);

	}

}
