@REQRES @DELETE
Feature: Testing API - DELETE

  Scenario: Delete data
    Given User Set Paramater API reqres DELETE data
    Then Status Code Should be 204 No_Content
    And Validate DELETE data json schema
