Feature: Testing the functionality of the SmartHospital
Background: 
Given user is navigate to login page
  @BirthRecord
  Scenario: check the birth functionality
  
    When user need to click the birth and death record
    And user click the birth record
    And user click the Add birth record
    And user enters the require values
    Then user need to click save
@DeathRecord
Scenario: check the death Functionality
 
  When user click the death record
  And user click the Add death record
  And user enters the valid entires
  Then user need to click save death record
