#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login Feature
  I want to use this template for my feature file

  @login
  Scenario: Successful Login with Valid Credentials 
	Given User Launch Chrome browser 
	When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" 
	And User enters username as "Admin" and Password as "admin123" 
	And Click on Login 
	Then Page Title should be "OrangeHRM"
	Then User clicks on Logout and close the browser

 