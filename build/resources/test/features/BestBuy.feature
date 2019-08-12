#Author: christopher.vargas@sophossolutions.com
Feature: Add a product into the shop cart
  Christopher wants to add a product into the shop cart
  

    

  Scenario Outline: Add a product into the shop cart successfull
    Given christopher is in the home page
    When he searchs a <producto> and adds it in the shop cart
    Then he can see the product there <resultado busqueda>

    Examples: 
      | producto                                | resultado busqueda         																					 |
      | "Samsung - Pantalla Plana - HD - Negro" | "Samsung - Pantalla De 32 - Plana - HD - Negro Se Agreg Al Carrito." |
