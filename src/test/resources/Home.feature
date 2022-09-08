Feature: As a user I should be able to see all the available items in the home page

  Background: User is logged into sauce demo web page
    Given I set the user name text box with "standard_user"
    And I set the password text box with "secret_sauce"
    And I click on the login button

  Scenario Outline: Products are available in the home page
    When I am in the home page
    Then I verify that "<product>" is displayed
    Examples:
      | product               |
      | Sauce Labs Backpack   |
      | Sauce Labs Bike Light |


 #   Test 1 HomePage
  Scenario Outline: Verify if T-Shirt Red is Visible in HomePage
    When I am in the home page
    Then I verify that "<product>" is displayed
    Examples:
      | product                           |
      | Test.allTheThings() T-Shirt (Red) |

  # Test 2 agregarProductosAlCarrito
  Scenario: Vefify add products to shopping cart
    When I am in the home page
    And I add sauce labs back pack product to the cart
    And I add sauce labs bike-light product to the cart
    And I add allthethings T-shirt red product to the cart
    And I click on the cart icon
    Then verify all remove buttons are displayed

  # Test 4 eliminarProductosDelCarritoDesdeHomePage
  Scenario: Delete products from the HomePage
    When I am in the home page
    And I add sauce labs back pack product to the cart
    And I add sauce labs bike-light product to the cart
    And I add allthethings T-shirt red product to the cart
    And I click on the cart icon
    And verify all remove buttons are displayed
    And I click on continue shopping button
    And I click on remove AllTheThing TShirt button
    And I click on the cart icon
    Then verify all remove buttons are displayed just two selected options

  # Test 5 eliminarProductosDesdeElCarrito
  Scenario: Delete products from the Checkout
    When I am in the home page
    And I add sauce labs back pack product to the cart
    And I add sauce labs bike-light product to the cart
    And I add allthethings T-shirt red product to the cart
    And I click on the cart icon
    And verify all remove buttons are displayed
    And I click on remove AllTheThing TShirt button from YourCart
    And I click on continue shopping button
    Then verify add AllTheThing TShirt button is visible