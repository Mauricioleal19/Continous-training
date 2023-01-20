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
      | validationCreatebusinessUnit |
      | <validationCreatebusinessUnit> |
    Examples:
      | nameBusinessunit | validationCreatebusinessUnit |
    ##@externaldata@./src/test/resources/data/data.xlsx@BusinessUnits
   |Businessunit   |Businessunit|

  @CreateMeeting
  Scenario Outline: Create meeting
    When i enter information to create a meeting
      | meetingName   |
      | <meetingName> |
    Then i should see the meeting created
      | verificationCreateMeeting   |
      | <verificationCreateMeeting> |
    Examples:
      | meetingName |verificationCreateMeeting  |
    ##@externaldata@./src/test/resources/data/data.xlsx@Meetings
   |meeting created   |meeting created|


