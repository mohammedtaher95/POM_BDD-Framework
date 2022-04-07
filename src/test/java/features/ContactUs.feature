Feature: User can contact website owner

  Scenario: User can navigate to Contact Us page and send a message
    Given the user in the homepage
    When he clicks on Contact us link
    And Submits his Full Name, Email, and Address in the form
    Then a success message should be displayed after submitting the form

