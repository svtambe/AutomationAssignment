Feature: Verify Insurance Page
  As a GoCompare/insurance site
  I should be navigate the Insurance page
  So that I can find more information
  
Background:
Given I am on the Insurance Page


Scenario:Verify insurance page title
Then I should see "Compare Cheap Insurance Quotes Today at GoCompare" title


Scenario: verify home insurance
When I click on "//div[@class='feature_item_2']/p/a" button
Then the page url should contain "home/Start"


Scenario: Verify terms and conditions on insurance page
When I click on "//div[@class='secondary_content']/div[2]/div[@class='nav']/ul/li[4]/a" link in footer
Then the page url should contain "about/terms"

@tag1
Scenario: Verify careers on insurance page
When I click on "//div[@class='secondary_content']/div[2]/div[@class='nav']/ul/li[3]/a" link in footer
Then I should go to new tab "Come join"

