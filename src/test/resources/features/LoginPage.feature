Feature: Login Page Features

  Scenario: Login with valid credentials
    Given User is on login page
    Then User clicks on Login button on home page
    When User enters username "supervisor"
    And User enters password "Sangli1"
    Then User clicks on Login button
    Given the user is on the homepage
    When the user clicks on Admin button
    Then the user should see a list of items
    And the user clicks on a designation






