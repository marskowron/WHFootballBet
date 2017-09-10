$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("footballBetTest.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 19,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 22,
  "name": "Placing a bet on football event",
  "description": "Description: This feature is to test placing a single bet on random football event\r\nAs a WH Customer \r\nI want the ability to place a bet on a football event",
  "id": "placing-a-bet-on-football-event",
  "keyword": "Feature",
  "tags": [
    {
      "line": 21,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 28,
  "name": "Place a bet on any football event",
  "description": "",
  "id": "placing-a-bet-on-football-event;place-a-bet-on-any-football-event",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 27,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "User in on the Home page of WilliamHill website",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "User chooses any \u003csportCategory\u003e events",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "predicts for the home team to win",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "and places \u003cbetslipStake\u003e bet",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "He has \"1\" bet in basket",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "it displays the odd and return",
  "keyword": "And "
});
formatter.examples({
  "line": 36,
  "name": "",
  "description": "",
  "id": "placing-a-bet-on-football-event;place-a-bet-on-any-football-event;",
  "rows": [
    {
      "cells": [
        "sportCategory",
        "betslipStake",
        "matchResult"
      ],
      "line": 37,
      "id": "placing-a-bet-on-football-event;place-a-bet-on-any-football-event;;1"
    },
    {
      "cells": [
        "\"Football\"",
        "\"0.05\"",
        "\"1\""
      ],
      "line": 38,
      "id": "placing-a-bet-on-football-event;place-a-bet-on-any-football-event;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 38,
  "name": "Place a bet on any football event",
  "description": "",
  "id": "placing-a-bet-on-football-event;place-a-bet-on-any-football-event;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 21,
      "name": "@tag"
    },
    {
      "line": 27,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "User in on the Home page of WilliamHill website",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "User chooses any \"Football\" events",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "predicts for the home team to win",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "and places \"0.05\" bet",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "He has \"1\" bet in basket",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "it displays the odd and return",
  "keyword": "And "
});
formatter.match({
  "location": "EnglishFootballLeagueBet_Test.user_in_on_the_Home_page_of_WilliamHill_website()"
});
formatter.result({
  "duration": 11459511224,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Football",
      "offset": 18
    }
  ],
  "location": "EnglishFootballLeagueBet_Test.user_chooses_any_football_events(String)"
});
formatter.result({
  "duration": 1435811871,
  "status": "passed"
});
formatter.match({
  "location": "EnglishFootballLeagueBet_Test.predicts_for_the_home_team_to_Win()"
});
formatter.result({
  "duration": 885607378,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0.05",
      "offset": 12
    }
  ],
  "location": "EnglishFootballLeagueBet_Test.and_places_bet(String)"
});
formatter.result({
  "duration": 680622784,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 8
    }
  ],
  "location": "EnglishFootballLeagueBet_Test.he_has_bet_in_basket(String)"
});
formatter.result({
  "duration": 92542968,
  "status": "passed"
});
formatter.match({
  "location": "EnglishFootballLeagueBet_Test.it_displays_the_odd_and_return(String,String)"
});
formatter.result({
  "duration": 572536,
  "error_message": "cucumber.runtime.CucumberException: Arity mismatch: Step Definition \u0027stepDefinitions.EnglishFootballLeagueBet_Test.it_displays_the_odd_and_return(String,String) in file:/C:/Users/marcin.skowron/git/WHFootballBet/WHFootballBet/WHFootballBet/bin/\u0027 with pattern [^it displays the odd and return$] is declared with 2 parameters. However, the gherkin step has 0 arguments []. \nStep: And it displays the odd and return\r\n\tat cucumber.runtime.StepDefinitionMatch.arityMismatch(StepDefinitionMatch.java:102)\r\n\tat cucumber.runtime.StepDefinitionMatch.transformedArgs(StepDefinitionMatch.java:60)\r\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:37)\r\n\tat cucumber.runtime.Runtime.runStep(Runtime.java:300)\r\n\tat cucumber.runtime.model.StepContainer.runStep(StepContainer.java:44)\r\n\tat cucumber.runtime.model.StepContainer.runSteps(StepContainer.java:39)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:44)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:678)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\r\n",
  "status": "failed"
});
});