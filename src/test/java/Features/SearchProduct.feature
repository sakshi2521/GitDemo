
Feature: Search and place the order for products 

  @SearchProduct
  Scenario Outline: Search experience for product search in both the home and offers page
    
    Given User is on greencart home page
    When user searched with shortname <item> and extracted actual product
    Then user searched for same shortname <item> in offers page 
    And validate if it is same as in the home page product
    
    Examples:
    |item| 
    |Tom|
    |Pot|
    |beet|
   
   

 