Feature: Kuwait packages
  as a user i want to open Kuwait page and check packages names
  Scenario: open Kuwait page and check packages names
    Given Home page in English
    When open Kuwait country page
    And get plans names
    Then check Kuwait Currency