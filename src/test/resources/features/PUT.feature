@REQRES @PUT
Feature: Testing API - PUT

  Scenario: Put UPDATE
    Given User Set Paramater API reqres Post UPDATE
    Then Status Code Should be 200 OK
    And Validate Put UPDATE json schema