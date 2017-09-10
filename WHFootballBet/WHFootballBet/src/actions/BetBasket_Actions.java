package actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;

import objects.BetBasket_Objects;

public class BetBasket_Actions extends BetBasket_Objects {

	private static final Logger log = LogManager.getLogger(SideBar_Actions.class.getName());
	private static WebElement element;
		
	public static double getTotalReturnPrice() {
		double totalReturn =  Double.parseDouble(
				getTotalReturnPriceObject().getText());
		log.info("Get total return of bets: " + totalReturn);
		return totalReturn;		
	}
	
	public static double getTotalStakePrice() {
		double totalStake =  Double.parseDouble(
				getTotalStakePriceObject().getText());
		log.info("Get total stake of bets: " + totalStake);
		return totalStake;		
	}
	
	public static void  setBetslipValue (String betslipValue) {
		element = getBetslipStakeInput();
		element.click();
		element.clear();
		element.sendKeys(betslipValue);
		log.info("Set besplit value: " + betslipValue);
	}
	
	public static void  placeBet () {
		getPlaceBetButton().click();
		log.info("Click On PlaceBid button");
	}
	
	public static void  clearBet () {
		getClearBetBasketButton().click();
		log.info("Click On Clear Bet button");
	}
	
	public static String getNumbersOfBets () {
		String numberOfBets = getBetsNumberInfo().getText();
		log.info("Current number of bets: " + numberOfBets);
		return numberOfBets;
	}
	
	public static String calculateCorrcetReturnValue (String stakeValue, String betOdds ) {
		
		double betOddsValue = Double.parseDouble(betOdds);
		System.out.println(betOddsValue);
		double betValue = Double.parseDouble(stakeValue);
		System.out.println(betValue);
		double returnValue = (Math.floor(((betOddsValue)* betValue + betValue)*100)/100);
		System.out.println("exp " + returnValue);
		String expectedRetunValue = String.valueOf(returnValue);
		System.out.println("exp " + expectedRetunValue);		
		return expectedRetunValue;
	}
	
}
