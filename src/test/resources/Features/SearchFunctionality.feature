Feature: To validate the Flipkart Application

  Background:
    Given Launch the FlipKart Application
    When Close the popup
    Then It should Navigate to the Home page

  Scenario: To validate the Search functionality
    Given User enter the Text in the Search field
    When Click the search button
    Then It should navigate to the search result page and display the relevant details
    Then Extract the Results and print in console
    Then Print the Third result and keep it in the console

  Scenario: To validate the Search functionality By Filter
    Given User enter the Text in the Search field
    When Click the search button
    Then It should navigate to the search result page and display the relevant details
    And Select Minimum and Maximum Amount
    And Select the Brand
    And Select the Ram
    And Select the Battery Capacity
    Then It should display the relevant result

