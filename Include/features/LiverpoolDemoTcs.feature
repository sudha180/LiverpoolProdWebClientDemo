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
Feature: AccountManagement
  I want to use this template for my AccountManagement feature file

  @valid
  Scenario Outline: Login to Liverpool Site with valid credentials
    Given I navigate to Liverpool Site
    When I click login button in homepage
    And I enter a valid username <userName> and valid password <password>
    Then I should be able to login successfully and verify the HelloFisrtName in homepage

    Examples: 
      | userName                      | password  |
      | sudha.addepalli6662@gmail.com | Test1234$ |

  @invalid
  Scenario Outline: Login to Liverpool Site with invalid credentials
    Given I navigate to Liverpool Site
    When I click login button in homepage
    And I enter an invalid username <invaliduserName> and valid password <password>
    Then I should not be able to login successfully

    Examples: 
      | invaliduserName                     | password  |
      | sudha.addepalli6662@gmail.co | Test1234$ |
