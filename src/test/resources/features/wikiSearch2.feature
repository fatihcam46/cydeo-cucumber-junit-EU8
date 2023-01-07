Feature: Wikipedia search functionality and verifications2

  Scenario: Wikipedia Search Functionality Title Verification2
    Given User is on Wikipedia home page2
    Then User clicks English wiki search button
    When User types "Robin Hood" in the English wiki search box
    And User clicks search button
    Then User sees "Robin Hood" is in the English wiki title
