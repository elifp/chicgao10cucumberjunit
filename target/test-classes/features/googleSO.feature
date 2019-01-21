@googleSO
Feature: Google search feature

  Scenario Outline: Testing google searh functionality
    Given User is on the homepage of google
    When User enters "<searcVlaue>"
    Then USer should be see"<searchValue>" in the title

    Examples: Test data for google search functionality
    |searchValue|
    | flowers   |
    | cars      |
    | truc      |