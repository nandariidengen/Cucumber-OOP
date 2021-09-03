package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class EmployeeListPage extends BaseClass {

	public EmployeeListPage(WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(id = "menu_pim_viewEmployeeList")
	private WebElement employeeList;
	
	@FindBy(id = "menu_pim_addEmployee")
	private WebElement addEmployee;
	
	public void clickEmployeeList() {
		employeeList.click();
	}
	
	public void clickAddEmployee() {
		addEmployee.click();
	}
	
	
	

	
}
