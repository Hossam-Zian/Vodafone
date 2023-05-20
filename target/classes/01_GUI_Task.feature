@smoke
Feature:Purchase product
  Scenario:User browse site for product
    Given user navigate to Vodafone shop site
    And Select language as English.
    And move to Brand section and select Iphone.
    When Select any of returned iphone mobiles.
    And Press add to cart.
    And Press Proceed to Checkout.
    And Select Delivery Options as Cairo Ain Shams.
    And Select Deliver to My Address.
    And Add address details.
    And confirm shipping address.
    And Leave Personal info Tab empty.
    And confirm personal info.
    Then  an error message returned from Full Name field.


