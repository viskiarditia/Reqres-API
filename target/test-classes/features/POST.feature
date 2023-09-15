@REQRES @POST
Feature: Testing API - POST

  Scenario: Post CREATE
    Given User Set Paramater API reqres Post CREATE
    Then Status Code Should be 201 Created
    And Validate Post CREATE json schema

  Scenario: Post REGISTER - SUCCESSFUL
    Given User Set Paramater API reqres Post REGISTER - SUCCESSFUL
    Then Status Code Should be 200 OK
    And Validate Post REGISTER - SUCCESSFUL json schema

  Scenario: Post REGISTER - UNSUCCESSFUL
    Given User Set Paramater API reqres Post REGISTER - UNSUCCESSFUL
    Then Status Code Should be 400 Bad_Request
    And Validate Post REGISTER - UNSUCCESSFUL json schema

  Scenario: Post LOGIN - SUCCESSFUL
    Given User Set Paramater API reqres Post LOGIN - SUCCESSFUL
    Then Status Code Should be 200 OK
    And Validate Post LOGIN - SUCCESSFUL json schema

  Scenario: Post LOGIN - UNSUCCESSFUL
    Given User Set Paramater API reqres Post LOGIN - UNSUCCESSFUL
    Then Status Code Should be 400 Bad_Request
    And Validate Post LOGIN - UNSUCCESSFUL json schema