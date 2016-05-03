@background
Feature: Wiki Sanity with login user
  In order to test wiki 
  As a login user
  I want to do general sanity

  Background: 
    Given I am on wiki main page
    When I login with default credentials
    Then I will be on wiki home page

  Scenario: 
    When I click on talk tab
    Then I verify talk search button
    And I close application

  Scenario: 
    When I click on Contents link
    Then I verify Nature redirect link
    And I close application
