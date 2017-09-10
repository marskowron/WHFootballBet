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
Feature: Placing a bet on football event
Description: This feature is to test placing a single bet on random football event
	As a WH Customer 
	I want the ability to place a bet on a football event

@tag1
Scenario Outline: Place a bet on any football event
Given User in on the Home page of WilliamHill website
When User chooses any football events
	And predicts for the home team to <match_result>
	And and places <betslip_stake> bet
Then He has 1 bet in basket
	And it displays the odd and return

Examples:
    | betslip_stake  |match_result |
    | 0.05 |  Win   | 
 
