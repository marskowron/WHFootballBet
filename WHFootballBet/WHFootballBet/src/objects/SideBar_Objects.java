package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import actions.GeneralActions;

public class SideBar_Objects extends GeneralActions{
	
	static private WebElement element;
	
	public static WebElement getlistOfAllSportsContainer() {
		element = waitForElement("desktop-sidebar-az", "id");
		return element;
	}
	
	public static WebElement getSelectedSportContainer() {
		element = waitForElement("sidebar-left-context", "id");
		return element;
	}
	
	public static WebElement getSelectedSports(String selectedSport) {
		element = getlistOfAllSportsContainer().findElement(By.linkText(selectedSport));
		return element;
	}
	
	public static WebElement getSearchMenu() {
		element = waitForElement("Search", "linktext");
		return element;
	}
	
	public static WebElement getHomeMenu() {
		element = waitForElement("Home", "linktext");
		return element;
	}
	
	public static WebElement getInPlayMenu() {
		element = waitForElement("In-Play", "linktext");
		return element;
	}
	
	public static WebElement getInPlayContainerMenu() {
		element = getSelectedSportContainer().findElement(By.linkText("In-Play"));
		return element;
	}
	
	public static WebElement getDailyListContainerMenu() {
		element = getSelectedSportContainer().findElement(By.linkText("Daily List"));
		return element;
	}
	
	public static WebElement getCouponsContainerMenu() {
		element = getSelectedSportContainer().findElement(By.linkText("Coupons"));
		return element;
	}
	
	public static WebElement getCompetitionsContainerMenu() {
		element = getSelectedSportContainer().findElement(By.linkText("Competitions"));
		return element;
	}
	
	public static WebElement getStatsContainerMenu() {
		element = getSelectedSportContainer().findElement(By.linkText("Stats"));
		return element;
	}
	

}
