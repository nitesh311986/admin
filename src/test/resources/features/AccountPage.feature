Feature: Verify account page hyperlinks

  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
    When User clicks on account icon on left tool bar

    Scenario: All hyperlinks with icons on account page should work
      When User clicks on icon
      Then User will redirect to respected page