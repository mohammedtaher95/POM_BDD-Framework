Feature: User Registration
  I want to Check that the user can register in our e-commerce website.

  Scenario Outline: User Registration
    Given the user in the homepage
    When he clicks on the register link
    And enters his "<firstname>", "<lastname>", "<email>", "<password>"
    Then the registration page should be displayed successfully

    Examples:
      | firstname | lastname   | email       | password |
      | Mohammed  | Elshinnawy | test@mt.com | 1234567  |
      | Omar      | Khaled     | om@test.com | 7654321  |

