Feature: KSA packages
  as a user i want to open KSA page and check packages names

  Scenario Outline: open KSA page and check packages names
    Given Home page in English
    When open KSA country page
    And get plans names "<planName>" "<id>"
    Then check KSA Currency "<price>" "<id>"

    Examples:
    |id | planName | price        |
    | 0 | LITE     | 15 SAR/month |
    | 1 | CLASSIC  | 25 SAR/month |
    | 2 | PREMIUM  | 60 SAR/month |

