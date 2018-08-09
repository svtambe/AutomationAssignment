package utilities;

import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class FirefoxControl extends WWWConnector{
	
	@Before
	public void openBrowser (){	
		if(browserType.equals("firefox")){
			System.setProperty("webdriver.gecko.driver", "../BDDProjectAssignment/src/test/java/resources/geckodriver.exe");
			driver = new FirefoxDriver();	
		}
	}
	
	@After
	public void closeBrowser(){
		driver.quit();
	}
	
	
	
}
