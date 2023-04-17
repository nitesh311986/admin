Feature: Verify Available Data And Functionality On Approve Page

  Background:
    Given User should log in with username "sa" and password "Good2go@2019" to the admin panel
    When User clicks on approve claims icon on left tool bar

  Scenario: User redirects to approve claim page after clicking on approve claim icon on dashboard page
    Then User will redirect to page with "Approve Claims" message on it
    And User will able to see data on approve claims page