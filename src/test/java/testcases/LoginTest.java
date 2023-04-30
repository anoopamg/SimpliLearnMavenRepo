package testcases;
import org.testng.annotations.*;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Recordset;

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
	
	@Test
	public void readFromXcel() throws FilloException {
		LoginPage login = new LoginPage(driver);
		
		Recordset recordset = connection.executeQuery("select * from data where Testname='test4'");
		recordset.next();
		String userName = recordset.getField("UserName");
		String password = recordset.getField("Password");
		
		login.LoginFunction(userName, password);
		
		//appache poi
	}
	
	/*@Test
	public void validLoginTest() throws InterruptedException {
		LoginFunction("anoopa.mg@gmail.com","A213ut43olearn@12");
	}*/
		

}
