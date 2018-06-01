package PracticaNS.PageObjectsExpedia;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResults {

	WebDriver driver;
	
	public SearchResults(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By table_results = By.cssSelector("span[class='full-bold no-wrap']");
	
	public List<WebElement> getTable_results() {
		return driver.findElements(table_results);
	}
}
