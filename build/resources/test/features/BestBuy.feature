#Author: christopher.vargas@sophossolutions.com

Feature: Add a product into the shop cart
  I want to add a product into the shop cart

  Scenario: Add a product into the shop cart successfull
    Given christopher is in the home page
    When he search a "tv samsung" and adds it in the shop cart
    Then he can see the product there

