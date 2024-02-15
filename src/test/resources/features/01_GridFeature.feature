@Grid
Feature: Grid Login

  Scenario: Contact list
    Given user goes to ""
    When user enters mail ""
    And user enters password ""
    And user clicks submit button
    Then assert logout button