package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import actions.EventList_Actions;
import actions.SideBar_Actions;

public class EnglishFootballLeagueBet_Test extends SideBar_Actions {
	
	WebElement element;
	

	@Before
	public void setUp() throws Exception {
		Initialize();
	}

	@Test
	public void test() throws InterruptedException {
		
		String sportCategory = "Football";
		
		clickOnSelectedSports(sportCategory);
		
		clickOnCompetitionsContainerMenu();
		
		EventList_Actions.doBetForSelectedEvent(0, "1");
		
		
		
		WebElement numberOfSelection = Instance.findElement(By.id("betslip-title-selection"));
		String assertValue = numberOfSelection.getText();
		
		String betValue = "0.05";
		WebElement betInput = Instance.findElement(By.xpath("//input[contains(@class,'betslip-selection__stake-input')]"));
		betInput.click();
		betInput.sendKeys(betValue);
		
		WebElement totalToReturn = Instance.findElement(By.id("total-to-return-price"));
		String totalToReturnValue = totalToReturn.getText();
		
		double bet= Double.parseDouble(betValue);
		double betOdd = 1; //tymczasowe
		double expectedReturnValue = (Math.floor((betOdd)*bet + bet)*100)/100;
		
		String currentReturnValue = String.valueOf(expectedReturnValue);
		
		assertValue(currentReturnValue, totalToReturnValue);
		
		}

	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(3000, 1);
		//closure();	

	}
}
