package objects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import actions.GeneralActions;

public class EventList_Objects extends GeneralActions{
	
	private static WebElement element;
	private static List<WebElement> elements;
	
	public static List<WebElement> getEventList () {
		elements = waitForElement("competitions-list", "id")
					.findElements(By.className("event"));
		return elements;
	}
	
	public static WebElement getEventbyIndex (int eventIndex) {
		element = getEventList().get(eventIndex);
		return element;
	}
	
	public static List<WebElement>  getButtonsFromSelectedEvent (int eventIndex) {
		elements = getEventbyIndex(eventIndex).findElements(By.tagName("button"));
		return elements;
	}
}
