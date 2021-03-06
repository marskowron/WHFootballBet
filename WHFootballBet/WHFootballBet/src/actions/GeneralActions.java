package actions;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import driver.Driver;
import actions.GeneralActions;

public class GeneralActions extends Driver{

	//private static final Logger log = LogManager.getLogger(GeneralActions.class.getName());
	private static int defaultTimeout = 20;
	static WebElement element;
	static List<WebElement> elements;
	
	//general method which finds element
	public static WebElement getElement(String locator, String type) {
		type = type.toLowerCase();
		if (type.equals("id")) {
			System.out.println("Element found with id: " + locator);
			return Instance.findElement(By.id(locator));
		}
		else if (type.equals("name")) {
			System.out.println("Element found with name: " + locator);
			return Instance.findElement(By.name(locator));
		}
		else if (type.equals("xpath")) {
			System.out.println("Element found with xpath: " + locator);
			return Instance.findElement(By.xpath(locator));
		}
		else if (type.equals("css")) {
			System.out.println("Element found with css: " + locator);
			return Instance.findElement(By.cssSelector(locator));
		}
		else if (type.equals("classname")) {
			System.out.println("Element found with classname: " + locator);
			return Instance.findElement(By.className(locator));
		}
		else if (type.equals("tagname")) {
			System.out.println("Element found with tagname: " + locator);
			return Instance.findElement(By.tagName(locator));
		}
		else if (type.equals("linktext")) {
			System.out.println("Element found with link text: " + locator);
			return Instance.findElement(By.linkText(locator));
		}
		else if (type.equals("partiallinktext")) {
			System.out.println("Element found with partial link text: " + locator);
			return Instance.findElement(By.partialLinkText(locator));
		}
		else {
			System.out.println("Locator type not supported");
			return null;
		}
	}
	
	//method which waiting until element is visible
	public static WebElement waitForElement(String locator, String type) {
		WebElement searchedElement = getElement(locator, type);
		
		try {
			System.out.println("Waiting for element: " + searchedElement+ " to be available");
			WebDriverWait wait = new WebDriverWait(Instance, defaultTimeout);
			element = wait.until(
					ExpectedConditions.visibilityOf(searchedElement));
			System.out.println("Element " + searchedElement+" appeared on the web page");	
		} catch(Exception e) {
			System.out.println("Element " + searchedElement+" not appeared on the web page");
		}
		return element;
	}
	
	public static WebElement waitForElementForDefineTime(WebElement waitElement, int timeout) {
		try {
			System.out.println("Waiting for: " + timeout + " seconds for element: " + waitElement+" to be available");
			
			WebDriverWait wait = new WebDriverWait(Instance, timeout);
			element = wait.until(
					ExpectedConditions.elementToBeClickable(waitElement));
			System.out.println("Element " + waitElement+" appeared on the web page");	
		} catch(Exception e) {
			System.out.println("Element " + waitElement+" not appeared on the web page");
		}
		return element;
	}
	
	public static WebElement waitForElement(WebElement waitElement) {
		int timeout = defaultTimeout;
		return waitForElementForDefineTime(waitElement, timeout);
	}
	
	public static void clickWebElement (WebElement elementToClick) {
		element = waitForElement(elementToClick);
		elementToClick.click();
	}
	
	
	public static void findAndClickElement (String locator, String type) {
		element = waitForElement(locator, type);
		element.click();
	}
	
	public static void assertValue (String currentValue, String expectedValue) {
		System.out.println("Current value: " + currentValue + " || Expected value: " + expectedValue);
		Assert.assertEquals(currentValue, expectedValue);
		}
	
}
