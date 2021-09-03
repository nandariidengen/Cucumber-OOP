package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class AddEmployeePage extends BaseClass {

	public AddEmployeePage(WebDriver webdriver) {
		super(webdriver);
		PageFactory.initElements(webdriver, this);
	}
	
	@FindBy(id = "firstName")
	private WebElement firstName;
	
	@FindBy(id = "middleName")
	private WebElement middleName;
	
	@FindBy(id = "lastName")
	private WebElement lastName;
	
	@FindBy(id = "photofile")
	private WebElement photo;
	
	@FindBy(id = "btnSave")
	private WebElement save;

	public void namaDepan(String firstname) {
		firstName.sendKeys(firstname);
	}
	
	public void namaTengah(String middlename) {
		middleName.sendKeys(middlename);
	}
	
	public void namaBelakang(String lastname) {
		lastName.sendKeys(lastname);
	}
	
	public void uploadPhoto(String image) {
		String projectLocation = System.getProperty("user.dir");
		String path = projectLocation + "//lib//photo//";
		path = path + image;
		photo.sendKeys(path);
	}
	
	public void clickSave() {
		save.click();
	}
}
