@REQRES @PATCH
Feature: Testing API - PATCH

  Scenario: Patch UPDATE
    Given User Set Paramater API reqres Patch UPDATE
    Then Status Code Should be 200 OK
    And Validate Post UPDATE json schema
