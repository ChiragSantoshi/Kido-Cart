Feature: Exclusive Products Section
  Background: I am logged in
    Given I visited login page
    Then I entered username "user1@gmail.com" and password "abcd1234"
    And I logged in successfully


  @ExclusiveProducts
  Scenario: Validate number of products featured
    Given I clicked on study materials tab
    Then Only required number of products featured on study material tab