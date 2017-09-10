$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("footballBetTest.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: Marcin Skowron"
    }
  ],
  "line": 4,
  "name": "Placing a bet on football event",
  "description": "Description: This feature is to test placing a single bet on random football event\r\nAs a WH Customer \r\nI want the ability to place a bet on a football event",
  "id": "placing-a-bet-on-football-event",
  "keyword": "Feature",
  "tags": [
    {
      "line": 3,
      "name": "@tag"
    }
  ]
});
formatter.scenarioOutline({
  "line": 10,
  "name": "Place a bet on any football event",
  "description": "",
  "id": "placing-a-bet-on-football-event;place-a-bet-on-any-football-event",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User in on the Home page of WilliamHill website",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "User chooses any \u003csportCategory\u003e events",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "predicts for \u003cindexEvent\u003e the home team to \u003cmatchResult\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "and places \u003cbetslipStake\u003e bet",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "He has \"1\" bet in basket",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "it displays the odd and return according to \u003cbetslipStake\u003e stake, \u003cindexEvent\u003e and \u003cmatchResult\u003e",
  "keyword": "And "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "placing-a-bet-on-football-event;place-a-bet-on-any-football-event;",
  "rows": [
    {
      "cells": [
        "sportCategory",
        "betslipStake",
        "matchResult",
        "indexEvent"
      ],
      "line": 20,
      "id": "placing-a-bet-on-football-event;place-a-bet-on-any-football-event;;1"
    },
    {
      "cells": [
        "\"Football\"",
        "\"0.05\"",
        "1",
        "1"
      ],
      "line": 21,
      "id": "placing-a-bet-on-football-event;place-a-bet-on-any-football-event;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 21,
  "name": "Place a bet on any football event",
  "description": "",
  "id": "placing-a-bet-on-football-event;place-a-bet-on-any-football-event;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@tag"
    },
    {
      "line": 9,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User in on the Home page of WilliamHill website",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "User chooses any \"Football\" events",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "predicts for 1 the home team to 1",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "and places \"0.05\" bet",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "He has \"1\" bet in basket",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "it displays the odd and return according to \"0.05\" stake, 1 and 1",
  "matchedColumns": [
    1,
    2,
    3
  ],
  "keyword": "And "
});
formatter.match({
  "location": "EnglishFootballLeagueBet_Test.startsBrowserWithSelectedPage()"
});
formatter.result({
  "duration": 10877334380,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Football",
      "offset": 18
    }
  ],
  "location": "EnglishFootballLeagueBet_Test.chooseSportCategory(String)"
});
formatter.result({
  "duration": 1387367157,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 13
    },
    {
      "val": "1",
      "offset": 32
    }
  ],
  "location": "EnglishFootballLeagueBet_Test.selectSportEventAndPlaceBet(int,int)"
});
formatter.result({
  "duration": 730016667,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0.05",
      "offset": 12
    }
  ],
  "location": "EnglishFootballLeagueBet_Test.settleBetslip(String)"
});
formatter.result({
  "duration": 787365819,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 8
    }
  ],
  "location": "EnglishFootballLeagueBet_Test.valideteNumberOfBets(String)"
});
formatter.result({
  "duration": 93395749,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0.05",
      "offset": 45
    },
    {
      "val": "1",
      "offset": 58
    },
    {
      "val": "1",
      "offset": 64
    }
  ],
  "location": "EnglishFootballLeagueBet_Test.validateTotalReturnValue(String,int,int)"
});
formatter.result({
  "duration": 149527981,
  "status": "passed"
});
formatter.after({
  "duration": 1364420178,
  "status": "passed"
});
});