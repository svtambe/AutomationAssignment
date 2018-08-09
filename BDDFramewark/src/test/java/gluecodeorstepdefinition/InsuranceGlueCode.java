package gluecodeorstepdefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.WebConnector;

public class InsuranceGlueCode extends WebConnector {

	public static String insuranceUrl = "https://www.gocompare.com/insurance/";
	

@Given("I am on the Insurance Page")
public void i_am_on_the_Insurance_Page() {
   driver.get(insuranceUrl);
}

@When("I click on {string} link in footer")
public void i_click_on_link(String string) {
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	driver.findElement(By.xpath(string)).click();
}


@Then("I should go to new tab {string}")
public void i_should_go_to_new_tab(String string) {	
    List<String> handles = new ArrayList<String>(driver.getWindowHandles());    
    WebDriver newTab = driver.switchTo().window(handles.get(1));
    newTab.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
    WebDriverWait wait = new WebDriverWait(newTab, 30);
    wait.until(ExpectedConditions.titleContains(string));
    Assert.assertTrue(newTab.getTitle().contains(string));
}



}
