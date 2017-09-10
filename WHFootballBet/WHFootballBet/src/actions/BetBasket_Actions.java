package actions;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;

import objects.BetBasket_Objects;

public class BetBasket_Actions extends BetBasket_Objects {

	//private static final Logger log = LogManager.getLogger(SideBar_Actions.class.getName());
	private static WebElement element;
		
	public static double getTotalReturnPrice() {
		double totalReturn =  Double.parseDouble(
				getTotalReturnPriceObject().getText());
		System.out.println("Get total return of bets: " + totalReturn);
		return totalReturn;		
	}
	
	public static double getTotalStakePrice() {
		double totalStake =  Double.parseDouble(
				getTotalStakePriceObject().getText());
		System.out.println("Get total stake of bets: " + totalStake);
		return totalStake;		
	}
	
	public static void  setBetslipValue (String betslipValue) {
		element = getBetslipStakeInput();
		element.click();
		element.clear();
		element.sendKeys(betslipValue);
		System.out.println("Set besplit value: " + betslipValue);
	}
	
	public static void  placeBet () {
		getPlaceBetButton().click();
		System.out.println("Click On PlaceBid button");
	}
	
	public static void  clearBet () {
		getClearBetBasketButton().click();
		System.out.println("Click On Clear Bet button");
	}
	
	public static String getNumbersOfBets () {
		String numberOfBets = getBetsNumberInfo().getText();
		System.out.println("Current number of bets: " + numberOfBets);
		return numberOfBets;
	}
	
	public static String calculateCorrcetReturnValue (String stakeValue, String betOdds ) {
		
		double betOddsValue = Double.parseDouble(betOdds);
		double betValue = Double.parseDouble(stakeValue);
		double returnValue = (Math.floor(((betOddsValue)* betValue + betValue)*100)/100);
		String expectedRetunValue = String.valueOf(returnValue);
				
		return expectedRetunValue;
	}
	
}
