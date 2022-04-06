Feature: Search For a Product
  I want to Search for a product and open its details page

  Scenario Outline: User can Search for product by writing in the search bar and clicks on search button
    Given The user is in the homepage
    When he writes the product name "<productName>" in the search bar and clicks on the search button
    And clicks on the product from the results page
    Then the product details page should open successfully with "<productName>"

    Examples:
      | productName               |
      | Apple MacBook Pro 13-inch |

  Scenario Outline: User can Search for product using auto-suggestion
    Given The user is in the homepage
    When he writes a keyword for the product name "<keyword>" in the search bar and clicks on the suggested result
    Then the product details page should be opened successfully with "<productName>"

    Examples:
      | keyword | productName               |
      | mac     | Apple MacBook Pro 13-inch |