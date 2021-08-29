Feature: Create page
  In order to find items
  As a generic user
  I want to be able to search with Google

  Background:
    Given I open happeo login page
    And I sign in

  Scenario: Happy path
    When I open pages in menu
    And I search for page "This Page Group"
    And I click first found page
    And I click edit button
    And I click manage button
    And I click three dots button
    And I put "Test Zuzana" for new page
    And I click create new page button
    Then I see new page