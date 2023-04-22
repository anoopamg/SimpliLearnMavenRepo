package testcases;
import org.testng.annotations.*;

import pages.LoginPage;

public class LoginTest extends BaseClass {	

	@Test
	public void verifyNavigation() throws InterruptedException {	
		LoginPage login = new LoginPage(driver);
		login.pageNavigation();			
	}
	
	@Test
	public void invalidLoginTest() throws InterruptedException {
		LoginPage login = new LoginPage(driver);
		login.LoginFunction("abcde@gmail.com","Abcd1234s");
	}
	
	/*@Test
	public void validLoginTest() throws InterruptedException {
		LoginFunction("anoopa.mg@gmail.com","A213ut43olearn@12");
	}*/
		

}
