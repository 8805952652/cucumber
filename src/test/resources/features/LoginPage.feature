Feature: Login Page Features

  Scenario: Login page Title verification
    Given User is on login page
    When User gets the title of the page
    Then Page title should be "Swag Labs"

  Scenario: Login with valid credentials
    Given User is on login page
    When User enters username "standard_user"
    And User enters password "secret_sauce"
    And User clicks on Login button
    And Page title should be "Swag Labs"