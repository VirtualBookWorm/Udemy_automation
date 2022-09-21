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
Feature: Add to cart functionality
   Following functionality scenarios to test

  @tag1
  Scenario: Search the product and successfully add to cart
    Given User on DemoWebShop
    When User login into the webpage
    And Search for the product 
    And Add product into cart
    Then Validate the outcome
