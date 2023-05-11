Feature: KSA packages
  as a user i want to open KSA page and check packages names
  Scenario: open KSA page and check packages names
    Given Home page in English
    When open KSA country page
    And get plans names
    Then check KSA Currency