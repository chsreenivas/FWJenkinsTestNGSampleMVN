package com.qa.actionDriver;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.apache.xpath.axes.ChildTestIterator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.base.Base;

public class Actions {
	public static WebDriver driver;


	public Actions() {

		driver = Base.driver;
	}

	public void getURL() {

		try {
			driver.get("https://www.amazon.in");
			Base.childTest.pass("Navigated successfully");
		}
		catch(Exception e) {
			Base.childTest.fail("Navigated Un-successfully");
			e.printStackTrace();
		}
	}

	public void click(By element, String string) throws Exception {

		try {
			driver.findElement(element).click();
			Base.childTest.pass("clicked successfully");

		}
		catch(Exception e) {
			Base.childTest.fail("unable to click on"+ element+ Base.childTest.addScreenCaptureFromPath(screenshot(driver)));
			e.printStackTrace();
		}
	}
	public void sendkeys(By element, String string) {

		try {
			driver.findElement(element).sendKeys(string);
			Base.childTest.pass("Able to type" + string);

		}
		catch(Exception e) {
			Base.childTest.fail("NotAble to type" + string);
			e.printStackTrace();
		}
		
	}
		public String screenshot(WebDriver driver) {
			String src_path = ("\\Screenshot/");
			UUID uuid = UUID.randomUUID();
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			try {

				FileUtils.copyFile(scrFile, new File(src_path+uuid+".jpeg"));
			}
			catch(Exception e)
				{
					System.out.println("Unable tp capture screenshot");
				}

				return src_path+uuid+".jpeg";
		}
	
}
	
