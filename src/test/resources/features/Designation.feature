Feature: Designation Page Features

  Scenario: Login with valid credentials
    Given User is on login page
    Then User do login
    Then User clicks on Admin button
    Then User clicks on Designation button
    Then User clicks on Create New button
    When User enters Designation Name
    And User enters Description
    And User enters Account Number
    And User selects Approval Authority
    And User selects Status
    Then User clicks on Send For Acceptance button

