@google
Feature: Google search feature

  Scenario: Making sure google search is working as expected

    Given User is on the google homepage
    And User enters flowers keyword
    And User clicks search button
    When User clicks search button
    Then User should be see results related to flowers
