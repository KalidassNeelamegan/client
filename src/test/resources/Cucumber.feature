@tag
Feature: To validate facebook application
 
  @tag1
  Scenario: To validate login functionality
    Given  user launches facebook application
    When user enters valid credentials 
       |username| Kalidass |
       |password| 12345678 |
    Then user should be navigated to home page
   
 