$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Insurance.feature");
formatter.feature({
  "name": "Verify Insurance Page",
  "description": "  As a GoCompare/insurance site\n  I should be navigate the Insurance page\n  So that I can find more information",
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
  "name": "I am on the Insurance Page",
  "keyword": "Given "
});
formatter.match({
  "location": "InsuranceGlueCode.i_am_on_the_Insurance_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify careers on insurance page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "I click on \"//div[@class\u003d\u0027secondary_content\u0027]/div[2]/div[@class\u003d\u0027nav\u0027]/ul/li[3]/a\" link in footer",
  "keyword": "When "
});
formatter.match({
  "location": "InsuranceGlueCode.i_click_on_link(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should go to new tab \"Come join\"",
  "keyword": "Then "
});
formatter.match({
  "location": "InsuranceGlueCode.i_should_go_to_new_tab(String)"
});
formatter.result({
  "error_message": "java.lang.IndexOutOfBoundsException: Index: 1, Size: 1\r\n\tat java.util.ArrayList.rangeCheck(ArrayList.java:653)\r\n\tat java.util.ArrayList.get(ArrayList.java:429)\r\n\tat gluecodeorstepdefinition.InsuranceGlueCode.i_should_go_to_new_tab(InsuranceGlueCode.java:44)\r\n\tat ✽.I should go to new tab \"Come join\"(features/Insurance.feature:26)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
});