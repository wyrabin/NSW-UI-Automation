@Login
Feature: Login
  As a user i want to login to website sauce demo

  Scenario: Normal login
    Given User open the website sauce code
    When User input "standard_user" as userName and input "secret_sauce" as password

  Scenario Outline: Invalid login
    Given User open the website sauce demo
    When User input "<userName>" as userName and input "<password>" as password
    Then User see error "<errorMassage>" on login page
    Examples:
      | userName | password | errorMassage                                                              |
      | Dicky    | 123      | Epic sadface: Username and password do not match any user in this service |
      | Dicky    |          | Epic sadface: Password is required                                        |
      |          | 123      | Epic sadface: Username is required                                        |
