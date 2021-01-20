Feature: Product type

  Background: 
    Given User should be in homepage

  Scenario: Verify product type
    When User select product type option "Beverages"
    And User select product "Guarana Fantastica"
    And User click on view datails
    Then Verify User should navigate Product Detail page

  Scenario: Verify shipping product
    When User perform mouseover on shipping
    And User click on usps
    And User perform mouseover on quick tools
    And User click on find usps locations
    Then User should navigate to PO Locator page
