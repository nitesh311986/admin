Feature: Verify Log out functionality

  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel

  Scenario: Verify log out feature of system
    When User clicks on Logoff button
    Then User will redirect to login page
