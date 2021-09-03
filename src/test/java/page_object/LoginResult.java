package page_object;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.baseClass;

public class LoginResult extends baseClass {

	public LoginResult(WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(webdriver, this);
	}

	@FindBy(id = "welcome")
	WebElement welcome;

	@FindBy(id = "spanMessage")
	WebElement errorMessage;

	public String verifyDashboard() {
		return welcome.getText();
	}

	public String verifyMessage() {
		webdriver.getPageSource().contains("Invalid credentials");
		return errorMessage.getText();
	}

	public boolean isDisplayed() {
		wait(welcome);
		wait(errorMessage);
		return true;
	}
}
