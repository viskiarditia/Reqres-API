@REQRES @PUT
Feature: Testing API - PUT

  Scenario: Put UPDATE
    Given User Set Paramater API reqres Post UPDATE
    Then Status Code Should be 201 Created
    And Validate Post UPDATE json schema