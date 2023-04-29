@Test
Feature: UI Automation for locate service centre service.nsw

  Scenario Outline: Locate service centre by suburb
    Given Open service.nsw homepage
    When User click on find location menu
    And Click on search by suburb field
    And Input "<suburb>" in search box
    And Press enter suburb
    Then Validate user can see "<serviceCentre>"
    Examples:
      | suburb                       | serviceCentre               |
      | Sydney 2000                  | Marrickville Service Centre |
      | Sydney Domestic Airport 2020 | Rockdale Service Centre     |


