package com.pages.ActiTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.page.Page.GetAppManifestResponse;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import net.bytebuddy.dynamic.DynamicType.Builder.InnerTypeDefinition;

public class VerifyErrorMessagespage {
	@FindBy(xpath ="//div[@class='VfPpkd-RLmnJb']")
	 private WebElement nextButton;
	
	//@FindBy(xpath ="//div[contains(text(),'Enter an email')]")
	@FindBy(xpath="//div[@class='o6cuMc']")
	private WebElement errormsg;
	//@FindBy(xpath="//div[@class='o6cuMc']")
	//private element errorText
	
	
	public VerifyErrorMessagespage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	public void verifyerrorMethod() {
		nextButton.click();
	}
	public void errormesMethod() {
		/*String actualerrormessage = errormsg.getText();
		String expectederrormessage = "Enter an email or phone number";
		//String expectederrormessage = "Aswariya";
		Assert.assertEquals(actualerrormessage, expectederrormessage);
		System.out.println(actualerrormessage);*/
		
		errormsg.getAttribute("innerHTML");
		String actualmessage = errormsg.getAttribute("innerHTML");
		//String expectederrormessage="Enter an email or phone number";
		//Assert.assertEquals(actualmessage, expectederrormessage);----assertion error
		Assert.assertTrue(actualmessage.contains("Enter an email"));
		System.out.println(errormsg);
		}
}
