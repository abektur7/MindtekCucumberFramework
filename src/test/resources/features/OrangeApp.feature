Feature: Validating Orange application create and strong password
  @RTB
  Scenario: Validating create employee
    Given user navigates to "Orange" application
    When user enters username "Admin" and password "admin123" and clicks on login button
    And on "PIM" creates new employee with data and clicks save button
    |firstname|lastname|
    |Alina    |Nadyr   |
    And On personal information page clicks save button
    Then validates new employee "Alina" is created

