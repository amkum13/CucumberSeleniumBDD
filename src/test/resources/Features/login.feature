Feature: feature to test login functionality
  
  I want to to test the login functionality

  Scenario: Check login is successfull with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to home page
