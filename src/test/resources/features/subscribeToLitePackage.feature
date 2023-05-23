Feature: KSA packages
  as a user i want to open KSA page and subscribe to lite package

  Scenario Outline: open KSA page and subscribe to lite package
    Given Home page in English
    When open KSA country page
    And choose "<planName>" package
    Then payment details are correct "<price>"

    Examples:
      |planName | price             |
      | LITE     | 15.00 SAR/month  |
      | classic  | 25.00 SAR/month  |
      | PREMIUM  | 60.00 SAR/month  |
