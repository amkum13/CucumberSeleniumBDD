Feature: simple login feature on example.testproject.io/web
  
  Login test on example.testproject.io/web

  #Scenario: Validate simple login automation steps
  Scenario Outline: Validate simple login automation steps
    Given webbrowser is open
    And user is now on login page
    #When user enters his username and password
    When user enters his <username> and <password>
    And login button is pressed
    Then user navigated to home page

    Examples: 
      | username | password |
      | Amit     |    12345 |
      | Ele      |    12345 |
