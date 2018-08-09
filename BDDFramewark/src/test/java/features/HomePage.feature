Feature: Verify Home Page
  As a GoCompare site customer
  I should be navigate the home page
  So that I can find the stuff I need

  
  Background: 
    Given I am on home page

  # qty for interview what is background means using comment content for the all scenario
 
  
  Scenario: Verify Home Page Title
    Then I should see "GoCompare™ - The Go To Comparison Website - Official Website" title

  # goto go compare web site and write clock any where and see the head and expand head u can see the title and copy pest
 
  
  Scenario: Verify search for a car using car registration
    When I click on "//a[@alt='Get Quotes']" button
    Then I should see "car insurance [about the car]" title

  
  Scenario: Verify insurance tab in home page
    When I click on "//nav[@class='main']/ul/li[1]/a" button
    Then the page url should contain "insurance"

  
  Scenario Outline: verifying tabs in home page
    When I click on "<locator>" button
    Then the page url should contain "<path>"

    Examples: 
      | locator                         | path      |
      | //nav[@class='main']/ul/li[1]/a | insurance |
      | //nav[@class='main']/ul/li[2]/a | money     |
      | //nav[@class='main']/ul/li[3]/a | motoring  |

         
  Scenario: verify sign in on Home Page
  When I click on "//div[@class='account-container']/ul/li/a" button
  Then the page url should contain "login"
  
  
  Scenario: verify retrieve quotes on home page
  When I click on "//a[@class='button retrieve-quotes no-icon']" button
  Then the page url should contain "login" 
  
  
  # Scenario: Hover taxi insurance in business on home page
  # When I hover on "//nav[@class='main']/ul/li[7]/a" menu AND I click on "//li[@class='extra']/a/div[2]/span/ul/li[4]/a" button
  # Then It should goto "TaxiInsurancePage"
  
  
      