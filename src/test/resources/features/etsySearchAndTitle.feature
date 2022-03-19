@etsy @etsySearchAndTitle
Feature: Etsy search and titles features

  Scenario: Etsy title verification
    Given User is on the Etsy home page
    Then User sees title is as expected

    #without parameterization
  Scenario: Etsy Search Functionality Title Verification
    Given User is on the Etsy home page
    When User types "Wooden Spoon" in the search box
    And User clicks etsy search button
    Then User sees "Wooden spoon | Etsy" is in the title

    #with parameterization
  Scenario Outline: Etsy Search Functionality Title Verification
    Given User is on the Etsy home page
    When User types "<searchValue>" in the search box
    And User clicks etsy search button
    Then User sees "<expectedTitle>" is in the title
    Examples:
      | searchValue  | expectedTitle |
      | Wooden Spoon | Wooden spoon  |
