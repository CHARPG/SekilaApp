Feature: Edit film wins
  Scenario: Add 1 to the films win variable
    Given I have the film ID and want to edit the wins
    When A request is made to edit the wins
    Then Edit the films wins