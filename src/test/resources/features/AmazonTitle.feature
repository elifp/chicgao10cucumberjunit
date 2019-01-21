Feature: Amazon Title
 @amazon @ smoke @regression
  Scenario: Amazon Title verification
    When user goes to amazon application
    Then user should see proper title

    Scenario: Amazon url verification
      When user goes to amazon application
      Then user should validete url