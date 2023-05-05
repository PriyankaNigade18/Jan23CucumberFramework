Feature: Test google application

  Background: 
    Given Open Google Application

  Scenario: Test Google application Title
    When user capture title of google
    Then Title should be Google

  Scenario: Test Search Feature with valid keyword
    When User enter valid keyword in search
    Then User should get valid result
