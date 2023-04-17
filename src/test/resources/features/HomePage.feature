Feature:Launched Page Verification by displayed text

  Background:
    Given User is one the website login page

  Scenario: Check displayed text on homepage
    When User verify url "http://52.32.106.250:7779/"
    Then User will able to see text "(en-GB)" behind copyright message