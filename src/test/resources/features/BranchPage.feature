Feature: Branch Page Features


  Scenario: Create Branch
    Given User is on login page
    Then User Do Login
    When User gets the title of the DashBoardPage
    Then User click on Admin tab
    And User click on firm tab
    And User click on branch button
    And User click on Create Branch button
    When User enter branch details
    Then User Click on Send For Acceptance button
