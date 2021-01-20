Feature: Driving license form

  Scenario: Verify User apply online for new of driving licence
    Given User should be in driving licence
    When User enter email address "anil2521@gmail.com"
    And User enter phone number "9660636220"
    And User select radio button option "Driving License"
    And User enter applicant name "guru"
    And User select relation option "Father"
    And User click on accept terms and order
    Then User should navigate to Razorpay Checkout page
