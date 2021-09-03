package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class EmployeeDetailPage extends BaseClass {

	public EmployeeDetailPage(WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(css = "#profile-pic > h1")
	private WebElement employeedetail;
	
	public String employeeName() {
		return employeedetail.getText();
	}

}
