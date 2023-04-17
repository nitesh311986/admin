Feature: Verify DashBoard Items

  Background:
  Given User should log in with username "sa" and password "Good2go@2019" to the admin panel

  Scenario Outline: Verify all details of dashboard
    Then User is able to see tag "<client>" and number of total client "<tclient>" and monthly client "<mclient>"
    Then User is able to see tag "<quote>" and number of total quote "<tquote>" and monthly quote "<mquote>"
    Then User is able to see tag "<policy>" and number of total policy "<tpolicy>" and monthly policy "<mpolicy>"
    Then User is able to see tag "<claim>" and number of total claim "<tclaim>" and monthly claim "<mclaim>"
    Examples:
      |client|tclient|mclient|quote|tquote|mquote|policy|tpolicy|mpolicy|claim|tclaim|mclaim|
      |Client|18677|0|Quote|41902|28|Policy|19078|24|Claim|149|5|










