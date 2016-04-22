@outline
Feature: Wiki multiple login user
  In order to test wiki login
  As a login user
  I want to login with multiple valid users

  Scenario Outline: Login
    Given I am on wiki main page
    When I enters "<Username>" in username field
    And I enters "<Password>" in password field
    And I click on login button
    Then I will be on wiki home page
    Then I close application

    Examples: 
      | Username       | Password  |
      | sheetal0123    | India@123 |
      | testaccount888 | Xebia@123 |
