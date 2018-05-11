package com.qa.or;

import org.openqa.selenium.By;


	public class OR {
		
		public static By dropdown = By.id("searchDropdownBox");

		public static By submitButton = By.xpath("//input[@type='submit']"); 
		
		public static By searchBox = By.id("twotabsearchtextbox");
		
		public static By suggestionFirst = By.xpath("//div[@id='suggestions']/div[1]");
	}