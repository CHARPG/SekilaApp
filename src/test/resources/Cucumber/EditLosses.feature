Feature: Edit film losses
  Scenario: Add 1 to the films loss variable
    Given I have the film ID and want to edit the losses
    When A request is made to edit the losses
    Then Edit the films losses