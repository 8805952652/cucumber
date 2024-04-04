Feature: Unit Page Features


  Scenario: Create Unit
    Given User is on login page
    Then User Do Login
    When User gets the title of the DashBoardPage
    Then User click on Admin tab
    And User click on Unit tab
    And User click on Create Unit button
    When User enter Unit details
    Then User Click on Send For Acceptance button of Unit