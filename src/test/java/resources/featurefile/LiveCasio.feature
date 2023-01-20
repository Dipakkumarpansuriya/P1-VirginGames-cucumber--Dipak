
Feature:  Login page

  Scenario: As a user I want to click on login tab
    Given I am on Virgin games homepage
    When I acceptCookies
    And I am clicking on All Games link
    Then I am on All Games page
    And  I verify the text "Online Slots"