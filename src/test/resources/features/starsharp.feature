@stories
Feature: Log in to the StarSharp platform, create a Business Unit and finally schedule a meeting
  Background:
    Given I want to log in to the StarSharp platform
  @CreateBusinessUnit
  Scenario Outline: Create business unit
    When i enter information to create a business unit
      | nameBusinessunit   |
      | <nameBusinessunit> |
    Then i should see the name of the business unit in the table
      | verification |
      | <verification> |
    Examples:
      | nameBusinessunit | verification |
      | Businessunit     | Businessunit |


