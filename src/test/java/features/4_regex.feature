@regex
Feature: RegEx Features
  In order to learn cucumber regex
  As a user
  I want to verify few steps

  Scenario: Regex and passing List
    Given I have 1000 rupees in my account with "HDFC" bank
    When I withdraw 600 rupees
    Then I have a balance of 400 rupees
    Given I have account in "CITY, ICICI, HDFC"
    When I close "ICICI" account
    Then I have left with "CITY, HDFC" account
