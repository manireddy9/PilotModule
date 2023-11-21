Feature: Checking the Functionality of Birth and Death
Background:
  Given user need to be login into the page
  Given the user is on the birth and death records page
  @BirthRecord
  Scenario: Check the birth functionality
    When the user clicks on Birth and Death Record
    And the user clicks on Birth Record
    And the user clicks on Add Birth Record
    And the user enters the required values for birth record
    And the user clicks Save
    Then the birth record should be successfully saved
 @DeathRecord
  Scenario: Check the death functionality
    When the user clicks on Death Record
    And the user clicks on Add Death Record
    And the user enters valid entries for death record
    And the user clicks Save Death Record
    Then the death record should be successfully saved
