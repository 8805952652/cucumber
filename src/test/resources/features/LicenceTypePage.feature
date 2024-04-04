Feature: License Type Page Features


  Scenario: Create License Type
    Given User is on login page
    Then User Do Login
    When User gets the title of the DashBoardPage
    Then User click on Admin tab
    And User click on License Type tab
    And User click on Create New button
    When User enter License Type details
    Then User Click on Send For Acceptance button of License Type