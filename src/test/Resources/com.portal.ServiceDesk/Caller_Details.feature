
Feature: To verify Caller Details Page

  Scenario: Select Contact with Telephone Number
    Given I am logged in as CP
    And I search by Account Number
    When I click on Log an Incident
    Then I should be able to select Contact with telephone number


  Scenario: Select Contact without Telephone Number
      Given I am logged in as CP
      And I search by Account Number
      When I click on Log an Incident
      Then I should be able to select Contact without telephone number

  Scenario: Select Third Party Contact
        Given I am logged in as CP
        And I search by Account Number
        When I click on Log an Incident
        Then I should be able to select Third Party Contact