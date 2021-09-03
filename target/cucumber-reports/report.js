$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/Login.feature");
formatter.feature({
  "line": 3,
  "name": "Login",
  "description": "User want to Login OrangeHRM",
  "id": "login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@Login"
    }
  ]
});
formatter.before({
  "duration": 7038522300,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Valid Username and Password",
  "description": "",
  "id": "login;valid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User open the Orange HRM home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User input username \"Admin\" and password \"admin123\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User see the dashboard",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.openOrangeHRMPage()"
});
formatter.result({
  "duration": 773518300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 21
    },
    {
      "val": "admin123",
      "offset": 42
    }
  ],
  "location": "LoginPageSteps.LoginPositive(String,String)"
});
formatter.result({
  "duration": 3861508600,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.verifyDashboard()"
});
formatter.result({
  "duration": 62411800,
  "status": "passed"
});
formatter.after({
  "duration": 969699000,
  "status": "passed"
});
formatter.before({
  "duration": 4976022400,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Invalid username and password",
  "description": "",
  "id": "login;invalid-username-and-password",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "User open the Orange HRM home page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "User input invalid username \"admin\" and password \"admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "User see error message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.openOrangeHRMPage()"
});
formatter.result({
  "duration": 379370100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 29
    },
    {
      "val": "admin",
      "offset": 50
    }
  ],
  "location": "LoginPageSteps.LoginNegative(String,String)"
});
formatter.result({
  "duration": 1355072200,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.InvalidCredentials()"
});
formatter.result({
  "duration": 55622800,
  "status": "passed"
});
formatter.after({
  "duration": 903124700,
  "status": "passed"
});
});