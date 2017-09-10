package actions;

import java.util.List;

import org.openqa.selenium.WebElement;

import objects.EventList_Objects;

public class EventList_Actions extends EventList_Objects{
	
	public EventList_Actions() {};
	
	private static List<WebElement> elements;
	private static WebElement element;
	
	
	public static WebElement chooseResultOfSelectedEvent (int eventIndex, int expectedResult) throws Exception {
		
		elements = getButtonsFromSelectedEvent(eventIndex);
		
		//throwing exception -> searched event is not "Win/Draw/Lose" type event
		
		if (elements.size() != 3)
		      throw new Exception("Incorrect event");

		    System.out.println("Searched event is not \"Win/Draw/Lose\" type event");
		
		WebElement buttonResult = null;

		if (expectedResult == 1)
			buttonResult = elements.get(0);
		else if (expectedResult == 2)
			buttonResult = elements.get(1);
		else if (expectedResult == 3)	
			buttonResult = elements.get(2);
		return buttonResult;
	}
	
	public static double calculateOddsOfBet (int eventIndex, int expectedResult) throws Exception {
		
		double betOdd;
		double nominator;
		double denominator;
		element = chooseResultOfSelectedEvent (eventIndex, expectedResult);
		
		nominator = Integer.parseInt(element.getAttribute("data-num"));
		denominator = Integer.parseInt(element.getAttribute("data-denom"));
		
		betOdd = nominator / denominator;
		
		return betOdd;
	}
	
	public static void doBetForSelectedEvent (int eventIndex, int expectedResult) throws Exception {
		element = chooseResultOfSelectedEvent(eventIndex, expectedResult);
		element.click();
	}
}
