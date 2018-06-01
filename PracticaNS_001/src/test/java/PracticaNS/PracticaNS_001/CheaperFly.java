package PracticaNS.PracticaNS_001;

import java.io.IOException;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import PracticaNS.PageObjectsExpedia.HomePage;
import PracticaNS.PageObjectsExpedia.SearchResults;
import junit.framework.Assert;
import resources.Base;

public class CheaperFly extends Base{
	
	static HomePage hp;
	static SearchResults sr;
	@BeforeClass
	public static void setup() throws IOException {
		driver=initializerDriver();
		hp = new HomePage(driver);
	    sr = new SearchResults(driver);
	    
	}
	
	@Test
	public void searchflights(){
	driver.get("https://www.expedia.com/");
	HomePage hp = new HomePage(driver);
    SearchResults sr = new SearchResults(driver);
    
    
    hp.getFlight().click();
	hp.getOrigen().sendKeys("Chihuahua, Chihuahua, Mexico (CUU-General Roberto Fierro Villalobos Intl.)");
	hp.getDestiny().sendKeys("Cancun, Quintana Roo, Mexico");
	hp.getDeparting().sendKeys("06/01/2018");
	hp.getReturning().clear();
	hp.getReturning().sendKeys("06/08/2018");
	hp.getSearch().click();
	
	String raw_price = sr.getTable_results().get(0).getText().substring(1);
	int price = Integer.parseInt(raw_price);
	boolean Test;
	if (price>=412) {
		Test=true;		
	}
	else {
		Test=false;
	}
	Assert.assertTrue(Test);

	
	}
	@After
	public void exit() {
		driver.close();
	}

}
