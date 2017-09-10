package actions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import objects.SideBar_Objects;

public class SideBar_Actions extends SideBar_Objects {
	
	private static final Logger log = LogManager.getLogger(SideBar_Actions.class.getName());

	public static void clickOnSelectedSports(String selectedSport) {
		log.info("Click on selected Sport Menu");
		clickWebElement(getSelectedSports(selectedSport));
	}
	
	public static void clickOnSearchMenu() {
		log.info("Click on Search Menu");
		clickWebElement(getSearchMenu());
	}
	
	public static void clickOnHomeMenu() {
		log.info("Click on Home Menu");
		clickWebElement(getHomeMenu());
	}
	
	public static void clickOnInPlayMenu() {
		log.info("Click on In-Play Menu");
		clickWebElement(getInPlayMenu());
	}
	
	public static void clickOnInPlayContainerMenu() {
		log.info("Click on In-Play Container Menu");
		clickWebElement(getInPlayContainerMenu());
	}
	
	public static void clickOnDailyListContainerMenu() {
		log.info("Click on Daily List Container Menu");
		clickWebElement(getDailyListContainerMenu());
	}
	
	public static void clickOnCouponsContainerMenu() {
		log.info("Click on Coupons Container Menu");
		clickWebElement(getCouponsContainerMenu());
	}
	
	public static void clickOnCompetitionsContainerMenu() {
		log.info("Click on Competitions Container Menu");
		clickWebElement(getCompetitionsContainerMenu());
	}
	
	public static void clickOnStatsContainerMenu() {
		log.info("Click on Stats Container Menu");
		clickWebElement(getStatsContainerMenu());
	}
	
}
