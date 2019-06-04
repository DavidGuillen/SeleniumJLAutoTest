package tuto.eclipse.jal.selenium.pageObjects.homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import tuto.eclipse.jal.selenium.loaders.MyDriver;

public class HomePageActions {

	/*
	 * ACTIONS
	 */
	protected void clickSearchButton() {
		MyDriver.driver.findElement(By.id(HomePageIDs.SEARCH_BUTTON_ID)).click();
	}

	protected void closeModal() {
		MyDriver.driver.findElements(By.cssSelector(HomePageIDs.MODAL_CLOSE_BUTTON_CSS)).get(1).click();

	}

	protected void setDepartureDate(String departureDay, String departureMonth) {
		Select s = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_DATE_1_DAY)));
		s.selectByValue(departureDay);
		s = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_DATE_1_MONTH)));
		s.selectByValue(departureMonth);
	}

	protected void selectDepartureCity(String departureCityCode) {
		Select s = new Select(MyDriver.driver.findElement(By.id(HomePageIDs.DEPARTURE_FROM_CITY_ID)));
		s.selectByValue(departureCityCode);
	}

	/*
	 * CHECKS
	 */
}
