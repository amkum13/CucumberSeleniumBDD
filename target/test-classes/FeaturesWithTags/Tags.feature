@mustRun
Feature: Feature to demo tags
  
  I want to use this template for my feature file

  @smoke
  Scenario: Sample1
    Given user is on login page

  @regression
  Scenario: Sample2
    Given user enters username and password

  @smoke @regression
  Scenario: Sample3
    Given clicks on login button

  @important
  Scenario: Sample4
    Given user is navigated to home page
