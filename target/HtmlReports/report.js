$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/SimpleLogin.feature");
formatter.feature({
  "name": "simple login feature on example.testproject.io/web",
  "description": "  Login test on example.testproject.io/web",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate simple login automation steps",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "webbrowser is open",
  "keyword": "Given "
});
formatter.step({
  "name": "user is now on login page",
  "keyword": "And "
});
formatter.step({
  "name": "user enters his \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "login button is pressed",
  "keyword": "And "
});
formatter.step({
  "name": "user navigated to home page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Amit",
        "12345"
      ]
    },
    {
      "cells": [
        "Ele",
        "12345"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate simple login automation steps",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "webbrowser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.SimpleLoginDemo_PF.webbrowser_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is now on login page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.SimpleLoginDemo_PF.user_is_now_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters his Amit and 12345",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.SimpleLoginDemo_PF.user_enters_his_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login button is pressed",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.SimpleLoginDemo_PF.login_button_is_pressed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigated to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.SimpleLoginDemo_PF.user_navigated_to_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate simple login automation steps",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "webbrowser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.SimpleLoginDemo_PF.webbrowser_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is now on login page",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.SimpleLoginDemo_PF.user_is_now_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters his Ele and 12345",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.SimpleLoginDemo_PF.user_enters_his_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login button is pressed",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.SimpleLoginDemo_PF.login_button_is_pressed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigated to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.SimpleLoginDemo_PF.user_navigated_to_home_page()"
});
formatter.result({
  "status": "passed"
});
});