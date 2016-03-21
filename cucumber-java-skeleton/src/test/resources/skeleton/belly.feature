Feature: Belly

  Scenario: a few cukes
    Given I have 42 cukes in my belly
    When I wait 1 hour
    Then my belly should growl
    Then I should have digested 42 items
    Then I go to sleep for 10 seconds

