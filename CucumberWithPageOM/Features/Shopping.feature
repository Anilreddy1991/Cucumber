Feature: Online shopping

  Scenario: Verify User checkout T-shirts
    Given User should be in my account page
    When User perform mouseover on ITEMS
    And User click on view cart
    And User click on continue
    Then Verify User should navigate A place to practice your automation skills! page
