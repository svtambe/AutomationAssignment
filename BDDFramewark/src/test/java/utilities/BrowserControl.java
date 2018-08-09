package utilities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BrowserControl extends WebConnector{
	
	@Before
	public void openBrowser () {
		
		if(browserType.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "../BDDFramewark/src/test/java/resources/chromedriver.exe"); 
			driver = new ChromeDriver();
			
		}else if (browserType.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "../BDDFramewark/src/test/java/resources/geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		
	}
	
	@After
	public void closeBrowser(){
		driver.quit();
	}
	
}

