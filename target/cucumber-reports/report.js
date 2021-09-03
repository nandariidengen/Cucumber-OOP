$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/AddEmployee.feature");
formatter.feature({
  "line": 2,
  "name": "Add Employee",
  "description": "User want to add employee",
  "id": "add-employee",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@AddEmployee"
    }
  ]
});
formatter.before({
  "duration": 9387149300,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Add Employee with valid data",
  "description": "",
  "id": "add-employee;add-employee-with-valid-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@PositiveCase"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User already login with \"Admin\" as username and \"admin123\" as password",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User open the add employee page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User input \"Nanda\" as first Name, \"Nandari\" as middle Name and \"Christin\" as last Name",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User upload photo \"worship.png\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User \"Nanda Nandari Christin\" already created",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 25
    },
    {
      "val": "admin123",
      "offset": 49
    }
  ],
  "location": "AddEmployeeSteps.loginOrangeHRM(String,String)"
});
formatter.result({
  "duration": 5963976600,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeeSteps.openAddEmployee()"
});
formatter.result({
  "duration": 3289936100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nanda",
      "offset": 12
    },
    {
      "val": "Nandari",
      "offset": 35
    },
    {
      "val": "Christin",
      "offset": 64
    }
  ],
  "location": "AddEmployeeSteps.nameEmployee(String,String,String)"
});
formatter.result({
  "duration": 621167700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "worship.png",
      "offset": 19
    }
  ],
  "location": "AddEmployeeSteps.uploadPhoto(String)"
});
formatter.result({
  "duration": 5332472800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Nanda Nandari Christin",
      "offset": 6
    }
  ],
  "location": "AddEmployeeSteps.created(String)"
});
formatter.result({
  "duration": 131440800,
  "status": "passed"
});
formatter.after({
  "duration": 172800,
  "status": "passed"
});
});