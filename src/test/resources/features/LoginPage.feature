Feature: Login Page Features

  Scenario: Login page Title verification
    Given User is on login page
    Then User clicks on login button
    When User gets the title of the page
    Then Page title should be "Chitale | MFA"

  Scenario: Login with valid credentials
    Given User is on login page
    Then User clicks on login button
    When User enters username "supervisor"
    And User enters password "Sangli1"
    Then User clicks on logon button
#    And Page title should be "CHITALE-ERP"