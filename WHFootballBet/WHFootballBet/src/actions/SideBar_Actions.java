package actions;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;

import objects.SideBar_Objects;

public class SideBar_Actions extends SideBar_Objects {
	
	//private static final Logger log = LogManager.getLogger(SideBar_Actions.class.getName());

	public static void clickOnSelectedSports(String selectedSport) {
		System.out.println("Click on selected Sport Menu");
		clickWebElement(getSelectedSports(selectedSport));
	}
	
	public static void clickOnSearchMenu() {
		System.out.println("Click on Search Menu");
		clickWebElement(getSearchMenu());
	}
	
	public static void clickOnHomeMenu() {
		System.out.println("Click on Home Menu");
		clickWebElement(getHomeMenu());
	}
	
	public static void clickOnInPlayMenu() {
		System.out.println("Click on In-Play Menu");
		clickWebElement(getInPlayMenu());
	}
	
	public static void clickOnInPlayContainerMenu() {
		System.out.println("Click on In-Play Container Menu");
		clickWebElement(getInPlayContainerMenu());
	}
	
	public static void clickOnDailyListContainerMenu() {
		System.out.println("Click on Daily List Container Menu");
		clickWebElement(getDailyListContainerMenu());
	}
	
	public static void clickOnCouponsContainerMenu() {
		System.out.println("Click on Coupons Container Menu");
		clickWebElement(getCouponsContainerMenu());
	}
	
	public static void clickOnCompetitionsContainerMenu() {
		System.out.println("Click on Competitions Container Menu");
		clickWebElement(getCompetitionsContainerMenu());
	}
	
	public static void clickOnStatsContainerMenu() {
		System.out.println("Click on Stats Container Menu");
		clickWebElement(getStatsContainerMenu());
	}
	
}
