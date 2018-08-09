
Feature: Verify the home page
As a Budget Trolley customer site
I should navigate the home page
So that I can find need information 

  Background: 
  Given I am on Home Page
  
  Scenario: Verify home page title
    Then I should see "Budget Trolley | search compare products from different stores across multiple categories. check prices from different stores." title
    

  Scenario: Verify Mobiles tab on home page
  When I click on "//div[@id='bs-megadropdown-tabs']/ul/li[2]/a" button
  Then the page url should contain "mobiles"
  
  
  
  Scenario Outline: Verify tabs on home page
   When I click on "<locator>" button
   Then the page url should contain "<path>" 

    Examples: 
     | locator                                      | path        |
     | //div[@id='bs-megadropdown-tabs']/ul/li[3]/a | Tablets     |
     | //div[@id='bs-megadropdown-tabs']/ul/li[4]/a | Laptops     |
     | //div[@id='bs-megadropdown-tabs']/ul/li[5]/a | Desktops    | 
     | //div[@id='bs-megadropdown-tabs']/ul/li[6]/a | Televisions |
     
      
  Scenario: Verify information About us on Home Page
  When I click on "//a[@href='/aboutus']" button
  
  Scenario: verify view all button for Top ranking mobiles on home page 
  When I click on "//a[@class='btn btn-primary view-all']" button
  Then I should see "Budget Trolley | search compare products from different stores across multiple categories. check prices from different stores." title
  
  @tag1
  Scenario: verify information contact us on Home Page
  When I click on "//ul[@class='info']/li[2]/a" button
  Then the page url should contain "contactus" 
  