Feature: License Page Features


  Scenario: Create License
    Given User is on login page
    Then User Do Login
    When User gets the title of the DashBoardPage
    Then User click on Admin tab
    And User click on License tab
    And User click on Create New Button
    When User enter License details
    Then User Click on Send For Acceptance button of License