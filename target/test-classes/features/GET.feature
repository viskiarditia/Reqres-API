@REQRES @GET
Feature: Testing API - GET

#Positive Case
  Scenario: Get LIST USER
    Given User Set Paramater API reqres get LIST USERS
    Then Status Code Should be 200 OK
    And Validate get LIST USERS json schema

  Scenario: Get SINGLE USER
    Given User Set Paramater API reqres get SINGLE USER
    Then Status Code Should be 200 OK
    And Validate get SINGLE USER json schema

  Scenario: Get SINGLE USER NOT FOUND
    Given User Set Paramater API reqres get SINGLE USER NOT FOUND
    Then Status Code Should be 404 Not_Found
    And Validate get SINGLE USER NOT FOUND json schema

  Scenario: Get LIST <RESOURCE>
    Given User Set Paramater API reqres get LIST RESOURCE
    Then Status Code Should be 200 OK
    And Validate get LIST RESOURCE json schema

  Scenario: Get SINGLE <RESOURCE>
    Given User Set Paramater API reqres get SINGLE RESOURCE
    Then Status Code Should be 200 OK
    And Validate get SINGLE RESOURCE json schema

  Scenario: Get SINGLE <RESOURCE> NOT FOUND
    Given User Set Paramater API reqres get SINGLE RESOURCE NOT FOUND
    Then Status Code Should be 404 Not_Found
    And Validate get SINGLE RESOURCE NOT FOUND json schema

  Scenario: Get DELAYED RESPONSE
    Given User Set Paramater API reqres get DELAYED RESPONSE
    Then Status Code Should be 200 OK
    And Validate get DELAYED RESPONSE json schema

