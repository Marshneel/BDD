
Feature: Non-Openreach Incident

  Scenario: Log a non-openreach Incident
    Given I am logged in as CP
    And  I search by Account Number
    When I click on Log an Incident
    And I select Contact with telephone number
    Then I should be able to log non openreach Incident

  Scenario: Log a non-openreach Incident with Third Party Contact
    Given I am logged in as CP
    And  I search by Account Number
    When I click on Log an Incident
    And I select Third Party Contact
    Then I should be able to log non openreach Incident