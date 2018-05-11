package com.qa.bussinessfunctions;

import org.omg.PortableInterceptor.ObjectReferenceFactory;
import org.openqa.selenium.WebDriver;

import com.qa.actionDriver.Actions;
import com.qa.base.Base;
import com.qa.or.OR;

public class BusinessFunctions {

	public static WebDriver driver;
	public static Actions act;
	
	public BusinessFunctions() {
		
		driver = Base.driver;
		act = new Actions();
	}
	
	public void getURL() throws Exception {
		Base.childTest = Base.parentTest.createNode("login to costco");
		act.getURL();
		act.sendkeys(OR.searchBox, "Books");
	}
	
	
	
}
