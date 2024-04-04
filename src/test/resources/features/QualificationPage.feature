Feature: Qualification Page Features


  Scenario: Create Qualification
    Given User is on login page
    Then User Do Login
    Then User click on Admin tab.
    Then User click on qualification tab
    When User gets qualification list
    Then User click on Create New button of qualification
    When User enter qualification details fields
    Then Click on Send For Acceptance button of qualification
