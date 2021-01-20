Feature: Login

  @smoke
  Scenario: Verify user login with valid credentials
    Given User should be in login page
    When User enter username "1234"
    And User enter password "1234"
    And User click on login button
    Then Verify User should navigate to home page
