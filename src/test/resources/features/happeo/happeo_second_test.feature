Feature: Create post
  In order to find items
  As a generic user
  I want to be able to search with Google

  Background:
    Given I open happeo login page
    And I sign in

  Scenario: Create post happy path
    When I click channels menu button
    And I search for channel
    And I create post
    Then I see new post