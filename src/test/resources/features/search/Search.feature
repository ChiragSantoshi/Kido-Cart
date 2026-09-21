Feature: Search a product
  Background: I am logged in
    Given I visited login page
    Then I entered username "user1@gmail.com" and password "abcd1234"
    And I logged in successfully

    # @search
#  Scenario: Search a product
#    Given I opened a search bar
#    When I searched for a product "Nurture Activity Books for Kids in English | Set of 2 Books with 78 DIY Activities"
#    Then Searched product is visible

  @search
  Scenario Outline: Search a product
    Given I opened a search bar
    When I searched for a product <productName>
    Then Searched product is visible <productName>

    Examples:
      | productName                                                                          |
      | "Nurture Activity Books for Kids in English \| Set of 2 Books with 78 DIY Activities" |
      | "Art and Craft - Activity Books for Kids \| Tiny Blossoms - Creativity Book C"        |
