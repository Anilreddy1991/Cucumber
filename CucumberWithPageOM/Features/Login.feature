Feature: Login

  Scenario Outline: Verify user login with valid credentials
    Given User should be in login page
    When User enter username "<username>"
    And User enter password "<password>"
    And User click on "<button>"
    Then Verify User should navigate to home page

    Examples: 
      | username | password | button  |
      |     1234 |     1234 | Sign In |
