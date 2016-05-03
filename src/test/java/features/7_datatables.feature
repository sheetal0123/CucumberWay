@datatables
Feature: Yahoo Search Results Page
  In order to test Yahoo search results
  As a user
  I want to verify search results with multiple data set

  Scenario: search result count
    Given I am on yahoo home page
    When I search for following keywords and verify result volume
      | keywords list          |
      | latest android version |
      | iphone launch news     |
      | pollution in delhi     |
    And I closed the yahoo site
