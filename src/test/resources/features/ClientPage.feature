Feature: Verify Data Of Manage Client Page


  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel

  Scenario: User will redirect to manage client page after clicking on client icon on left tool bar
    When User clicks on client icon on left tool bar
    Then User will see client details