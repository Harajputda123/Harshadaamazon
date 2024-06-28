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


@loginfunction
Feature: Login functionality


@withoutparameter
Scenario: To check the login with user data

Given Url is running 

When user enters valid username
And valid password 

Then user should be able to login 


@withparameter
Scenario: To check login with parameters passing


Given Url is running 
When user enters valid username "jhanvi12345"// Firstname
And valid password "jhanvi@12345"
Then user should be able to login 


@datadriven
Scenario Outline: To check login with data driven  passing


Given Url is running 
When user enters valid username <Username>
And valid password <pass>
Then user should be able to login 


Examples: 

|Username|pass     |
|Ruhi    |Ruhi123  |
|priya   |Priya213 |
|tushar  |tushar123|
|rutu    |tutu123  |



















