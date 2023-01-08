@CheckOut
Feature: Feature check out
  description feature

  Scenario: User purchases 2 items until the order is successful
    Given User open the website sauce demo
    When User input "standard_user" as userName and input "secret_sauce" as password
    And User sort product list by name z to a
    And User pick item Sauce Labs Backpack
    And User pick item sauce labs fleece jacket
    And User click total item on basket
    Then System display item list from cartpage
    And User click checkout button on cartpage
    When User input "Binta Wira" as firstName and input "Nasrullah" as lastName and input "66352" as postalCode
    Then Verify total price is "Total: $62.62"
    And User click finish button to checkout
    And Display massage THANK YOU FOR YOUR ORDER
