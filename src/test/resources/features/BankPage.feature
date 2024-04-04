Feature: Bank Page Features


  Scenario: Create Bank
    Given User is on login page
    Then User Do Login
    When User gets the title of the DashBoard Page
    Then User click on Admin tab
    Then User click on Bank tab
    When User gets bank list
    Then User click on Create New button of bank
    When User enter bank details fields
    Then Click on Send For Acceptance button
