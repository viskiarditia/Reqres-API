@REQRES @DELETE
Feature: Testing API - DELETE

#Positive Case
  Scenario: Delete data
    Given User Set Paramater API reqres DELETE data
    Then Status Code Should be 200 OK


