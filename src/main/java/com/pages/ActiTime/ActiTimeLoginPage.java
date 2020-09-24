package com.pages.ActiTime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.ActiTime.AutoConstant;
import com.generics.ActiTime.ExcelLibrary;

public class ActiTimeLoginPage implements AutoConstant{
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextfield;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(id="KeepLoggedIncheckbox")
	private WebElement keepmeloggedinCheckbox;
	
	@FindBy(xpath= "//a[contains(text().Forgot')]")
	private WebElement forgotyourpasswordLink;
	
	@FindBy(xpath="//a[.=actitimeInc.']")
	private WebElement actitimeIncLink;
	
	
	public ActiTimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	public void loginMethod() throws IOException {
		usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 5, 0));
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path, sheet_name, 5, 1));
		keepmeloggedinCheckbox.click();
		loginButton.click();
		
		
	}
}
