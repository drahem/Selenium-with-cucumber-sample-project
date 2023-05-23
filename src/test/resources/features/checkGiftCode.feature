Feature: KSA gift code
  as a user i want to use a gift code

  Scenario Outline: open KSA page and use gift code
    Given Home page in English
    When open KSA country page
    And open gift code page
    Then enter gift code "<code>" "<status>"

    Examples:
    | code | status  |
    | test | invalid |

