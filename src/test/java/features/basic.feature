@xke123
Feature: Yahoo Search Results Page
  In order to test Yahoo search results
  As a user
  I want to verify search results count

  #I am a comment
  Scenario: search result count
    Given yahoo is up and running
    And I am on yahoo home page
    When I search for test automation
    Then I verify search result count
    And I verify total result count
    But results should not be more than ten
    And I closed the yahoo site
