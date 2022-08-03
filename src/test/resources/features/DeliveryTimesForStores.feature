Feature: Find Stores and Delivery Times

  Scenario: Get the delivery times for all the stores
    Given the user is on Instacart home page
    When the user clicks on Show all button
    Then the delivery times should be displayed for all the stores
