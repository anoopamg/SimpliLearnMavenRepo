package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import objects.LoginObjects;

public class LoginPage {

	WebDriver pageDriver;
	
	LoginObjects pageElements;
	
	public LoginPage(WebDriver driver) {

		pageDriver = driver;
		pageElements = new LoginObjects(pageDriver);
		//PageFactory.initElements(driver, this);
	}

	public void pageNavigation() {
		// step3: verify if navigation is successful
		String actPageTitle = pageDriver.getTitle();
		String expPageTitle = "Simplilearn | Online Courses - Bootcamp & Certification Platform";
		Assert.assertEquals(actPageTitle, expPageTitle);

	}

	public void LoginFunction(String uName, String pwd) {

		pageDriver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		// Step 3: Click on Login
		pageElements.getLoginLink().click();
		String actLoginPageTitle = pageDriver.getTitle();
		String expLoginPageTitle = "Learning on Simplilearn";
		Assert.assertEquals(actLoginPageTitle, expLoginPageTitle);

		// Step 5: Enter User name
		pageElements.getUserName().sendKeys(uName);

		// Step 6: Enter Password
		pageElements.getPassword().sendKeys(pwd);

		// Step 7: Click on Remember Me
		pageElements.getRememberMe().click();

		// Step 8: Click Login button
		pageElements.getLoginBtn().click();

		// Step 9: Validate if login was successful
		String expErrorMsg = "The email or password you have entered is invalid.";
		String actErrorMsg = pageElements.getErrorMsg().getText();
		Assert.assertEquals(actErrorMsg, expErrorMsg);
	}

}
