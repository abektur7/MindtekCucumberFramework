@regression @ui
Feature: Validating RedShelf application search and filter functionalities

  @RTB-7
  Scenario: Some scenario
    Given user navigates to "RedShelfApp" application
    When user searches "Purple cow" book
    And user choose first book in search result
    And user clicks on Add To Cart button
    Then user clicks on view cart button and validates book is in cart

  @RTB-8
  Scenario: Second scenario
    Given user navigates to "RedShelfApp" application
    When user searches "Java data structure" book
    Then user validates first result page having no more than 25 books.