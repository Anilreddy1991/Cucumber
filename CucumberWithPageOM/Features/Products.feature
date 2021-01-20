Feature: products

  @smoke
  Scenario Outline: Verify order products
    Given User should be in home page
    When User perform mouseover on products
    And User click on beverages
    And User click on chai product
    And User click on order
    And User click on edit your cart
    And User remove cote de blaye product
    And User click on next
    And User enter firstname "<firstname>"
    And User enter lastname "<lastname>"
    And User enter companyname "<companyname>"
    And User enter street address "<street address>"
    And User enter zip code "<zip code>"
    And User enter area code "<area code>"
    And User enter primary phone "<primary phone>"
    And User click on Ship to Billing Address
    And User click on next1
    And User select card type option "<card type>"
    And User enter Security Code "<security code>"
    And User enter Card Number "<card number>"
    And User select Expiration Month option "<Expiration Month>"
    And User select Expiration Year option "<Expiration Year>"
    And User click on Submit
    Then Verify User should navigate Thank you for placing an order with ACME!

    Examples: 
      | firstname | lastname | companyname | street address | zip code | area code | primary phone | card type  | security code | card number | Expiration Month | Expiration Year |
      | anil      | reddy    | capgemini   | chinna chowk   |   516002 |      2233 |    9880636440 | Mastercard |         22556 | 24235346456 | January          |            2016 |
