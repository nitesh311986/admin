Feature:Login To Admin Panel

  Background:
    Given User is one the website login page
    And User enters username "sa" and password "Good2go@2019" and click signIn button

  Scenario: Verify Login event
    Then User will be able to see dashBoard
    And User will be able to see "(en-GB)" text on right top corner of page





