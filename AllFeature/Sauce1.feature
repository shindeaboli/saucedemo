
Feature: Test the Sauce Demo application

  Scenario: validate the Login functionality
    Given user is on login page
    When user enter valid username and password
    Then user click on login button