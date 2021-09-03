
@Login
Feature: Login 
  User want to Login OrangeHRM

  @LoginPositive
  Scenario: Valid Username and Password
  	Given User open the Orange HRM home page
    When User input username "Admin" and password "admin123"
    Then User see the dashboard
    
  @LoginNegative
  Scenario: Invalid username and password
  	Given User open the Orange HRM home page
  	When User input invalid username "admin" and password "admin"
  	Then User see error message