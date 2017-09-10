package actions;

import java.util.List;

import org.openqa.selenium.WebElement;

import objects.EventList_Objects;

public class EventList_Actions extends EventList_Objects{
	
	public EventList_Actions() {};
	
	private static List<WebElement> elements;
	private static WebElement element;
	
	
	public static WebElement chooseResultOfSelectedEvent (int eventIndex, String expectedResult) {
		
		elements = getButtonsFromSelectedEvent(eventIndex);
		WebElement buttonResult = null;
		expectedResult = expectedResult.toUpperCase();
		if (expectedResult == "1")
			buttonResult = elements.get(0);
		else if (expectedResult == "X")
			buttonResult = elements.get(1);
		else if (expectedResult == "2")	
			buttonResult = elements.get(2);
		return buttonResult;
	}
	
	public static double calculateOddsOfBet (int eventIndex, String expectedResult) {
		
		double betOdd;
		double nominator;
		double denominator;
		element = chooseResultOfSelectedEvent (eventIndex, expectedResult);
		
		nominator = Integer.parseInt(element.getAttribute("data-num"));
		denominator = Integer.parseInt(element.getAttribute("data-denom"));
		
		betOdd = nominator / denominator;
		
		return betOdd;
	}
	
	public static void doBetForSelectedEvent (int eventIndex, String expectedResult) {
		System.out.println(eventIndex + expectedResult);
		element = chooseResultOfSelectedEvent(eventIndex, expectedResult);
		element.click();
	}
}
