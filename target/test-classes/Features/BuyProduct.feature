
Feature: Search the product increase the quantity and place the order for products 

  @PlaceOrder
  Scenario Outline: Search the product name add quantity and place the order for product
    
    Given User is on greencart home page
    When user searched with shortname <item> and extracted actual product
    And adds product to cart with quantity "3"
    Then User proceeds to checkout and validate product in checkout page
   And User has the provision to apply the <Promocode> and place the order
    
    Examples:
    |item|Promocode|
    |tom|rahulshettyacademy|
   
   

   