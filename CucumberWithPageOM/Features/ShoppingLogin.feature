Feature: Shopping Account Login

  Background: 
    Given User is on search box

  Scenario Outline: Verify account login with valid credentials
    Given User should be in shopping cart Page
    When User Perform mouseover on home
    And User click on account
    And User enter login name "<login name>"
    And User enter login password "<login password>"
    And User click on login
    Then Verify User should navigate homepage

    Examples: 
      | login name  | login password |
      | Bustersmith |          12345 |

  Scenario Outline: Verify User checkout products
    When User enter product name "<product name>"
    And User click on Go button
    Then Verify User should navigate Womens high heel point page

    Examples: 
      | product name |
      | shoes        |

  Scenario: Verify User checkout makeup product
    When User click on search keywords box
    And User click on makeup category
    And User click on search symbol
    Then Verify User should navigate search criteria page
