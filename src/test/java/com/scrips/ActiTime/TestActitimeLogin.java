package com.scrips.ActiTime;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import com.generics.ActiTime.BaseTest;
import com.pages.ActiTime.ActiTimeLoginPage;

public class TestActitimeLogin extends BaseTest{
	@Test
	public void login() throws IOException
	{
		ActiTimeLoginPage login = new ActiTimeLoginPage(driver);
		login.loginMethod();
		
	}

}
