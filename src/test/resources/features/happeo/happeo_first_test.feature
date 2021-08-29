Feature: Add reaction to post in channel
  In order to find items
  As a generic user
  I want to be able to search with Google

  Background:
    Given I open happeo login page
    And I sign in

  Scenario: Happy path
    When I click channels menu button
    And I search for channel
    And I open random post
    And I add random reaction
    Then I see reaction on post