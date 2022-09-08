Feature: As a user I should be able to checkout a purchase

  Background: User is logged into sauce demo web page
    Given I set the user name text box with "standard_user"
    And I set the password text box with "secret_sauce"
    And I click on the login button

  Scenario: Sauce Labs Backpack checkout
    When I add sauce labs back pack product to the cart
    And I click on the cart icon
    And I click on checkout button
    And I fill the customer data with
      | Robert | Cabrera | 00000 |
    And I click on continue button
    And I click on finish button
    Then I should see a message that says "THANK YOU FOR YOUR ORDER"


  # Test 3 realizarCheckoutProductosCarrito
  Scenario: Do the checout for list product selected
    When I am in the home page
    And I add sauce labs back pack product to the cart
    And I add sauce labs bike-light product to the cart
    And I add allthethings T-shirt red product to the cart
    And I click on the cart icon
    And verify all remove buttons are displayed
    And I click on checkout button
    And I fill the customer data with
      | Robert | Cabrera | 00000 |
    And I click on continue button
    And I click on finish button
    Then I should see a message that says "THANK YOU FOR YOUR ORDER"
