$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LiveCasio.feature");
formatter.feature({
  "line": 2,
  "name": "Login page",
  "description": "",
  "id": "login-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5351121900,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "As a user I want to click on login tab",
  "description": "",
  "id": "login-page;as-a-user-i-want-to-click-on-login-tab",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on Virgin games homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I acceptCookies",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I am clicking on All Games link",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I am on All Games page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I verify the text \"Online Slots\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.iAmOnVirginGamesHomepage()"
});
formatter.result({
  "duration": 105685900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iAcceptCookies()"
});
formatter.result({
  "duration": 125486500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iAmClickingOnAllGamesLink()"
});
formatter.result({
  "duration": 112152900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.iAmOnAllGamesPage()"
});
formatter.result({
  "duration": 41300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Online Slots",
      "offset": 19
    }
  ],
  "location": "LoginSteps.iVerifyText(String)"
});
formatter.result({
  "duration": 320270000,
  "status": "passed"
});
formatter.after({
  "duration": 897478900,
  "status": "passed"
});
});