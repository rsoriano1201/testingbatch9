Feature: Employee Search

  Background:
    And user is logged in with valid admin credentials
    And user navigates to employee list page

  @smoke
  Scenario: Search employee by id
    When user enters valid employee id
    And click on search button
    Then user see employee information is displayed



  @smoke
  Scenario: Search employee by name
    When user enters valid employee name
    And click on search button
    Then user see employee information is displayed


