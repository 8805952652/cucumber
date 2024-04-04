Feature: Firm Page Features


  Scenario: Create firm
    Given User is on login page
    Then User Do Login
    When User gets the title of the DashBoardPage
    Then User click on Admin tab
    Then User click on firm tab
    When User gets firm list
    Then click on Create New button
    When User enter basic details fields
#    Then Click on Next button
