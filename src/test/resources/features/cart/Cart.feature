Feature: Cart
  @AddToCart
  Scenario: Product added in cart
    Given I visited login page
    Then I entered username "user1@gmail.com" and password "abcd1234"
    And I logged in successfully
    When I clicked on study materials tab
    And Opened random product from study material tab
    And I added product to cart
    Then Successfully added to cart message was visible
    And I opened cart
    Then Added product was visible in cart

