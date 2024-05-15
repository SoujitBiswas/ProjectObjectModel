package com.lg.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lg.qa.base.TestBase;

public class ButtonPage extends TestBase{
	
	//page_factory / or = object reprosetory
	
	@FindBy(xpath="//button[@id='j_idt88:j_idt90']")
	WebElement ClickButton;
	
	@FindBy(xpath="//button[@id='j_idt88:j_idt102:imageBtn']")
	WebElement ImageButton;
	
	
	//initializing the page objects
	public ButtonPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
		
	}
	
	//Actions
	public void ClickOnButton() {
		ClickButton.click();
		
	}
	
	public void ClickOnImageButton() {
		ImageButton.click();
	}
	
	
	
	
	

}
