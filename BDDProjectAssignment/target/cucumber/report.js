$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/IndexPage.feature");
formatter.feature({
  "name": "Verify the home page",
  "description": "As a Budget Trolley customer site\nI should navigate the home page\nSo that I can find need information ",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "IndexGlueCode.i_am_on_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "verify contact us on Home Page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "I click on \"//ul[@class\u003d\u0027info\u0027]/li[2]/a\" button",
  "keyword": "When "
});
formatter.match({
  "location": "IndexGlueCode.i_click_on_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the page url should contain \"contactus\"",
  "keyword": "Then "
});
formatter.match({
  "location": "IndexGlueCode.the_page_url_should_contain(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});