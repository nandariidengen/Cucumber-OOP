package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.baseClass;

public class LoginHomePage extends baseClass {

	public LoginHomePage(WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(webdriver, this);
	}

	@FindBy(id = "txtUsername")
	WebElement usernameBox;

	@FindBy(id = "txtPassword")
	WebElement passwordBox;

	@FindBy(id = "btnLogin")
	WebElement btnLogin;

	public void setUsername(String username) {
//		input(usernameBox, username);
		usernameBox.sendKeys(username);
	}

	public void setPassword(String password) {
//		input(passwordBox, password);
		passwordBox.sendKeys(password);
	}

	public void clickLogin() {
		btnLogin.click();
	}

	public boolean isDisplayed() {
		wait(usernameBox);
		wait(passwordBox);
		wait(btnLogin);
		return true;
	}

}
