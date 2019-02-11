$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Find elements using ID",
  "description": "",
  "id": "find-elements-using-id",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3495733250,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Find the Facebook page",
  "description": "",
  "id": "find-elements-using-id;find-the-facebook-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Test Facebook page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I access Facebook page",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#  // And I see the email id"
    }
  ],
  "line": 7,
  "name": "It dispalys the Facebook home page elements",
  "keyword": "Then "
});
formatter.match({
  "location": "TestStepDef.step()"
});
formatter.result({
  "duration": 266807304,
  "status": "passed"
});
formatter.match({
  "location": "TestStepDef.step1()"
});
formatter.result({
  "duration": 2592791194,
  "status": "passed"
});
formatter.match({
  "location": "TestStepDef.step2()"
});
formatter.result({
  "duration": 109112002,
  "status": "passed"
});
formatter.after({
  "duration": 691162926,
  "status": "passed"
});
formatter.uri("test1.feature");
formatter.feature({
  "line": 1,
  "name": "Santender web page",
  "description": "",
  "id": "santender-web-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2420572701,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "open santender web page",
  "description": "",
  "id": "santender-web-page;open-santender-web-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Test santender home page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "when i access the santender home page",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Displays the  santender home page web elements",
  "keyword": "Then "
});
formatter.match({
  "location": "WebDdriverStepDef.test_Santender_Home_Page()"
});
formatter.result({
  "duration": 19562606,
  "status": "passed"
});
formatter.match({
  "location": "WebDdriverStepDef.when_I_Access_The_Santender_Home_Page()"
});
formatter.result({
  "duration": 25204504497,
  "status": "passed"
});
formatter.match({
  "location": "WebDdriverStepDef.displays_The_Santender_Home_Page_Web_Elements()"
});
formatter.result({
  "duration": 106684,
  "status": "passed"
});
formatter.after({
  "duration": 670686793,
  "status": "passed"
});
});