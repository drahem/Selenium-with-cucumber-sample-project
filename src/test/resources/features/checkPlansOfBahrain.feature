Feature: Bahrain packages
  as a user i want to open Bahrain page and check packages names
  Scenario: open Bahrain page and check packages names
    Given Home page in English
    When open Bahrain country page
    And get plans names
    Then check Bahrain Currency