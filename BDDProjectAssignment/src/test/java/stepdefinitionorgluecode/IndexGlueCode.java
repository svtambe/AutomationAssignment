package stepdefinitionorgluecode;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.WWWConnector;

public class IndexGlueCode extends WWWConnector{
	
	
	@Given("I am on Home Page")
	public void i_am_on_Home_Page() {
		driver.get(baseUrl);
	    
	}

	@Then("I should see {string} title")
	public void i_should_see_title(String string) {
		Assert.assertEquals(string,driver.getTitle());
	    
	}

	@When("I click on {string} button")
	public void i_click_on_button(String string) {
		driver.findElement(By.xpath(string)).click();
	   
	}

	@Then("the page url should contain {string}")
	public void the_page_url_should_contain(String expectedPath) {
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedPath));
		
	}


}
