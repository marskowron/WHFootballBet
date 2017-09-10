package objects;

import org.openqa.selenium.WebElement;

import actions.GeneralActions;

public class BetBasket_Objects extends GeneralActions {

	private static WebElement element;
	
	public static WebElement getBetslipStakeInput () {
		element = waitForElement("//input[contains(@class,'betslip-selection__stake-input')]","xpath");
	return element;
	}
	
	public static WebElement getTotalReturnPriceObject () {
		element = waitForElement("total-to-return-price","id");
	return element;
	}
	
	public static WebElement getTotalStakePriceObject () {
		element = waitForElement("total-stake-price","id");
	return element;
	}
	
	public static WebElement getPlaceBetButton () {
		element = waitForElement("//*[@id='betslip-footer-actions']//input[@data-ng-click='placeBet()']","xpath");
	return element;
	}
	
	public static WebElement getClearBetBasketButton () {
		element = waitForElement("clear","class");
	return element;
	}
	
	public static WebElement getBetsNumberInfo () {
		element = waitForElement("//*[@id='betslip-tab']//span[contains(@class,'c-badge')]","xpath");
	return element;
	}
	
}
