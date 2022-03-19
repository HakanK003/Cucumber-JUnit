@dataTableMonthDropdown @task
Feature: Dropdown months feature


  Scenario: User should be able to see all 12 months in months dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |