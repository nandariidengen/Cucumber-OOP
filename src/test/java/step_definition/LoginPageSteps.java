package step_definition;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.LoginHomePage;
import page_object.DashboardPage;

@SuppressWarnings("deprecation")
public class LoginPageSteps {
	private WebDriver webdriver;

	public LoginPageSteps() {
		super();
		this.webdriver = Hooks.webdriver;
	}

	@Given("User open the Orange HRM home page")
	public void OrangeHRMPage() {
		LoginHomePage loginHP = new LoginHomePage(webdriver);
		assertTrue(loginHP.isDisplayed());
	}
	
	//webdriver = untuk memanggil driver google chrome
	@When("User input username \"(.*)\" and password \"(.*)\"")
	public void LoginPositive(String username, String password) throws Throwable {
		LoginHomePage loginHP = new LoginHomePage(webdriver);
		loginHP.setUsername(username);
		loginHP.setPassword(password);
		loginHP.clickLogin();
	}

	@Then("User see the dashboard")
	public void verifyDashboard() throws Throwable {
		DashboardPage loginResult = new DashboardPage(webdriver);
		loginResult.verifyDashboard();
		System.out.println("Login Positive Passed");
	}

	@When("User input invalid username \"(.*)\" and password \"(.*)\"")
	public void LoginNegative(String username, String password) throws Throwable {
		LoginHomePage loginHP = new LoginHomePage(webdriver);
		loginHP.setUsername("username");
		loginHP.setPassword("password");
		loginHP.clickLogin();
	}

	@Then("User see error message")
	public void InvalidCredentials() throws Throwable {
		DashboardPage loginResult = new DashboardPage(webdriver);
		loginResult.errorMessage();
//		assertTrue(loginResult.isDisplayed());
		System.out.println("Login Negative Passed");
	}

}
