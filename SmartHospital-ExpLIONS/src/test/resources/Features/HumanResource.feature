Feature: Check the Functinality of Human Resource
Background:
Given user need to be login into the page
Given User is on the Human Resource module
Scenario: Add Staff
  When user clicks on Add Staff
  And user fills in the required fields
  Then user saves the staff information
Scenario: Record Staff Attendance
  When user clicks on Staff Attendance
  And user provides the staff attendance
  And user saves the attendance record
  Then the attendance record is successfully saved
