@yahoo
Feature: Yahoo Search Results Page
  In order to test Yahoo search results
  As a user
  I want to verify search results count

  #  Scenario: Not a readable scenario
  #    Given yahoo is up and running
  #    Given I am on yahoo home page
  #    When I search for test automation
  #    Then I verify search result count
  #    Then I verify total result count
  #    Then results should not be more than ten
  #    Then I closed the yahoo site
  Scenario: search result count e
    Given yahoo is up and running
    And I am on yahoo home page
    When I search for test automation
    Then I verify search result count
    And I verify total result count
    But results should not be more than ten
    And I closed the yahoo site
#    mvn test -Dcucumber.options="--tags @yahoo"
