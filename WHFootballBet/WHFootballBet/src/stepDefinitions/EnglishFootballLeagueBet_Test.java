package stepDefinitions;

import org.openqa.selenium.WebElement;

import actions.BetBasket_Actions;
import actions.EventList_Actions;
import actions.SideBar_Actions;
import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EnglishFootballLeagueBet_Test extends SideBar_Actions {
	
	WebElement element;
	String stakeValue = "0.05";
	String betOdds = "1.3";
	
	@Given("^User in on the Home page of WilliamHill website$")
	public void user_in_on_the_Home_page_of_WilliamHill_website() {
		Initialize();

	}

	@When("^User chooses any \"([^\"]*)\" events$")
	public void user_chooses_any_football_events(String sportCategory) {
		
		clickOnSelectedSports(sportCategory);
		clickOnCompetitionsContainerMenu();
	    
	}

	@When("predicts for the home team to win$")
	public String predicts_for_the_home_team_to_Win() {
		String matchResult = "1";
		EventList_Actions.doBetForSelectedEvent(0, matchResult);
		String betOdds = String.valueOf(EventList_Actions.calculateOddsOfBet(0, matchResult));
		return betOdds;
	    
	}

	@When("^and places \"([^\"]*)\" bet$")
	public void and_places_bet(String stakeValue)  {
		
		BetBasket_Actions.setBetslipValue(stakeValue);
		
	}

	@Then("He has \"([^\"]*)\" bet in basket")
	public void he_has_bet_in_basket(String expectedNumberOfBets)  {

		String currentNumberOfBets = BetBasket_Actions.getNumbersOfBets();
		assertValue(currentNumberOfBets, expectedNumberOfBets);
		
	}

	@Then("^it displays the odd and return$")
	public void it_displays_the_odd_and_return(String stakeValue, String betOdds)  {

		String expectedReturnValue = BetBasket_Actions.calculateCorrcetReturnValue(stakeValue, betOdds);
		String totalToReturnValue = String.valueOf(BetBasket_Actions.getTotalReturnPrice());
				
		assertValue(totalToReturnValue,expectedReturnValue);
		
	}

	
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		closure();	
	}
}
