$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Ecomm Application Test",
  "description": "",
  "id": "ecomm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "validate the Ecomm Home page Test",
  "description": "",
  "id": "ecomm-application-test;validate-the-ecomm-home-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user opens the browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user enters the username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "myaccount page is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "validate the myaccount title",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStep.user_opens_the_browser()"
});
formatter.result({
  "duration": 10760372692,
  "status": "passed"
});
formatter.match({
  "location": "loginStep.user_is_on_login_page()"
});
formatter.result({
  "duration": 46975,
  "status": "passed"
});
formatter.match({
  "location": "loginStep.user_enters_the_username_and_password()"
});
formatter.result({
  "duration": 50520,
  "status": "passed"
});
formatter.match({
  "location": "loginStep.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 59322,
  "status": "passed"
});
formatter.match({
  "location": "loginStep.myaccount_page_is_displayed()"
});
formatter.result({
  "duration": 41072,
  "status": "passed"
});
formatter.match({
  "location": "loginStep.validate_the_myaccount_title()"
});
formatter.result({
  "duration": 44069,
  "status": "passed"
});
});