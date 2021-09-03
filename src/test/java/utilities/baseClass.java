package utilities;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class baseClass {
	public static WebDriver webdriver;
	public static WebDriverWait wait;

	public void wait (WebElement webElement) {
		wait.until(ExpectedConditions.elementToBeClickable(webElement));
	}
	
	public baseClass(WebDriver webdriver) {
		baseClass.webdriver = webdriver;
		wait = new WebDriverWait(webdriver, 15);
		wait.ignoring(WebDriverException.class);
		wait.ignoring(StaleElementReferenceException.class);
	}

	public void click(WebElement webelement) {
		webelement.click();
	}

	public void input(WebElement webelement, String text) {
		webelement.sendKeys(text);
	}


}
