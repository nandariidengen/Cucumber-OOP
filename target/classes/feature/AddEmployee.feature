@AddEmployee
Feature: Add Employee
	User want to add employee

@PositiveCase
	Scenario: Add Employee with valid data
		Given User already login with "Admin" as username and "admin123" as password
		When User open the add employee page
		And User input "Nanda" as first Name, "Nandari" as middle Name and "Christin" as last Name
		And User upload photo "worship.png"
		Then User "Nanda Nandari Christin" already created
	