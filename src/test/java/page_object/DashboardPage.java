package page_object;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class DashboardPage extends BaseClass {

	public DashboardPage(WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(webdriver, this);
	}

	@FindBy(id = "welcome")
	private WebElement welcome;

	@FindBy(id = "spanMessage")
	private WebElement errorMessage;
	
	@FindBy(xpath = "//b[.='PIM']")
	private WebElement pim;

	public String verifyDashboard() {
		return welcome.getText();
	}

	public String errorMessage() {
//		webdriver.getPageSource().contains("Invalid credentials");
		return errorMessage.getText();
	}
	
	public void clickPIM() {
		pim.click();
	}

//	public boolean isDisplayed() {
//		wait(welcome);
//		wait(errorMessage);
//		return true;
//	}
}
