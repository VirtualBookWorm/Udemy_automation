#Author: aritbanerjee@deloitte.com
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
@smokeTest
@SmokeTest
Feature: Login Functionality
 Login functionality scenarios to test Login.
 
  Scenario: Logging in to Demo Web Shop
    Given User on Login page
    When User types <username> and <password>
    And clicks on Login button.
    Then Login is successful.
    
