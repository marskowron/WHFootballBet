package stepDefinitions;

import org.openqa.selenium.WebElement;

import actions.BetBasket_Actions;
import actions.EventList_Actions;
import actions.SideBar_Actions;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EnglishFootballLeagueBet_Test extends SideBar_Actions {
	
	WebElement element;
	
	@Given("^User in on the Home page of WilliamHill website$")
	public void startsBrowserWithSelectedPage() {
		Initialize();

	}

	@When("^User chooses any \"([^\"]*)\" events$")
	public void chooseSportCategory(String sportCategory) {
		
		clickOnSelectedSports(sportCategory);
		clickOnCompetitionsContainerMenu();
	    
	}

	@When("^predicts for (\\d+) the home team to (\\d+)$")
	public void selectSportEventAndPlaceBet(int eventIndex, int matchResult) throws Exception {
		eventIndex -=1; //index on list starts with 0 
		EventList_Actions.doBetForSelectedEvent(0, matchResult);
	}

	@When("^and places \"([^\"]*)\" bet$")
	public void settleBetslip(String stakeValue)  {
		
		BetBasket_Actions.setBetslipValue(stakeValue);
		
	}

	@Then("He has \"([^\"]*)\" bet in basket")
	public void valideteNumberOfBets(String expectedNumberOfBets)  {

		String currentNumberOfBets = BetBasket_Actions.getNumbersOfBets();
		assertValue(currentNumberOfBets, expectedNumberOfBets);
		
	}

	@Then("^it displays the odd and return according to \"([^\"]*)\" stake, (\\d+) and (\\d+)$")
	public void validateTotalReturnValue(String stakeValue, int indexEvent, int matchResult) throws Exception  {
		
		indexEvent -=1; //index on list starts with 0 
		String betOdds = String.valueOf(EventList_Actions.calculateOddsOfBet(0, matchResult));
		
		String expectedReturnValue = BetBasket_Actions.calculateCorrcetReturnValue(stakeValue, betOdds);
		String totalToReturnValue = String.valueOf(BetBasket_Actions.getTotalReturnPrice());
				
		assertValue(totalToReturnValue,expectedReturnValue);
		
	}
	
	@After
	public void tearDown() throws Exception {
		closure();	
	}
}
