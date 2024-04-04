Feature: Employee Basic Details Features


  Scenario: Create Employee Basic Details
    Given User is on login page
    Then User Do Login
    When User gets the title of the DashBoard Page
    Then User click on Admin tab .
    Then User click on Employee tab
    And User click on Basic Details tab
    When User gets employee list
    Then click on Create New button of Employee basic details
    When User enter Essential Information fields
    Then User click on Next button
#    Then User enter Address Details Fields
#    And Click on Send For Acceptance button of Employee
