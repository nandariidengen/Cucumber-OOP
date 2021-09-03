package step_definition;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page_object.AddEmployeePage;
import page_object.DashboardPage;
import page_object.EmployeeDetailPage;
import page_object.EmployeeListPage;
import page_object.LoginHomePage;

public class AddEmployeeSteps {
	private WebDriver webdriver;

	public AddEmployeeSteps() {
		super();
		this.webdriver = Hooks.webdriver;
	}
	
	@Given("User already login with \"(.*)\" as username and \"(.*)\" as password")
	public void loginOrangeHRM(String username, String password) throws Throwable {
		LoginPageSteps loginPageStep = new LoginPageSteps();
		loginPageStep.LoginPositive(username, password);
		loginPageStep.verifyDashboard();
	}
	
	@When("User open the add employee page")
	public void openAddEmployee() {
		DashboardPage dashboard = new DashboardPage(webdriver);
		dashboard.clickPIM();
		
		EmployeeListPage employeeList = new EmployeeListPage(webdriver);
		employeeList.clickAddEmployee();
		
	}
	
	@When("User input \"(.*)\" as first Name, \"(.*)\" as middle Name and \"(.*)\" as last Name")
	public void nameEmployee(String firstname, String middlename, String lastname) {
		AddEmployeePage addEmployee = new AddEmployeePage(webdriver);
		addEmployee.namaDepan(firstname);
		addEmployee.namaTengah(middlename);
		addEmployee.namaBelakang(lastname);
	}
	
	@When("User upload photo \"(.*)\"")
	public void uploadPhoto(String image) {
		AddEmployeePage addEmployee = new AddEmployeePage(webdriver);
		addEmployee.uploadPhoto(image);
		addEmployee.clickSave();
	}
	
	@Then("User \"(.*)\" already created")
	public void created(String name) {
		EmployeeDetailPage detailpage = new EmployeeDetailPage(webdriver);
		detailpage.employeeName();
		Assert.assertEquals(detailpage.employeeName(), name);
	}
	
	
	
	
}
