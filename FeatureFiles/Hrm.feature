Feature: Hrm Data Driven Test

  Scenario Outline: Test for Login of hrm
    Given Open Orangehrm application
    When User enter username "<un>" and enter password "<psw>"
    When User click on hrm Login button
    Then As per valid data user should be able to login

    Examples: 
      | un    | psw      |
      | Admin | admin123 |
      | Pooja | test123  |
      | Admin | admin123 |
