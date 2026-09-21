Feature: Login
  Background: Visit login page
    Given I visited login page

    Scenario: Login with valid credentials
      Given I entered username "user1@gmail.com" and password "abcd1234"
      Then I logged in successfully

  Scenario: Login with invalid credentials
    Given I entered username "user1@gmail.com" and password "abcd12dggcd34"
    Then I failed to login

  Scenario: Login without email address
    Given I entered username "" and password "abcd1234"
    Then Incomplete Message Field Displayed

  Scenario: Login without password
    Given I entered username "user1@gmail.com" and password ""
    Then Incomplete Message Field Displayed

  Scenario: Login using SQL Injection
    Given I entered username "user1@gmail.com' AND 1=1 #" and password "kjdcwbkdc"
    Then Invalid Email Message Displayed

  Scenario: Login Using Invalid Email
    Given I entered username "user1gmail.com" and password "kjdcwbkdc"
    Then Invalid Email Message Displayed
