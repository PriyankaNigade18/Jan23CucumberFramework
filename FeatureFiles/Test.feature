Feature: Test Any app

  Scenario: Test App
    Given Open Crm Application
    When I enter username and password
    When I click on Login button
    Then I should able to login
