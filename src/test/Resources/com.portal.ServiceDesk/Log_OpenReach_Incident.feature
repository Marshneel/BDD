
Feature: Openreach Incident

  Scenario Outline: Log Openreach Incident for CR Line
    Given I am logged in as CP
    And I search by "<CLI>"
    When I click on Log an Incident
    And I select Contact with telephone number
    Then I should be able to log Openreach Incident

    Examples:
      |CLI|
      |01142759393|