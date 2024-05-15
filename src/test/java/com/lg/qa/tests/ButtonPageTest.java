package com.lg.qa.tests;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.lg.qa.base.TestBase;
import com.lg.qa.pages.ButtonPage;

public class ButtonPageTest extends TestBase {
	ButtonPage ButtonPage;
	
	public ButtonPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		ButtonPage  = new ButtonPage();
	}
	

	
	@Test(priority=2)
	public void ButtonClick() {
		ButtonPage.ClickOnButton();	
	}
	
	@Test(priority=1)
	public void ImageButtonClick() {
		ButtonPage.ClickOnImageButton();
	}
	
	
//	@AfterMethod
//	public void TearDown() {
//		driver.quit();
//	}
//	
	

}
