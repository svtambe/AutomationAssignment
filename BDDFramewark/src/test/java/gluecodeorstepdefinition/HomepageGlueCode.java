package gluecodeorstepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.WebConnector;

public class HomepageGlueCode extends WebConnector {

	@Given("I am on home page")
	public void i_am_on_Home_Page() {
		driver.get(baseUrl);
	}

	@Then("I should see {string} title")
	public void i_should_see_title(String expectedTitle) {
		Assert.assertEquals(expectedTitle, driver.getTitle());
	}

	@When("I click on {string} button")
	public void i_click_on_butten(String locator) {
		driver.findElement(By.xpath(locator)).click();
	}

	@Then("the page url should contain {string}")
	public void the_page_url_should_contain(String expectedPath) {

		Assert.assertTrue(driver.getCurrentUrl().contains(expectedPath));

	}
	
	/* @When("I hover on {string} menu AND I click on {string} button")
	public void i_hover_on_menu_AND_I_click_on_button(String string, String string2) {
		WebElement webElement = driver.findElement(By.xpath(string));
	    Actions action = new Actions(driver);
	    action.moveToElement(webElement).moveToElement(webElement.findElement(By.xpath(string2))).click();
	}

	@Then("It should goto {string}")
	public void it_should_goto(String string) {
		Assert.assertTrue(driver.getCurrentUrl().contains(string));
	} */	
}
