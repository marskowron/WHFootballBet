#Author: Marcin Skowron

@tag
Feature: Placing a bet on football event
Description: This feature is to test placing a single bet on random football event
	As a WH Customer 
	I want the ability to place a bet on a football event

@tag1
Scenario Outline: Place a bet on any football event
Given User in on the Home page of WilliamHill website
When User chooses any <sportCategory> events
	And predicts for <indexEvent> the home team to <matchResult>
	And and places <betslipStake> bet
Then He has "1" bet in basket
	And it displays the odd and return according to <betslipStake> stake, <indexEvent> and <matchResult>


Examples:
    | sportCategory  | betslipStake  | matchResult  | indexEvent  |
    | "Football"  | "0.05"  | 1  | 1  |
 
