@Test
Feature: UI Automation for search feature service.nsw

  Scenario: Search by text to navigate to appropriate page
    Given Open service.nsw homepage
    When User click search field
    And Input text "Apply for a number plate"
    And Press enter search
    Then Validate the navigation to appropriate page
