Feature: feature to test google search functionality
  
  Feature google search via selenium bdd

  Scenario: Validate google search is working
    Given browser is open
    And user is on google search page
    When user enters a test in search box
    And hits enter
    Then user navigate to search results
