package miscellaneous;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import com.generics.ActiTime.BaseTest;
import com.pages.ActiTime.VerifyErrorMessagespage;;

public class TestVerifyErrorMessages extends BaseTest{
	@Test
	public void verifyerrormessages() throws IOException
	{
		VerifyErrorMessagespage nextbutton = new VerifyErrorMessagespage(driver);
		nextbutton.verifyerrorMethod();
		nextbutton.errormesMethod();
		
		}
	}
