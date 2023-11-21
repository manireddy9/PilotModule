Feature: Checking the Functionality of Finance
Background:
  Given user need to be login into the page
  Given User is on the finance module
@FinanceIncome
Scenario: Check the Income Functionality
  When user clicks on Income
  And user clicks on  Add Income 
  And user enters the required entries for income
  Then user validates the income record
@FinanceExpenses
Scenario: Check the Expenses Functionality
  When user clicks on Expenses
  And user clicks on Add Expenses
  And user enters the details for expenses
  And user saves the expense record
  Then user validates the expense record