Author
#Date
#Description



@Smokefeature
Feature: feature to test login functionality
@smoketest
  Scenario: Check login is succesful with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to home page
