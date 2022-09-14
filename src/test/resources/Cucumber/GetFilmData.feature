Feature: Get film data
  Scenario: Get data from the database based on id
    Given I have an ID
    When A request is made for the data
    Then Return the correct data