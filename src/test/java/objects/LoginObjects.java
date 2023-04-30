package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginObjects {

	WebDriver objDriver;

	public LoginObjects(WebDriver driver) {
		this.objDriver = driver;
		PageFactory.initElements(objDriver, this);
	}

	@FindBy(linkText = "Log in")
	private WebElement loginLink;

	@FindBy(name = "user_login")
	private WebElement userName;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(className = "rememberMe")
	private WebElement rememberMe;

	@FindBy(name = "btn_login")
	private WebElement loginBtn;

	@FindBy(className = "error_msg")
	private WebElement errorMsg;

	/**
	 * @return the loginLink
	 */

	public WebElement getLoginLink() {
		return loginLink;
	}

	/**
	 * @param loginLink the loginLink to set
	 */
	public void setLoginLink(WebElement loginLink) {
		this.loginLink = loginLink;
	}

	/**
	 * @return the userName
	 */
	public WebElement getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(WebElement userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(WebElement password) {
		this.password = password;
	}

	/**
	 * @return the rememberMe
	 */
	public WebElement getRememberMe() {
		return rememberMe;
	}

	/**
	 * @param rememberMe the rememberMe to set
	 */
	public void setRememberMe(WebElement rememberMe) {
		this.rememberMe = rememberMe;
	}

	/**
	 * @return the loginBtn
	 */
	public WebElement getLoginBtn() {
		return loginBtn;
	}

	/**
	 * @param errorMsg the errorMsg to set
	 */
	public void setErrorMsg(WebElement errorMsg) {
		this.errorMsg = errorMsg;
	}

	/**
	 * @return the errorMsg
	 */
	public WebElement getErrorMsg() {
		return errorMsg;
	}
}
