Feature: Portal login functionality

  Scenario Outline: Login as CP
    Given I am on login page
    When I enter "<username>" and "<password>" of CP
    Then I should be able to login successfully as CP

    Examples:
      |username|password|
    |adamr|password|

  Scenario Outline: Login as Reseller
    Given I am on login page
    When I enter "<username>" and "<password>" of Reseller
    Then I should be able to login successfully as Reseller

    Examples:
      |username|password|
      |adam.reseller|password|

  Scenario Outline: Login as Agent
    Given I am on login page
    When I enter "<username>" and "<password>" of Agent
    Then I should be able to login successfully as Agent

    Examples:
      |username|password|
      |sukhn|123|

