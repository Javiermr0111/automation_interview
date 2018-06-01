package PracticaNS.PageObjectsExpedia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By flight = By.cssSelector("button[id='tab-flight-tab-hp']");
	By origen = By.id("flight-origin-hp-flight");	
	By destiny = By.id("flight-destination-hp-flight");	
	By departing = By.id("flight-departing-hp-flight");
	By returning = By.id("flight-returning-hp-flight");
	By search = By.cssSelector("button[class='btn-primary btn-action gcw-submit']");
	
	public WebElement getFlight() {
		return driver.findElement(flight);
	}
	public WebElement getOrigen() {
		return driver.findElement(origen);
	}
	public WebElement getDestiny() {
		return driver.findElement(destiny);
	}
	public WebElement getDeparting() {
		return driver.findElement(departing);
	}
	public WebElement getReturning() {
		return driver.findElement(returning);
	}
	public WebElement getSearch() {
		return driver.findElement(search);
	}
	
	
}
