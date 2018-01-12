
Feature: Search Functionality
  Scenario Outline: Search by Account Number
    Given I am logged in as CP
    When I click on Log an Incident Menu under Service Desk
    Then I should be able to search by Account Number"<accountNumber>"

    Examples:
    | accountNumber |
    | Chiswick |

  Scenario Outline: Search by Account Name
    Given I am logged in as CP
    When I click on Log an Incident Menu under Service Desk
    Then I should be able to search by Account Name"<accountName>"

    Examples:
      | accountName |
      | A New Sage Ref Co |

  Scenario Outline: Search by CLI
    Given I am logged in as CP
    When I click on Log an Incident Menu under Service Desk
    Then I should be able to search by CLI "<CLI>"

    Examples:
      |CLI|
      |01142755141|